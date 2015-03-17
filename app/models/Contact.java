package models;

/**
 * Representation of a contact.
 */
public class Contact {

  private long id;
  private String firstName;
  private String lastName;
  private String telephone;
  private String address;

  /**
   * Gets the contacts is.
   * @return The contacts id.
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
   * Gets the contacts address.
   * @return The contacts address.
   */
  public String getAddress() {
    return address;
  }

  /**
   * Sets the id value.
   * @param id The new id value.
   */
  public void setId(long id) {
    this.id = id;
  }

  /**
   * Sets the contacts first name.
   * @param firstName The contacts first name.
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * Sets the contacts last name.
   * @param lastName The contacts last name.
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * Sets the contacts telephone number.
   * @param telephone The contacts telephone number.
   */
  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  /**
   * Sets the contacts address.
   * @param address The contacts address.
   */
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * Creates a new contact instance.
   * @param id The contacts id.
   * @param firstName The contacts first name.
   * @param lastName The contacts last name.
   * @param telephone The contacts telephone number.
   * @param address The contacts address.
   */
  public Contact(long id, String firstName, String lastName, String telephone, String address) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.telephone = telephone;
    this.address = address;
  }
}
