package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public WebElement getUserName() {
		return UserName;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	@FindBy(id = "Email")
	public WebElement UserName;
	
	@FindBy(id = "Password")
	public WebElement Password; 
	
	@FindBy(xpath = "//input[@value='Log in']")
	public WebElement LoginButton;
}
