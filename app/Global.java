import models.ContactDB;
import play.GlobalSettings;

/**
 * Global class for application initialization.
 */
public class Global extends GlobalSettings {

  /**
   * Initialize the application.
   * @param application The application.
   */
  @Override
  public void onStart(play.Application application) {
    super.onStart(application);
    ContactDB.addContact("Rob", "Namahoe", "808-111-2222", "Mobile", "1914 University Ave, Honolulu HI 96822");
    ContactDB.addContact("John", "Smith", "808-222-3333", "Home", "1224 University Ave, Honolulu HI 96833");
    ContactDB.addContact("Parker", "Haines", "808-444-5555", "Work", "9883 University Ave, Honolulu HI 96844");
    ContactDB.addContact("Bosie", "Jones", "808-222-4444", "Home", "1123 University Ave, Honolulu HI 96855");
  }


}