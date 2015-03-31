package tests;

import org.junit.Test;
import play.libs.F.Callback;
import play.test.TestBrowser;
import tests.pages.IndexPage;
import tests.pages.NewContactPage;

import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.HTMLUNIT;
import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.inMemoryDatabase;
import static play.test.Helpers.running;
import static play.test.Helpers.testServer;

/**
 * Runs a server with a fake in-memory database to test the system.
 */
public class IntegrationTest {

  /** The port to be used for testing. */
  private final int port = 3333;

  /**
   * Check to see that both the index and page1 tests.pages can be retrieved.
   */
  @Test
  public void test() {
    running(testServer(port, fakeApplication(inMemoryDatabase())), HTMLUNIT, new Callback<TestBrowser>() {
      public void invoke(TestBrowser browser) {
        testRetrieveIndexPage(browser);
        testCreateNewContact(browser);
      }
    });
  }


  /**
   * Test to see that the Index page can be retrieved.
   */
  public void testRetrieveIndexPage(TestBrowser browser) {
    IndexPage indexPage = new IndexPage(browser.getDriver(), port);
    browser.goTo(indexPage);
    assertThat(browser.pageSource()).contains("Current Contacts");
  }


  /**
   * Tests to see that a new contact to be added to the database.
   */
  public void testCreateNewContact(TestBrowser browser) {
    NewContactPage newContactPage = new NewContactPage(browser.getDriver(), port);
    browser.goTo(newContactPage);
    String firstName = "Robert";
    String lastName = "Namahoe";
    String telephone = "808-111-2222";
    String address = "1914 University Ave #407, Honolulu HI 96822";
    newContactPage.submitForm(firstName, lastName, telephone, address);
    assertThat(browser.pageSource()).contains(firstName);
    assertThat(browser.pageSource()).contains(lastName);
    assertThat(browser.pageSource()).contains(telephone);
    assertThat(browser.pageSource()).contains(address);
  }


}
