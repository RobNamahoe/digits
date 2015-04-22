package models;

import views.formdata.ContactFormData;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple in memory repo to store contacts.
 */
public class ContactDB {

  //private static long currentId = 1;
  //private static Map<Long, Contact> contacts = new HashMap<>();
  //private static Map<String, TelephoneType> telephoneTypes = new HashMap<>();
  //private static Map<String, DietType> dietTypes = new HashMap<>();

  /**
   * Adds a new contact to the database.
   * @param data The form data for the new contact.
   */
  public static void addContact(ContactFormData data) {
    TelephoneType telephoneType = getTelephoneType(data.telephoneType);

    List<DietType> dietTypes = new ArrayList<>();
    for (String dietString : data.dietTypes) {
      dietTypes.add(getDietType(dietString));
    }

    Contact contact =  new Contact(data.firstName, data.lastName, data.telephone, telephoneType,
        data.address, dietTypes);

    // Make relationships bi-directional
    telephoneType.addContact(contact);
    for (DietType dietType : dietTypes) {
      dietType.addContact(contact);
    }

    contact.save();
  }

  /**
   * Adds the telephone type to the list.
   * @param telephoneType The telephone type.
   */
  public static void addTelephoneType(TelephoneType telephoneType) {
    telephoneType.save();
    //telephoneTypes.put(telephoneType.getTelephoneType(), telephoneType);
  }

  /**
   * Adds the diet type to the list.
   * @param dietType The diet type.
   */
  public static void addDietType(DietType dietType) {
    dietType.save();
    //dietTypes.put(dietType.getDietType(), dietType);
  }

  /**
   * Gets the telephone type.
   * @param typeString The type.
   * @return The telephone type.
   */
  public static TelephoneType getTelephoneType(String typeString) {
    TelephoneType telephoneType = TelephoneType.find().where().eq("telephoneType", typeString).findUnique();
    if (telephoneType == null) {
      throw new RuntimeException("Illegal telephone type.");
    }
    return telephoneType;
  }

  /**
   * Gets the diet type.
   * @param typeString The diet type.
   * @return The diet type.
   */
  public static DietType getDietType(String typeString) {
    DietType dietType = DietType.find().where().eq("dietType", typeString).findUnique();
    if (dietType == null) {
      throw new RuntimeException("Illegal diet type.");
    }
    return dietType;
  }

  /**
   * Gets the contact with the specified id.
   * @param id The id of the contact to retrieve.
   * @return The Contact.
   */
  public static Contact getContact(long id) {
    Contact contact = Contact.find().byId(id);
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
    return Contact.find().all();
  }


}
