package models;

import views.formdata.ContactFormData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A simple in memory repo to store contacts.
 */
public class ContactDB {

  private static long currentId = 1;
  private static Map<Long, Contact> contacts = new HashMap<>();

  private static Map<String, TelephoneType> telephoneTypes = new HashMap<>();
  private static Map<String, DietType> dietTypes = new HashMap<>();


  /**
   * Adds a new contact to the database.
   * @param data The form data for the new contact.
   */
  public static void addContact(ContactFormData data) {
    long id = (data.id == 0) ? currentId++ : data.id;
    TelephoneType telephoneType = getTelephoneType(data.telephoneType);
    List<DietType> dietType = new ArrayList<>();
    for (String dietString : data.dietTypes) {
      dietType.add(getDietType(dietString));
    }
    contacts.put(id, new Contact(id, data.firstName, data.lastName, data.telephone, telephoneType,
        data.address, dietType));
  }


  /**
   * Gets the contact with the specified id.
   * @param id The id of the contact to retrieve.
   * @return The Contact.
   */
  public static Contact getContact(long id) {
    Contact contact = contacts.get(id);
    if (contact == null) {
      throw new RuntimeException("A contact with that id cannot be found.");
    }
    return contact;
  }


  /**
   * Gets a list of the current contacts.
   * @return A list of current contacts.
   */
  public static List<Contact> getContacts() {
    return new ArrayList<>(contacts.values());
  }

  /**
   * Adds a diet type to the map.
   * @param type The diet type to add.
   */
  public static void addDietType(DietType type) {
    dietTypes.put(type.getDietType(), type);
  }

  /**
   * Adds a telephone type to the map.
   * @param type The telephone type to add.
   */
  public static void addTelephoneType(TelephoneType type) {
    telephoneTypes.put(type.getTelephoneType(), type);
  }

  /**
   * Gets the specified diet type instance.
   * @param type The diet type to retrieve.
   * @return The diet type.
   */
  public static DietType getDietType(String type) {
    DietType dietType = dietTypes.get(type);
    if (dietType == null) {
      throw new RuntimeException("That is an invalid diet type.");
    }
    return dietType;
  }

  /**
   * Gets the specified telephone type.
   * @param type The telephone type to retrieve.
   * @return The telephone type.
   */
  public static TelephoneType getTelephoneType(String type) {
    TelephoneType telephoneType = telephoneTypes.get(type);
    if (telephoneType == null) {
      throw new RuntimeException("That is an invalid telephone type.");
    }
    return telephoneType;
  }

}
