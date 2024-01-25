package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends BasePage {

	
	public WelcomePage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(linkText = "Register")
	public WebElement Register_Link;
	
	@FindBy(xpath = "(//a[contains(text(),'Digital downloads')])[1]")
	public WebElement DigitalDownloadLink;
	
	public WebElement getRegister_Link() {
		return Register_Link;
	}

	public WebElement getDigitalDownloadLink() {
		return DigitalDownloadLink;
	}

	public WebElement getLogin_link() {
		return Login_link;
	}

	public WebElement getShoppingCart_link() {
		return ShoppingCart_link;
	}

	public WebElement getWhishList_link() {
		return WhishList_link;
	}

	@FindBy(linkText = "Log in")
	public WebElement Login_link;
	
	@FindBy(linkText = "Shopping cart")
	public WebElement ShoppingCart_link;
	
	@FindBy(linkText = "Wishlist")
	public WebElement WhishList_link;
}
