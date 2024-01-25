package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(xpath = "//input[@id='termsofservice']")
	public WebElement TermsCondition;
	
	@FindBy(xpath = "//button[@id='checkout']")
	public WebElement CheckOutButton;

	public WebElement getTermsCondition() {
		return TermsCondition;
	}

	public WebElement getCheckOutButton() {
		return CheckOutButton;
	}
	
	
}
