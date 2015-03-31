package tests;

import org.junit.Test;
import play.libs.F.Callback;
import play.test.TestBrowser;
import tests.pages.IndexPage;
import tests.pages.NewContactPage;

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
   * Check to see that the index page can be retrieved.
   */
  @Test
  public void testRetrieveIndexPage() {
    running(testServer(port, fakeApplication(inMemoryDatabase())), HTMLUNIT, new Callback<TestBrowser>() {
      public void invoke(TestBrowser browser) {
        IndexPage indexPage = new IndexPage(browser.getDriver(), port);
        browser.goTo(indexPage);
        indexPage.isAt();
      }
    });
  }

  /**
   * Check to see that a new contact can be added and displayed.
   */
  @Test
  public void testCreateNewContact() {
    running(testServer(port, fakeApplication(inMemoryDatabase())), HTMLUNIT, new Callback<TestBrowser>() {
      public void invoke(TestBrowser browser) {
        IndexPage indexPage = new IndexPage(browser.getDriver(), port);
        NewContactPage newContactPage = new NewContactPage(browser.getDriver(), port);

        browser.goTo(newContactPage);
        newContactPage.isAt();

        String firstName = "Robert";
        String lastName = "Namahoe";
        String telephone = "808-111-2222";
        String address = "1914 University Ave #407, Honolulu HI 90822";

        newContactPage.addContact(firstName, lastName, telephone, address);

        browser.goTo(indexPage);
        indexPage.isAt();
        indexPage.hasContact(firstName, lastName, telephone, address);

      }
    });
  }

}
