import models.Contact;
import models.ContactDB;
import models.DietType;
import models.TelephoneType;
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

    if (TelephoneType.find().all().isEmpty()) {
      ContactDB.addTelephoneType(new TelephoneType("Mobile"));
      ContactDB.addTelephoneType(new TelephoneType("Home"));
      ContactDB.addTelephoneType(new TelephoneType("Work"));
    }

    if (DietType.find().all().isEmpty()) {
      ContactDB.addDietType(new DietType("Chicken"));
      ContactDB.addDietType(new DietType("Fish"));
      ContactDB.addDietType(new DietType("Beef"));
      ContactDB.addDietType(new DietType("Dairy"));
      ContactDB.addDietType(new DietType("Gluten"));
    }

    if (Contact.find().all().isEmpty()) {
      List<String> dietTypes = new ArrayList<>();

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

}
