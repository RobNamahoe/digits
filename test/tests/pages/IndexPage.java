package tests.pages;

import org.fluentlenium.core.FluentPage;
import org.openqa.selenium.WebDriver;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Provides testing support for the Index page.
 */
public class IndexPage extends FluentPage {

  private String url;

  /**
   * Create the IndexPage.
   * @param webDriver The driver.
   * @param port The port.
   */
  public IndexPage(WebDriver webDriver, int port) {
    super(webDriver);
    this.url = "http://localhost:" + port;
  }

  @Override
  public String getUrl() {
    return this.url;
  }

  @Override
  public void isAt() {
    assertThat(title()).isEqualTo("Digits digits");
  }

  /**
   * Checks that the contact has been added to the application.
   * @param firstName The contacts first name.
   * @param lastName The contacts last name.
   * @param telephone The contacts telephone.
   * @param telephoneType The contacts telephone type.
   * @param address The contacts address.
   */
  public void hasContact(String firstName, String lastName, String telephone, String telephoneType, String address) {
    assertThat(pageSource().contains(firstName));
    assertThat(pageSource().contains(lastName));
    assertThat(pageSource().contains(telephone));
    assertThat(pageSource().contains(telephoneType));
    assertThat(pageSource().contains(address));
  }


}
