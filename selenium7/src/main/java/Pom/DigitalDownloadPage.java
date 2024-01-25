package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DigitalDownloadPage extends BasePage{

	public DigitalDownloadPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "(//input[@value='Add to cart'])[1]")
	public WebElement AlbumProduct;

	public WebElement getAlbumProduct() {
		return AlbumProduct;
	}
	
}
