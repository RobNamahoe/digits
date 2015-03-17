package models;

import views.formdata.ContactFormData;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple in memory repo to store contacts.
 */
public class ContactDB {

  private static List<Contact> contacts = new ArrayList<>();

  /**
   * Adds a new contact to the database.
   * @param data The form data for the new contact.
   */
  public static void addContact(ContactFormData data) {
    contacts.add(new Contact(data.firstName, data.lastName, data.telephone, data.address));
  }

  /**
   * Gets a list of the current contacts.
   * @return A list of current contacts.
   */
  public static List<Contact> getContacts() {
    return contacts;
  }


}
