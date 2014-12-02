package at.fhhagenberg.sqe.exercise10;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import at.fhhagenberg.sqe.exercise11.FhooeResearchSearchPage;
import at.fhhagenberg.sqe.exercise11.FhooeResearchSearchResultPage;
import fit.ColumnFixture;

/**
 * This is paramaterized test, but based on the FIT where the data or parameters
 * are separated in separate documet and passed on to this class for testing
 * purpose.
 * 
 * This class uses the parameter, searches using the web browser and Selenium,
 * gets the data from web search result and compares with the one present in FIT
 * WidocParameterizedSearch.html
 * 
 * @author Shrikant Havale - S1310455005 Dec 2, 2014
 * 
 */
public class WidocParameterizedSearchTest extends ColumnFixture {

	/**
	 * web driver
	 */
	private WebDriver driver;

	/**
	 * base url for testing
	 */
	private static final String BASE_URL = "http://research.fh-ooe.at/";

	/**
	 * verification errors
	 */
	private StringBuffer verificationErrors = new StringBuffer();

	/**
	 * search string to read from the word document, has to be public
	 */
	public String searchString = "testing";

	/**
	 * close browser flag
	 */
	public boolean flag;

	/**
	 * Main search page
	 */
	private FhooeResearchSearchPage fhooeResearchSearchPage;

	/**
	 * Result page
	 */
	private FhooeResearchSearchResultPage fhooeResearchSearchResultPage;

	/**
	 * default constructor for initializing the driver
	 */
	public WidocParameterizedSearchTest() {
		driver = new FirefoxDriver();
		fhooeResearchSearchPage = FhooeResearchSearchPage.navigateTo(driver);
		fhooeResearchSearchResultPage = fhooeResearchSearchPage
				.searchFor(searchString);
	}

	/**
	 * To be called from the document with the searching parameter being passed.
	 * Searched for the string and returns the search result, which is compared
	 * with the result in the document.
	 * 
	 * @return
	 * @throws Exception
	 */
	public int testWidocParamaterizedSearch() throws Exception {
		
		fhooeResearchSearchResultPage = fhooeResearchSearchResultPage
				.searchFor(searchString);

		try {
			assertEquals("", fhooeResearchSearchResultPage
					.getSearchedTextField().getText());
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}

		Assert.assertNotNull(fhooeResearchSearchResultPage
				.getSearchedTextField());
		Assert.assertNotNull(fhooeResearchSearchResultPage.getSearchButton());
		Assert.assertNotNull(fhooeResearchSearchResultPage
				.getResearchFieldsButton());
		Assert.assertNotNull(fhooeResearchSearchResultPage
				.getResearchUnitsButton());
		Assert.assertNotNull(fhooeResearchSearchResultPage
				.getScienceFieldsButton());

		assertEquals("Research fields", fhooeResearchSearchResultPage
				.getResearchFieldsButton().getText());
		assertEquals("Research units", fhooeResearchSearchResultPage
				.getResearchUnitsButton().getText());
		assertEquals("Science fields", fhooeResearchSearchResultPage
				.getScienceFieldsButton().getText());

		assertEquals("Search\nResults for testing:",
				fhooeResearchSearchResultPage.getSearchResultForLabel()
						.getText());

		return 0;

	}

	/**
	 * Close the browser, to be called from document.
	 * 
	 * @return success
	 */
	public int closeBrowserDriver() {
		if (flag) {
			driver.quit();
		}
		return 0;
	}

}
