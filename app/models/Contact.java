package models;

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

  /**
   * Creates a new contact instance.
   * @param id The contacts id.
   * @param firstName The contacts first name.
   * @param lastName The contacts last name.
   * @param telephone The contacts telephone number.
   * @param telephoneType The contacts telephone type.
   * @param address The contacts address.
   */
  public Contact(long id, String firstName, String lastName, String telephone, String telephoneType, String address) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.telephone = telephone;
    this.telephoneType = telephoneType;
    this.address = address;
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


}
