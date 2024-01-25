package fuctionalTesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Genric.BaseTest;
import Genric.ReadExcel;
import Pom.RegisterPage;
import Pom.WelcomePage;

public class TC001_Test extends BaseTest {

	@Test(dataProvider = "data1")
	public void testCase(String FN,String LN,String EM,String PASS,String CPASS) throws InterruptedException {
		WelcomePage w = new WelcomePage(driver);
		
		w.getRegister_Link().click();
		RegisterPage r = new RegisterPage(driver);
		r.getGender().click();
		//Thread.sleep(2000);
		r.getFirstName().sendKeys(FN);
		r.getLastName().sendKeys(LN);
		r.getEmail().sendKeys(EM);
		r.getPassword().sendKeys(PASS);
		r.getConfPass().sendKeys(CPASS);
		r.getRegButton().click();
		Reporter.log("TestCase Executed");
	}
	
	@DataProvider(name = "data1")
	public Object[][] excelData1() throws EncryptedDocumentException, IOException{
		
		return ReadExcel.fetchData("Sheet1");
	}
}
