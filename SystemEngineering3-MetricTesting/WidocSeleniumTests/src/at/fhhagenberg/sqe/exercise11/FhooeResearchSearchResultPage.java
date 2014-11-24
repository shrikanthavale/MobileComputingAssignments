/**
 * 
 */
package at.fhhagenberg.sqe.exercise11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Shrikant Havale - S1310455005
 * Nov 24, 2014
 * 
 */
public class FhooeResearchSearchResultPage {
	
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
	
	@FindBy(id="cvHeaderArea")
	private WebElement searchResultForLabel;
	

	/**
	 * constructor initializing the web driver
	 */
	public FhooeResearchSearchResultPage(WebDriver webDriver) {
		this.driver = webDriver;
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

	/**
	 * @return the searchResultForLabel
	 */
	public WebElement getSearchResultForLabel() {
		return searchResultForLabel;
	}


}
