package helpers;

import org.openqa.selenium.WebDriver;

import pageObject.RegisterPage;

public class RegisterHelper {
	static RegisterPage rp;

    public RegisterHelper(WebDriver driver){
    	rp = new RegisterPage(driver);
    }

     public static void doLogin(String fm,String Lm,String ph,String em,String add, 
    		String city, String st,String pc, String cr,String username, String password,
    		String Cpass){
          rp.setFirstName(fm);
          rp.setLastName(Lm);
          rp.setPhone(ph);
          rp.setEmail(em);
          rp.setAddress(add);
          rp.setCity(city);
          rp.setState(st);
          rp.setPostalCode(pc);
          rp.setCountry(cr);
          rp.setUserName(username);
          rp.setPassword(password);
          
    }
}
