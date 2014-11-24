/**
 * 
 */
package at.fhhagenberg.sqe.exercise11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Shrikant Havale - S1310455005
 * Nov 24, 2014
 * 
 */
public class FhooeResearchSearchPage {
	
	/**
	 * web driver
	 */
	private WebDriver driver;
	
	@FindBy(id="searchedFor")
	private WebElement searchedTextField;
	
	@FindBy(name="search")
	private WebElement searchButton;
	
	@FindBy(css="h1")
	private WebElement searchPageHeading;
	
	@FindBy(linkText="Science fields")
	private WebElement scienceFieldsButton;
	
	@FindBy(linkText="Research fields")
	private WebElement researchFieldsButton;

	@FindBy(linkText="Research units")
	private WebElement researchUnitsButton;

	/**
	 * base url
	 */
	private static final String BASE_URL = "http://research.fh-ooe.at/";

	/**
	 * constructor initializing the web driver
	 */
	public FhooeResearchSearchPage(WebDriver webDriver) {
		this.driver = webDriver;
	}
	
	public FhooeResearchSearchResultPage searchFor(String searchTerm) {
		searchedTextField.clear();
		searchedTextField.sendKeys(searchTerm);
		searchButton.click();
		System.out.println(driver.getCurrentUrl());
		return PageFactory.initElements(driver, FhooeResearchSearchResultPage.class);
	}

	public static FhooeResearchSearchPage navigateTo(WebDriver driver) {
		driver.get(BASE_URL + "en/index");
		return PageFactory.initElements(driver, FhooeResearchSearchPage.class);
	}

	/**
	 * @return the pageTitle
	 */
	public String getPageTitle() {
		return driver.getTitle();
	}

	/**
	 * @return the searchPageHeading
	 */
	public WebElement getSearchPageHeading() {
		return searchPageHeading;
	}

	/**
	 * @return the searchedTextField
	 */
	public WebElement getSearchedTextField() {
		return searchedTextField;
	}

	/**
	 * @return the searchButton
	 */
	public WebElement getSearchButton() {
		return searchButton;
	}

	/**
	 * @return the scienceFieldsButton
	 */
	public WebElement getScienceFieldsButton() {
		return scienceFieldsButton;
	}

	/**
	 * @return the researchFieldsButton
	 */
	public WebElement getResearchFieldsButton() {
		return researchFieldsButton;
	}

	/**
	 * @return the researchUnitsButton
	 */
	public WebElement getResearchUnitsButton() {
		return researchUnitsButton;
	}
	
}
