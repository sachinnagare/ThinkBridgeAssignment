/**
 * The FlightTest.Java file search the all flight and displays the search results.
 *
 * @author  Sachin Nagare
 * @version 1.0
 * @since   2020-06-29 
 */

package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import config.Config;
import pages.PHPTravelsPage;
import utility.LaunchApp;

public class FlightTest {

	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeMethod
	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {
		LaunchApp la=new LaunchApp();
		la.waitTillPageLoaded(30);
		//Config.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}


	@Test
	public void searchFlights()
	{

		PHPTravelsPage objptp=new PHPTravelsPage();
		objptp.loadPHPTravelsPage();
		objptp.clickWebelement1();
		objptp.SearchFlight();

		Assert.assertEquals(Config.driver.getTitle(), "Flights Results - From to NYC to MIA", "Flight Result page title is verified sucessfully.");
		Assert.assertEquals(Config.driver.findElement(By.xpath("//div/div[2]/button")).getText(), "MODIFY SEARCH", "Modify Search button is verified on page.");
	}

	@AfterMethod
	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		Config.driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			Assert.fail(verificationErrorString);
		}
	}
}
