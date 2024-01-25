package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "gender-male")
	public WebElement gender;
	
	public WebElement getGender() {
		return gender;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getConfPass() {
		return ConfPass;
	}

	public WebElement getRegButton() {
		return RegButton;
	}

	@FindBy(id = "FirstName")
	public WebElement FirstName;
	
	@FindBy(id = "LastName")
	public WebElement LastName;
	
	@FindBy(id = "Email")
	public WebElement Email;
	
	@FindBy(id = "Password")
	public WebElement Password;
	
	@FindBy(id = "ConfirmPassword")
	public WebElement ConfPass;
	
	@FindBy(id = "register-button")
	public WebElement RegButton;
}
