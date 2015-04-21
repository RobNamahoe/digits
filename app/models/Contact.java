package models;

import java.util.List;

/**
 * Representation of a contact.
 */
public class Contact {

  private long id;
  private String firstName;
  private String lastName;
  private String telephone;
  private String telephoneType;
  private String address;
  private List<String> dietTypes;

  /**
   * Creates a new contact instance.
   * @param id The contacts id.
   * @param firstName The contacts first name.
   * @param lastName The contacts last name.
   * @param telephone The contacts telephone number.
   * @param telephoneType The contacts telephone type.
   * @param address The contacts address.
   * @param dietTypes The contacts diet type.
   */
  public Contact(long id, String firstName, String lastName, String telephone, String telephoneType,
                 String address, List<String> dietTypes) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.telephone = telephone;
    this.telephoneType = telephoneType;
    this.address = address;
    this.dietTypes = dietTypes;
  }

  /**
   * Gets the contacts id.
   * @return The id.
   */
  public long getId() {
    return id;
  }

  /**
   * Gets the contacts first name.
   * @return The contacts first name.
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Gets the contacts last name.
   * @return The contacts last name.
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Gets the contacts telephone number.
   * @return The contacts telephone number.
   */
  public String getTelephone() {
    return telephone;
  }

  /**
   * Gets the contacts telephone type.
   * @return The contacts telephone type.
   */
  public String getTelephoneType() {
    return telephoneType;
  }

  /**
   * Gets the contacts address.
   * @return The contacts address.
   */
  public String getAddress() {
    return address;
  }


  /**
   * Gets the contacts selected diet types.
   * @return A list of the selected diet types.
   */
  public List<String> getDietTypes() {
    return dietTypes;
  }


  /**
   * Gets the contacts diet types as a string.
   * @return A string representing the contacts diet types.
   */
  public String getDietTypesAsString() {
    String dietType = "";
    for (String type : dietTypes) {
      dietType += type + ", ";
    }

    dietType = dietType.trim();
    if (dietType.length() > 2) {
      dietType = dietType.substring(0, dietType.length() - 1);
    }
    return dietType;

  }


}
