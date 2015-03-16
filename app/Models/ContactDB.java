package Models;

import views.formdata.ContactFormData;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * A simple in memory database for contact data.
 */
public class ContactDB {

  private static int id = 0;
  private static HashMap<Integer, Contact> contacts = new HashMap<>();

  /**
   * The default constructor method for the ContactDB class.
   */
  public ContactDB() {
    // do nothing
  }

  /**
   * Adds a new contact to the ContactDB.
   * @param data The data for the new contact.
   */
  public static void add(ContactFormData data) {
    contacts.put(id, new Contact(data.firstName, data.lastName, data.telephone));
    id++;
  }

  /**
   * Gets a list of all contacts.
   * @return A list of all contacts in the database.
   */
  public static ArrayList<Contact> getContacts() {
    ArrayList<Contact> results = new ArrayList<>();
    if (!contacts.isEmpty()) {
      results = new ArrayList<Contact>(contacts.values());
    }
    return results;
  }

}
