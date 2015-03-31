package tests.pages;

import org.fluentlenium.core.FluentPage;
import org.openqa.selenium.WebDriver;

import static org.fest.assertions.Assertions.assertThat;
import static org.fluentlenium.core.filter.FilterConstructor.withId;

/**
 * Provides testing support for the Index page.
 */
public class NewContactPage extends FluentPage {

  private String url;

  /**
   * Create the IndexPage.
   * @param webDriver The driver.
   * @param port The port.
   */
  public NewContactPage(WebDriver webDriver, int port) {
    super(webDriver);
    this.url = "http://localhost:" + port + "/newcontact";
  }

  @Override
  public String getUrl() {
    return this.url;
  }

  @Override
  public void isAt() {
    assertThat(title()).isEqualTo("New Contact digits");
  }

  /**
   * Add a new contact to the database.
   * @param firstName The contacts first name.
   * @param lastName The contacts last name.
   * @param telephone The contacts telephone.
   * @param telephoneType The contacts telephone type.
   * @param address The contacts address.
   */
  public void addContact(String firstName, String lastName, String telephone, String telephoneType, String address) {

    // Fill the input field with id "firstName" with the passed firstName string.
    fill("#firstName").with(firstName);

    // Fill the input field with id "lastName" with the passed lastName string.
    fill("#lastName").with(lastName);

    // Fill the input field with id "telephone" with the passed telephone string.
    fill("#telephone").with(telephone);

    // Fill the input field with id "telephoneType" with the passed telephoneType string.
    find("select", withId("telephoneType")).find("option", withId(telephoneType)).click();

    // Fill the input field with id "address" with the passed address string.
    fill("#address").with(address);

    //Submit the form whose id is "submit"
    submit("#submit");

  }

}
