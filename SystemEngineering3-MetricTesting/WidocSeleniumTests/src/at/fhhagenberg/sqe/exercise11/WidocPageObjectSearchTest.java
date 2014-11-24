package at.fhhagenberg.sqe.exercise11;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WidocPageObjectSearchTest {

	/**
	 * web driver
	 */
	private WebDriver driver;

	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testFhooeResearchSearchPage() {
		FhooeResearchSearchPage fhooeResearchSearchPage = FhooeResearchSearchPage
				.navigateTo(driver);
		assertEquals("Widok", fhooeResearchSearchPage.getPageTitle());
		assertEquals("Research Documentation", fhooeResearchSearchPage
				.getSearchPageHeading().getText());

		try {
			assertEquals("Research Documentation", fhooeResearchSearchPage
					.getSearchPageHeading().getText());
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}

		try {
			assertEquals("", fhooeResearchSearchPage.getSearchedTextField()
					.getText());
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}

		Assert.assertNotNull(fhooeResearchSearchPage.getSearchedTextField());
		Assert.assertNotNull(fhooeResearchSearchPage.getSearchButton());
		Assert.assertNotNull(fhooeResearchSearchPage.getResearchFieldsButton());
		Assert.assertNotNull(fhooeResearchSearchPage.getResearchUnitsButton());
		Assert.assertNotNull(fhooeResearchSearchPage.getScienceFieldsButton());

		assertEquals("Research fields", fhooeResearchSearchPage
				.getResearchFieldsButton().getText());
		assertEquals("Research units", fhooeResearchSearchPage
				.getResearchUnitsButton().getText());
		assertEquals("Science fields", fhooeResearchSearchPage
				.getScienceFieldsButton().getText());

		// testing the search result page
		FhooeResearchSearchResultPage fhooeResearchSearchResultPage = fhooeResearchSearchPage
				.searchFor("testing");

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
		
		assertEquals("Search\nResults for testing:", fhooeResearchSearchResultPage.getSearchResultForLabel().getText());

	}


	@After
	public void tearDown() throws Exception {
		driver.close();
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

}
