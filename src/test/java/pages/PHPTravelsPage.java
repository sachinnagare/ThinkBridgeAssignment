/**
 * Design Pattern used - Page Object Model (POM) by using Page Factory. 
 * The PHPTravelsPage.Java file find the all the Locators available on the page. All required methods are written here.
 *
 * @author  Sachin Nagare
 * @version 1.0
 * @since   2020-06-29 
 */


package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import config.Config;

public class PHPTravelsPage {

	@FindBy(how = How.XPATH, using ="//a[contains(@class,'text-center flights')]" )
	WebElement weFlightsTab;

	@FindBy(how = How.XPATH, using="//div[contains(@class,'mb-10 row-reverse align-items-start row-return')]//div[2]//label[1]")
	public static WebElement weRadioRoundTrip;


	@FindBy(how=How.XPATH, using = "//div[@id='flights']/div/div/form/div/div/div[2]/div/div/a/span")
	static WebElement weDropdown;

	@FindBy(how=How.XPATH, using="//div[contains(@class,'tab-content')]//li[2]")
	static WebElement weBussinessValue;

	//from and two are not selected
	@FindBy(how = How.XPATH, using="//body")
	static WebElement weFromSearch;

	@FindBy(how=How.XPATH, using="//body")
	static WebElement weToSearch;



	@FindBy(how=How.ID, using="FlightsDateStart")
	static WebElement weDepart;


	@FindBy(how=How.XPATH, using = "//div[@id='datepickers-container']/div[8]/nav/div[2]")
	static WebElement weDepartDatePicker;

	@FindBy(how=How.XPATH, using = "//div[@id='datepickers-container']/div[8]/div/div[2]/div/div[7]")
	static WebElement weChooseNextMonth;

	@FindBy(how=How.XPATH, using = "//div[@id='datepickers-container']/div[8]/div/div/div[2]/div[8]")
	static WebElement weChooseDepartDate;


	@FindBy(how=How.ID, using="FlightsDateEnd")
	static WebElement weReturn;

	@FindBy(how=How.XPATH, using = "//div[@id='datepickers-container']/div[9]/div/div/div[2]/div[14]")
	static WebElement weChooseReturnDatePicker;


	@FindBy(how=How.XPATH, using="(//button[@type='button'])[7]")
	static WebElement weAdultAdd;

	@FindBy(how=How.XPATH, using = "(//button[@type='button'])[9]")
	static WebElement weChildAdd;


	@FindBy(how=How.XPATH, using = "(//button[@type='button'])[11]")
	static WebElement weInfantAdd;

	@FindBy(how=How.XPATH, using = "(//button[@type='submit'])[2]")
	static WebElement weSearchButton;



	public void loadPHPTravelsPage()
	{
		PageFactory.initElements(Config.driver, this);
	}


	public void clickWebelement(WebElement webElement1) {
		webElement1.click();
	}

	public void clickWebelement1()
	{
		weFlightsTab.click();
	}

	public void SearchFlight()
	{
		weFlightsTab.click();
		clickWebelement(weFlightsTab);
		clickWebelement(weRadioRoundTrip);
		clickWebelement(weDropdown);
		clickWebelement(weBussinessValue);
		clickWebelement(weFromSearch);
		clickWebelement(weToSearch);
		clickWebelement(weDepart);
		clickWebelement(weDepartDatePicker);
		clickWebelement(weChooseNextMonth);
		clickWebelement(weChooseDepartDate);
		clickWebelement(weReturn);
		clickWebelement(weChooseReturnDatePicker);
		clickWebelement(weAdultAdd);
		clickWebelement(weChildAdd);
		clickWebelement(weInfantAdd);
		clickWebelement(weSearchButton);
	}


}
