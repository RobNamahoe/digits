import models.ContactDB;
import play.Application;
import play.GlobalSettings;
import views.formdata.ContactFormData;

/**
 * Initialize the application.
 */
public class Global extends GlobalSettings {


  @Override
  public void onStart(Application application) {
    super.onStart(application);

    ContactDB.addContact(new ContactFormData("Rob", "Namahoe", "808-111-1111", "Home",
                                             "1914 University Ave, Honolulu"));

    ContactDB.addContact(new ContactFormData("Parker", "Haines", "808-111-2222", "Home",
                                             "1914 University Ave, Honolulu"));

    ContactDB.addContact(new ContactFormData("Bosie", "Jones", "808-111-3333", "Home",
                                             "1914 University Ave, Honolulu"));

    ContactDB.addContact(new ContactFormData("Will", "Smith", "808-111-4444", "Home",
                                             "1914 University Ave, Honolulu"));

  }

}
