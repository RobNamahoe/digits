package tests.pages;

import org.fluentlenium.core.FluentPage;
import org.openqa.selenium.WebDriver;
import static org.fest.assertions.Assertions.assertThat;

/**
 * Provides testing support for the Index page.
 */
public class NewContactPage extends FluentPage {

  private String url;


  /**
   * Create the tests.pages.IndexPage.
   * @param webDriver The driver.
   * @param port the port.
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
    assertThat(title()).isEqualTo("New Contact");
  }


  /**
   * Set the form to the passed values, then submit it.
   * @param firstName The contacts first name.
   * @param lastName The contacts last name.
   * @param telephone The contacts telephone number.
   * @param address the contacts address.
   */
  public void submitForm(String firstName, String lastName, String telephone, String address) {
    // Fill the input field with id "firstName" with the passed firstName string.
    fill("#firstName").with(firstName);

    // Fill the input field with id "lastName" with the passed lastName string.
    fill("#lastName").with(lastName);

    // Fill the input field with id "telephone" with the passed telephone string.
    fill("#telephone").with(telephone);

    // Fill the input field with id "address" with the passed address string.
    fill("#address").with(address);

    //Submit the form whose id is "submit"
    submit("#submit");
  }

}
