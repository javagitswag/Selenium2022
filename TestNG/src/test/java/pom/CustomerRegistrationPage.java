
package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import project.BaseTest;

public class CustomerRegistrationPage extends BaseTest
{
@FindBy(linkText="Sign in")public WebElement signinpage;
@FindBy(id="email_create")public WebElement usermail;
@FindBy(xpath="//*[@id=\'SubmitCreate\']/span")public WebElement submit;
@FindBy(xpath=".//*[@id='create_account_error']/ol/li") public WebElement error;
@FindBy(id="gender1")public WebElement mr;
@FindBy(id="gender2")public WebElement mrs;
@FindBy(id="customer_firstname")public WebElement firstname;
@FindBy(id="customer_lastname")public WebElement lastname;
@FindBy(id="passwd")public WebElement  password;
@FindBy(id="days")public WebElement days;
@FindBy(id="months")public WebElement months;
@FindBy(id="years")public WebElement years;
@FindBy(id="firstname")public WebElement f_name;
@FindBy(id="lastname")public WebElement l_tname;
@FindBy(id="company")public WebElement  company;
@FindBy(id="address1")public WebElement address1;
@FindBy(id="address2")public WebElement  address2;
@FindBy(id="city")public WebElement  city;
@FindBy(id="uniform-id_state")public WebElement  state;
@FindBy(id="postcode")public WebElement postcode;
@FindBy(id="id_country")public WebElement  country;
@FindBy(id="other")public WebElement aditionalinform;
@FindBy(id="phone")public WebElement phone;
@FindBy(id="id=phone_mobile")public WebElement mobile;
@FindBy(id="alias" )public WebElement aliasadress;
@FindBy(id="submitAccount")public WebElement register;


public CustomerRegistrationPage(WebDriver driver) 
{
	PageFactory.initElements(driver, this);
}

public void customerRegistation() throws InterruptedException
{
	signinpage.click();
	//usermail.sendKeys("qatest45744349@gmail.com");
	usermail.sendKeys("qatest"+randomNum()+"@gmail.com");//create method & define in baseTest
	//Thread.sleep(3000);
	
	submit.click(); //explicit wait
	//WebDriverWait wait=new WebDriverWait(driver , 30);//30 sec means 30sce not use how much is necessary that only use
	//wait.until(ExpectedConditions.elementToBeClickable(mrs));
	
	mrs.click();
	firstname.sendKeys("qa");
	lastname.sendKeys("test");
	password.sendKeys(" password");
	days.sendKeys("1");
	months.sendKeys("march");
	years.sendKeys("2019");
	address1.sendKeys("hyderabad");
	city.sendKeys("hyderabad");
	state.sendKeys("California");
	postcode.sendKeys("23456");
	country.sendKeys("United States");
	phone.sendKeys("1234567890");
	//register.click();
	}


}
