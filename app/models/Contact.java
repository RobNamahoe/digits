package models;

/**
 * Representation of a Contact.
 */
public class Contact {

  private String firstName;
  private String lastName;
  private String telephone;

  /**
   * Creates a Contact object with the given attributes.
   * @param firstName The contacts first name.
   * @param lastName The contacts last name.
   * @param telephone The contacts telephone.
   */
  public Contact(String firstName, String lastName, String telephone) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.telephone = telephone;
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
}
