package Models;

/**
 * A private class that represents a contact.
 */
public class Contact {

  String firstName = "";
  String lastName = "";
  String telephone = "";

  /**
   * Constructor methods - creates a new contact with the supplied info.
   * @param firstName The contacts first name.
   * @param lastName The contacts last name.
   * @param telephone The contacts telephone number.
   */
  public Contact(String firstName, String lastName, String telephone) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.telephone = telephone;
  }

  /**
   * Getter method for first name.
   * @return The contacts first name.
   */
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * Getter method for last name.
   * @return The contacts last name.
   */
  public String getLastName() {
    return this.lastName;
  }

  /**
   * Getter method for telephone.
   * @return The contacts telephone number.
   */
  public String getTelephone() {
    return this.telephone;
  }

}


