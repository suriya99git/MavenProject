package integrationTesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Genric.BaseTest;
import Genric.ReadExcel;
import Pom.DigitalDownloadPage;
import Pom.LoginPage;
import Pom.ShoppingCartPage;
import Pom.WelcomePage;

public class TC001_Test extends BaseTest {

	public static LoginPage l;
	public static WelcomePage w ;
	public static DigitalDownloadPage d;
	public static ShoppingCartPage s;
	
	@Test(dataProvider = "logindata",priority = 1)
	public void testCase(String un,String ps){
		
	    w = new WelcomePage(driver);
		
		w.getLogin_link().click();
		
		 l = new LoginPage(driver);
		
		l.getUserName().sendKeys(un);
		l.getPassword().sendKeys(ps);
		l.getLoginButton().click();
		
		
		
	}
	
	@DataProvider(name = "logindata")
	public Object[][] data() throws EncryptedDocumentException, IOException{
		
		return ReadExcel.fetchData("sheet2");
	}
	@Test(priority = 2)
	public void testCase() {
		
		
		
		w.getDigitalDownloadLink().click();
		
		 d = new DigitalDownloadPage(driver);
		
		d.getAlbumProduct().click();
		
	}
	
	@Test(priority = 3)
	public void testCase1() {
		
	   
        w.getShoppingCart_link().click();
		
		 s = new ShoppingCartPage(driver);
		
		s.getTermsCondition().click();
		s.getCheckOutButton().click();
	}
}
