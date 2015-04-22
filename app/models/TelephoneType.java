package models;

import java.util.ArrayList;
import java.util.List;

/**
 * A class to manage telephone type data.
 */
public class TelephoneType {

  private long id;
  private String telephoneType;
  private List<Contact> contacts = new ArrayList<>();

  /**
   * Creates an instance of the TelephoneType class initialized with the given telephone type.
   * @param telephoneType The telephone type.
   */
  public TelephoneType(String telephoneType) {
    this.telephoneType = telephoneType;
  }

  /**
   * Gets the id value.
   * @return The id value.
   */
  public long getId() {
    return id;
  }

  /**
   * Sets the id value.
   * @param id The id value.
   */
  public void setId(long id) {
    this.id = id;
  }

  /**
   * Gets the telephone type value.
   * @return The telephone type.
   */
  public String getTelephoneType() {
    return telephoneType;
  }

  /**
   * Sets the telephone type value.
   * @param telephoneType The telephone type value.
   */
  public void setTelephoneType(String telephoneType) {
    this.telephoneType = telephoneType;
  }

  /**
   * Gets the list of contacts.
   * @return A list of contacts.
   */
  public List<Contact> getContacts() {
    return contacts;
  }

  /**
   * Sets the list of contacts.
   * @param contacts The list of contacts.
   */
  public void setContacts(List<Contact> contacts) {
    this.contacts = contacts;
  }

  /**
   * Adds a contact to the list of contacts.
   * @param contact The contact to add to the list of contacts.
   */
  public void addContact(Contact contact) {
    contacts.add(contact);
  }


}
