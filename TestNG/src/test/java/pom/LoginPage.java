package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage //java  class take property & behavior
{                                 //Property
@FindBy(linkText="Sign in")public WebElement signin;
@FindBy(id="email")public WebElement useremail;
@FindBy(id="passwd")public WebElement userpassword;
//@FindBy(id="SubmitLogin")public WebElement submitlogin;
@FindBy(xpath="//*[@id='SubmitLogin']")public WebElement submitlogin;
@FindBy(xpath="//*[@id=\'center_column\']/div[1]/ol/li")public WebElement loginError;

public LoginPage(WebDriver driver) 
{
	PageFactory.initElements(driver, this);
}

public  void customerLogin() //behavior
{
	signin.click();
	useremail.sendKeys("mama123@gmail.com");
	userpassword.sendKeys("Rajamama");
	submitlogin.click();
}
public  String verifyError()
{
	return loginError.getText();
}            
}