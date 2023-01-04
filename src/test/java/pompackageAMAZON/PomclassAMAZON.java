package pompackageAMAZON;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseAMAZON.BaseclassAMAZON;

public class PomclassAMAZON extends BaseclassAMAZON {
	
	@FindBy(id="ap_customer_name")
	WebElement Username;
	@FindBy(id="ap_email")
	WebElement Email;
	@FindBy(id="ap_password")
	WebElement Password;
	@FindBy(id="ap_password_check")
	WebElement ConfirmPassword;
	@FindBy(id="continue")
	WebElement Verifyemail;
	@FindBy(id="signInSubmit")
	WebElement Signin;
	@FindBy(css="#nav-link-accountList > span > span")
	WebElement AccountsLists;
	@FindBy(css="#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last > div > span")
	WebElement YourOrders;
	
	public PomclassAMAZON() {	
		PageFactory.initElements(driver,this);
	}
	//Create Account Amazon.ca
	public void typeusername(String name) {
		System.out.println("Entering the username"+name);
		Username.sendKeys(name);
	}
	public void typeemail( String email) {
		System.out.println("Entering the email"+email);
		Email.sendKeys(email);
	}
	
	public void typepassword(String pass) {
		System.out.println("Entering the password"+pass);
		Password.sendKeys(pass);
	}	
	public void typeconfirmpassword(String confpass) {
		System.out.println("Entering the Confirm password"+confpass);
		ConfirmPassword.sendKeys(confpass);
	}	
	public void clickverifyemail() {
		System.out.println("Clicking Verify button");
		Verifyemail.click();
	}
	public String verify() {
		return driver.getTitle();
	}
	//Signin to Account Amazon.ca
	
	public void clickcontinuebt() {
		System.out.println("Clicking Continue button");
		Verifyemail.click();	
	}
	public void signInSubmit() {
		System.out.println("Clicking SignIn button");
		Signin.click();	
	}
	//Clicking Account&Lists Amazon.ca
	
	public void AccountsLists() {
		System.out.println("Hovering on AccountsLists");
		AccountsLists.click();	
	}
	
	//Clicking Your Orders Amazon.ca
	
		public void YourOrder() {
			System.out.println("Clicking on Your Orders");
			YourOrders.click();	
		}
}
