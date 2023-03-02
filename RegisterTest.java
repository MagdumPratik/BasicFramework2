package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import helpers.RegisterHelper;
import pageObject.RegisterPage;
import utils.TestBase;

public class RegisterTest extends TestBase{
	@BeforeMethod
    public void navigateToLoginPage(){
        System.out.println("Navigating to Registration Page");
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        System.out.println("Navigation Successful");
    }
	@DataProvider(name="registrationData")
	public String[][] registrationDataProvider(){
		return new String[][] {
			{"Pratik","Magdum","7768975647","Magdumpratik","Waghave","Kolhapur",
				"Maharashtra","416230","INDIA","Pratik","pratik","pratik"}
		};}
		@Test(dataProvider = "registrationData")
	    public void verifyLogin(String fm,String Lm,String ph,String em,String add, 
	    		String city, String st,String pc, String cr,String username, String password,
	    		String Cpass
	    		){
	        RegisterHelper.doLogin(fm,Lm,ph,em,add,city,st,pc,cr,username,password,Cpass);
 }
	}

