package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
WebDriver driver;
	
	@FindBy(name="firstName")
	WebElement FirstName;
	
	@FindBy(name="lastName")
	WebElement LastName;
	
	@FindBy(name="phone")
	WebElement Phone;
	
	@FindBy(name="userName")
	WebElement email;
	
	@FindBy(name="address1")
	WebElement Address1;
	
	@FindBy(name="city")
	WebElement City;
	
	@FindBy(name="state")
	WebElement State;
	
	@FindBy(name="postalCode")
	WebElement PostalCode;
	
	@FindBy(name="country")
	WebElement Country;
	
	@FindBy(id = "email")
    WebElement username;

    @FindBy(name = "password")
    WebElement Password;

    @FindBy(name = "confirmPassword")
    WebElement ConfirmPassword;

    @FindBy(name = "submit")
    WebElement Submit;
	
    @FindBy(xpath = "//b[contains(text(),'Note: Your user name is')]")
	static
    WebElement registerSuccessMessage;

	public RegisterPage(WebDriver driver){
		 this.driver = driver;
	        PageFactory.initElements(driver,this);
		
	}
public void setFirstName(String fname) {
	FirstName.sendKeys(fname);
}
public void setLastName(String lname) {
	LastName.sendKeys(lname);
}
public void setPhone(String ph) {
	Phone.sendKeys(ph);
}
public void setEmail(String em) {
	email.sendKeys(em);
}
public void setAddress(String address) {
	Address1.sendKeys(address);
}
public void setCity(String cit) {
	City.sendKeys(cit);
}
public void setState(String st) {
	State.sendKeys(st);
}
public void setPostalCode(String pc) {
	PostalCode.sendKeys(pc);
}
public void setCountry(String cr) {
	Select drop=new Select(Country);
	drop.selectByVisibleText(cr);
}
public void setUserName(String un) {
	username.sendKeys(un);
}
public void setPassword(String pass) {
	Password.sendKeys(pass);
}
public void setConfirtPassword(String Cpass) {
	ConfirmPassword.sendKeys(Cpass);
}
public void clicksubbtn() {
	Submit.click();
}
public static String readSuccessMessage(){
    return  registerSuccessMessage.getText();
}

}
