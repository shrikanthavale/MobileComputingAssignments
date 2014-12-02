package at.fhhagenberg.sqe.exercise10;

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
	private static WebDriver driver;

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
	 * method initializing the driver
	 */
	public WidocParameterizedSearchTest() {
		if (driver == null) {
			driver = new FirefoxDriver();
			fhooeResearchSearchPage = FhooeResearchSearchPage
					.navigateTo(driver);
			fhooeResearchSearchResultPage = fhooeResearchSearchPage
					.searchFor(searchString);
		}
	}

	/**
	 * To be called from the document with the searching parameter being passed.
	 * Searched for the string and returns the search result, which is compared
	 * with the result in the document.
	 * 
	 * @return string combined result of all the data
	 * @throws Exception
	 */
	public String testWidocParamaterizedSearch() throws Exception {

		fhooeResearchSearchResultPage = fhooeResearchSearchResultPage
				.searchFor(searchString);

		String personResult = fhooeResearchSearchResultPage.getPersonsResult()
				.getText();
		String researchFieldResult = fhooeResearchSearchResultPage
				.getResearchFieldsResult().getText();
		String researchUnitResult = fhooeResearchSearchResultPage
				.getResearchUnitResult().getText();
		String publicationsResult = fhooeResearchSearchResultPage
				.getPublicationsResult().getText();
		String projectResult = fhooeResearchSearchResultPage
				.getProjectsResult().getText();
		String patentsResult = fhooeResearchSearchResultPage.getPatentsResult()
				.getText();

		return personResult + "," + researchFieldResult + ","
				+ researchUnitResult + "," + publicationsResult + ","
				+ projectResult + "," + patentsResult;

	}

	/**
	 * Close the browser, to be called from document.
	 * 
	 * @return success
	 */
	public int closeBrowserDriver() {
		if (flag && driver != null) {
			driver.quit();
		}
		return 0;
	}

}
