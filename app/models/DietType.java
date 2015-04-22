package models;

import java.util.ArrayList;
import java.util.List;

/**
 * A class to manage diet type data.
 */
public class DietType {

  private long id;
  private String dietType;
  private List<Contact> contacts = new ArrayList<>();

  /**
   * Creates an instance of the DietType class initialized with the given diet type.
   * @param dietType The diet type.
   */
  public DietType(String dietType) {
    this.dietType = dietType;
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
   * Gets the diet type value.
   * @return The diet type.
   */
  public String getDietType() {
    return dietType;
  }

  /**
   * Sets the diet type value.
   * @param dietType The diet type value.
   */
  public void setDietType(String dietType) {
    this.dietType = dietType;
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
