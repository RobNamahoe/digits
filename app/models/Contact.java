package models;

import java.util.ArrayList;
import java.util.List;

/**
 * Representation of a contact.
 */
public class Contact {

  private long id;
  private String firstName;
  private String lastName;
  private String telephone;
  private TelephoneType telephoneType;
  private String address;
  private List<DietType> dietTypes;

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
  public Contact(long id, String firstName, String lastName, String telephone, TelephoneType telephoneType,
                 String address, List<DietType> dietTypes) {
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
  public TelephoneType getTelephoneType() {
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
  public List<DietType> getDietTypes() {
    return dietTypes;
  }


  /**
   * Gets the contacts diet types as a string.
   * @return A string representing the contacts diet types.
   */
  public String getDietTypesAsString() {
    String dietType = "";
    for (DietType type : dietTypes) {
      dietType += type.getDietType() + ", ";
    }

    dietType = dietType.trim();
    if (dietType.length() > 2) {
      dietType = dietType.substring(0, dietType.length() - 1);
    }

    return dietType;

  }

  /**
   * Sets the id.
   * @param id The id value.
   */
  public void setId(long id) {
    this.id = id;
  }

  /**
   * Sets the first name value.
   * @param firstName The first name value.
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * Sets the last name value.
   * @param lastName The last name.
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * Sets the telephone value.
   * @param telephone The telephone value.
   */
  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  /**
   * Sets the telephone type.
   * @param telephoneType The telephone type.
   */
  public void setTelephoneType(TelephoneType telephoneType) {
    this.telephoneType = telephoneType;
  }

  /**
   * Sets the address.
   * @param address The address.
   */
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * Sets the diet type.
   * @param dietTypes The diet type.
   */
  public void setDietTypes(List<DietType> dietTypes) {
    this.dietTypes = dietTypes;
  }

  /**
   * Returns a list of DietType string for this contact.
   * @return The list of diet type strings.
   */
  public List<String> getDietTypesList() {
    List<String> dietList = new ArrayList<>();
    for (DietType dietType : dietTypes) {
      dietList.add(dietType.getDietType());
    }
    return dietList;
  }


}
