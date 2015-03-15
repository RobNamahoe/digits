package views.formdata;

import play.data.validation.ValidationError;

import java.util.ArrayList;
import java.util.List;

/**
 * A backing class for the new contact form.
 */
public class ContactFormData {

  private static final int NUM_TELEPHONE_DIGITS = 12;

  /** The first name field. */
  public String firstName = "";

  /** The last name field. */
  public String lastName = "";

  /** The telephone number field. */
  public String telephone = "";


  /**
   * A validation method for the new contact form.
   * @return A list of errors, if any exist.
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

    if (telephone.length() != NUM_TELEPHONE_DIGITS) {
      errors.add(new ValidationError("telephone", "Digits must be in the format xxx-xxx-xxxx."));
    }

    return errors.isEmpty() ? null : errors;
  }
}
