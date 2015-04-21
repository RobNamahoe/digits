import models.ContactDB;
import play.Application;
import play.GlobalSettings;
import views.formdata.ContactFormData;

import java.util.ArrayList;
import java.util.List;

/**
 * Initialize the application.
 */
public class Global extends GlobalSettings {


  @Override
  public void onStart(Application application) {
    super.onStart(application);


    List<String> dietTypes = new ArrayList<>();

    dietTypes.add("Chicken");
    dietTypes.add("Fish");

    ContactDB.addContact(new ContactFormData("Robert", "Namahoe", "808-111-1111", "Home",
                                             "1914 University Ave, Honolulu", dietTypes));

    ContactDB.addContact(new ContactFormData("Parker", "Haines", "808-111-2222", "Home",
                                             "1914 University Ave, Honolulu", dietTypes));

    ContactDB.addContact(new ContactFormData("Bosie", "Jones", "808-111-3333", "Home",
                                             "1914 University Ave, Honolulu", dietTypes));

    ContactDB.addContact(new ContactFormData("Will", "Smith", "808-111-4444", "Home",
                                             "1914 University Ave, Honolulu", dietTypes));

  }

}
