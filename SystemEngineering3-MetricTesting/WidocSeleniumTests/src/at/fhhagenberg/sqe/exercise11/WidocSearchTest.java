package at.fhhagenberg.sqe.exercise11;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WidocSearchTest {

	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://research.fh-ooe.at/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testWidocSearch() throws Exception {

		// Havale - S1310455005 - Exercise 9
		driver.get(baseUrl + "/en/index");
		driver.findElement(By.id("searchedFor")).click();
		driver.findElement(By.id("searchedFor")).clear();
		driver.findElement(By.id("searchedFor")).sendKeys("testing");
		driver.findElement(By.name("search")).click();
		driver.findElement(By.id("pageContainer")).click();
		// TODO : Added \n as it was missing from expected result
		// Modified windows encoding to UTF-8
		assertEquals("Search\nResults for testing:",
				driver.findElement(By.id("cvHeaderArea")).getText());
		assertEquals("Widok | Suche", driver.getTitle());
		driver.findElement(By.xpath("//ul[@id='subMenu']/li[2]/a")).click();
		driver.findElement(By.xpath("//ul[@id='subMenu']/li[2]/a")).click();
		driver.findElement(By.xpath("//ul[@id='subMenu']/li[3]/a")).click();
		driver.findElement(By.xpath("//ul[@id='subMenu']/li[4]/a")).click();
		driver.findElement(By.xpath("//ul[@id='subMenu']/li[3]/a")).click();
		assertEquals("Research units:",
				driver.findElement(By.cssSelector("#orgunits > h2")).getText());
		driver.findElement(By.xpath("//ul[@id='subMenu']/li[4]/a")).click();
		assertEquals("Publications:",
				driver.findElement(By.cssSelector("#publications > h2"))
						.getText());
		driver.findElement(By.xpath("//ul[@id='subMenu']/li[2]/a")).click();
		assertEquals("Research fields:",
				driver.findElement(By.cssSelector("h2")).getText());
		driver.findElement(By.linkText("Research units")).click();
		driver.findElement(By.linkText("Research fields")).click();
		driver.findElement(By.linkText("Science fields")).click();
		driver.findElement(By.cssSelector("img[alt=\"FH Oberösterreich\"]"))
				.click();

		// ERROR: Caught exception [ERROR: Unsupported command [selectWindow |
		// null | ]]
		driver.findElement(By.name("search")).click();
		driver.findElement(By.id("searchedFor")).click();
		driver.findElement(By.id("searchedFor")).clear();
		driver.findElement(By.id("searchedFor")).sendKeys("testing");
		driver.findElement(By.name("search")).click();
		driver.findElement(By.id("pageContainer")).click();
		driver.findElement(By.linkText("Research fields")).click();
		driver.findElement(
				By.linkText("Automated Control Engineering and Simulation"))
				.click();
		driver.findElement(By.cssSelector("span.menuCount")).click();
		driver.findElement(By.xpath("//ul[@id='subMenu']/li[3]/a")).click();

	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

}
