package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPageObjects;
import commonFunctions.*;

public class LoginPageTestCases extends CommonMain{

	@Test(dataProvider = "myExcelDataRead", dataProviderClass = ExcelDatasRead.class)
	public void LoginMethod(String Uname, String Pword) throws Exception{
		extentrp.createTest("LoginMethod");
		System.out.println("Loginpage testcases Started---1");
		PageFactory.initElements(driver, LoginPageObjects.class);
		//Using Apache POI
		LoginPageObjects.username.sendKeys(Uname);
		LoginPageObjects.password.sendKeys(Pword);
		LoginPageObjects.loginbtn.click();
		System.out.println("Loginpage testcases success---1");
		TakeScreenshot.myTakeScreenshot("//Loginpage//loginpage.jpg");
		Assert.assertTrue(false);
	}

//	@Test
//	public void LoginMethod2() throws Exception {
//		System.out.println("Loginpage testcases Started---2");
//		PageFactory.initElements(driver, LoginPageObjects.class);
//		//Using property file
//		LoginPageObjects.username.sendKeys(property.getProperty("Username"));
//		LoginPageObjects.password.sendKeys(property.getProperty("Password"));
//		LoginPageObjects.loginbtn.click();
//		System.out.println("Loginpage testcases success---2");
//
//	}
	
}
