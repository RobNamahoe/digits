package views.formdata;

import models.Contact;
import play.data.validation.ValidationError;

import java.util.ArrayList;
import java.util.List;

/**
 * A backing class for the new contact form.
 */
public class ContactFormData {

  private static final int DIGIT_LENGTH = 12;
  private static final int ADDRESS_LENGTH = 24;

  /** The id value. */
  public long id;

  /** The first name field. */
  public String firstName = "";

  /** The last name field. */
  public String lastName = "";

  /** The telephone number field. */
  public String telephone = "";

  /** The address text for the contact. */
  public String address = "";

  /** The telephone type for the contact. */
  public String telephoneType = "";

  /** The diet types for the contact. */
  public List<String> dietTypes = new ArrayList<>();

  /**
   * Constructs a ContactFormData instance with no args.
   */
  public ContactFormData() {
    // No args constructor method.
  }

  /**
   * Constructs a ContactFormData instance from the given contact.
   * @param contact The contact.
   */
  public ContactFormData(Contact contact) {
    this.id = contact.getId();
    this.firstName = contact.getFirstName();
    this.lastName = contact.getLastName();
    this.telephone = contact.getTelephone();
    this.telephoneType = contact.getTelephoneType().getTelephoneType();
    this.address = contact.getAddress();
    this.dietTypes = contact.getDietTypesList();
  }


  /**
   * Creates a ContactFormData instance.
   * @param firstName The first name.
   * @param lastName The last name.
   * @param telephone The telephone.
   * @param telephoneType The telephone type.
   * @param address The address.
   * @param dietTypes The contacts selected diet types.
   */
  public ContactFormData(String firstName, String lastName, String telephone,
                         String telephoneType, String address, List<String> dietTypes) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.telephone = telephone;
    this.telephoneType = telephoneType;
    this.address = address;
    this.dietTypes = dietTypes;
  }

  /**
   * Ensure appropriate input is entered into the New Contact form.
   * @return A list of validation errors, if any.
   */
  public List<ValidationError> validate() {
    List<ValidationError> errors = new ArrayList<>();

    if (firstName == null || firstName.length() == 0) {
      errors.add(new ValidationError("firstName", "First Name cannot be blank."));
    }

    if (lastName == null || lastName.length() == 0) {
      errors.add(new ValidationError("lastName", "Last Name cannot be blank."));
    }

    if (telephone == null || telephone.length() == 0) {
      errors.add(new ValidationError("telephone", "Digits cannot be blank."));
    }

    if (telephone.length() != DIGIT_LENGTH) {
      errors.add(new ValidationError("telephone", "Digits must follow the format xxx-xxx-xxxx."));
    }

    if (!TelephoneTypes.isType(telephoneType)) {
      errors.add(new ValidationError("telephoneType", "That is an invalid telephone type."));
    }

    if (address == null || address.length() == 0) {
      errors.add(new ValidationError("address", "Address cannot be blank."));
    }

    if (address.length() <= ADDRESS_LENGTH) {
      errors.add(new ValidationError("address", "Address must be at least 24 characters long."));
    }

    for (String dietType : dietTypes) {
      if (!DietTypes.isType(dietType)) {
        errors.add(new ValidationError("dietType", "That is an invalid diet type."));
      }
    }

    return errors.isEmpty() ? null : errors;
  }


}
