package models;

import views.formdata.ContactFormData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * A simple in memory repo to store contacts.
 */
public class ContactDB {

  private static HashMap<Long, Contact> contacts = new HashMap<>();

  /**
   * Adds a new contact to the database.
   * @param data The form data for the new contact.
   */
  public static void addContact(ContactFormData data) {

    long id = 0;
    Contact contact;

    if (data.id == 0) {
      // Add new contact
      id = contacts.size() + 1;
      contact = new Contact(id, data.firstName, data.lastName, data.telephone, data.address);
    }
    else {
      // Update an existing contact
      id = data.id;
      contact = getContact(id);
      contact.setFirstName(data.firstName);
      contact.setLastName(data.lastName);
      contact.setTelephone(data.telephone);
      contact.setAddress(data.address);
    }
    contacts.put(id, contact);
  }

  /**
   * Gets the specified contact from the database.
   * @param id The id of the contact to retrieve.
   * @return The specified contact.
   */
  public static Contact getContact(long id) {
    return contacts.get(id);
  }

  /**
   * Gets a list of the current contacts.
   * @return A list of current contacts.
   */
  public static List<Contact> getContacts() {
    return new ArrayList<>(contacts.values());
  }


}
