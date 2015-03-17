package models;

/**
 * Representation of a contact.
 */
public class Contact {

  private String firstName;
  private String lastName;
  private String telephone;
  private String address;

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
   * Gets the contacts address.
   * @return The contacts address.
   */
  public String getAddress() {
    return address;
  }

  /**
   * Creates a new contact instance.
   * @param firstName The contacts first name.
   * @param lastName The contacts last name.
   * @param telephone The contacts telephone number.
   * @param address The contacts address.
   */
  public Contact(String firstName, String lastName, String telephone, String address) {

    this.firstName = firstName;
    this.lastName = lastName;
    this.telephone = telephone;
    this.address = address;
  }
}
