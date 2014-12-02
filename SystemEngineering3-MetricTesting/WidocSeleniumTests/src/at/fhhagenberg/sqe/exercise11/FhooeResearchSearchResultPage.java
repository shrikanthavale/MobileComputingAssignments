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
	
	@FindBy(xpath="//ul[@id='subMenu']/li[1]/a")
	private WebElement personsResult;
	
	@FindBy(xpath="//ul[@id='subMenu']/li[2]/a")
	private WebElement researchFieldsResult;
	
	@FindBy(xpath="//ul[@id='subMenu']/li[3]/a")
	private WebElement researchUnitResult;
	
	@FindBy(xpath="//ul[@id='subMenu']/li[4]/a")
	private WebElement publicationsResult;
	
	@FindBy(xpath="//ul[@id='subMenu']/li[5]/a")
	private WebElement projectsResult;
	
	@FindBy(xpath="//ul[@id='subMenu']/li[6]/a")
	private WebElement patentsResult;
	
	/**
	 * Searching for something and returning search results
	 * 
	 * @param searchTerm term to be searched
	 * @return
	 */
	public FhooeResearchSearchResultPage searchFor(String searchTerm) {
		searchedTextField.clear();
		searchedTextField.sendKeys(searchTerm);
		searchButton.click();
		return PageFactory.initElements(driver, FhooeResearchSearchResultPage.class);
	}
	

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


	/**
	 * @return the personsResult
	 */
	public WebElement getPersonsResult() {
		return personsResult;
	}


	/**
	 * @return the researchFieldsResult
	 */
	public WebElement getResearchFieldsResult() {
		return researchFieldsResult;
	}


	/**
	 * @return the researchUnitResult
	 */
	public WebElement getResearchUnitResult() {
		return researchUnitResult;
	}


	/**
	 * @return the publicationsResult
	 */
	public WebElement getPublicationsResult() {
		return publicationsResult;
	}


	/**
	 * @return the projectsResult
	 */
	public WebElement getProjectsResult() {
		return projectsResult;
	}


	/**
	 * @return the patentsResult
	 */
	public WebElement getPatentsResult() {
		return patentsResult;
	}
	
}
