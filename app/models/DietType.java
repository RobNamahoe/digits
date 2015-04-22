package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * Manages diet types.
 */
@Entity
public class DietType extends Model {

  @Id
  private long id;
  private String dietType;

  @ManyToMany(mappedBy = "dietTypes")
  private List<Contact> contacts = new ArrayList<>();

  /**
   * The EBean ORM finder method for database queries.
   * @return The finder method.
   */
  public static Finder<Long, DietType> find() {
    return new Finder<Long, DietType>(Long.class, DietType.class);
  }


  /**
   * Gets the id.
   * @return The id.
   */
  public long getId() {
    return id;
  }

  /**
   * Sets the id.
   * @param id The id.
   */
  public void setId(long id) {
    this.id = id;
  }

  /**
   * Gets the diet type.
   * @return The diet type.
   */
  public String getDietType() {
    return dietType;
  }

  /**
   * Sets the diet type.
   * @param dietType The diet type.
   */
  public void setDietType(String dietType) {
    this.dietType = dietType;
  }

  /**
   * Gets the list of contacts.
   * @return The list of contacts.
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
   * @param contact The contact to add.
   */
  public void addContact(Contact contact) {
    this.contacts.add(contact);
  }

  /**
   * Constructs a new instance with the passed diet type.
   * @param dietType The diet type.
   */
  public DietType(String dietType) {
    this.dietType = dietType;
  }
}
