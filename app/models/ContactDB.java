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

  /**
   * Adds a new contact to the database.
   * @param data The form data for the new contact.
   */
  public static void addContact(ContactFormData data) {
    long id = (data.id == 0) ? currentId++ : data.id;
    contacts.put(id, new Contact(id, data.firstName, data.lastName, data.telephone, data.address));
  }


  /**
   * Deletes the contact with the specified ID from the database.
   * @param id The ID of the contact to delete.
   */
  public static void deleteConteact(long id) {
    contacts.remove(id);
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


}
