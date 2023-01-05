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
	@FindBy(css="#nav-xshop > a:nth-child(2)")
	WebElement Deals;
	@FindBy(css="#grid-main-container > div.a-row.Grid-module__gridSection_1SEJTeTsU88s6aVeuuekAp > div > div:nth-child(1) > div > div > a > div > div")
	WebElement ProductCategory;
	@FindBy(css="#octopus-dlp-asin-stream > ul > li:nth-child(2) > span > div > div.a-section.a-spacing-base.a-text-center.octopus-dlp-image-section > a > div")
	WebElement FirstProduct;
	@FindBy(css="#abb-intl-pop-cta > span.a-button.a-button-base.abb-intl-decline > span > input")
	WebElement Nothanks;
	@FindBy(id="add-to-cart-button")
	WebElement AddtoCart;
	@FindBy(css="#sc-buy-box-ptc-button > span > input")
	WebElement ProceedToRetailCheckout;
	@FindBy(id="orderSummaryPrimaryActionBtn")
	WebElement Shipto;
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
	//Clicking on Deals Tab Amazon.ca	
	public void deals() {
		System.out.println("Clicking on Deals Tab");
		Deals.click();	
	}	
	//Clicking on Product Category Tile for Products Amazon.ca	
	public void category() {
		System.out.println("Clicking on Product Category");
		ProductCategory.click();	
	}
	//Clicking on FirstProduct of Selected Category Amazon.ca	
	public void product() {
		System.out.println("Clicking on FirstProduct");
		FirstProduct.click();	
	}
	//Clicking on Add to Cart for Selected product Amazon.ca	
	public void nothanks() {
		System.out.println("Clicking on No Thanks");
		Nothanks.click();
	}
	//Clicking on Add to Cart for Selected product Amazon.ca	
	public void cart() {
		System.out.println("Clicking on AddtoCart");
		AddtoCart.click();	
	}
	//Clicking on ProceedToRetailCheckout Amazon.ca
	public void checkout() {
		System.out.println("Clicking on ProceedToRetailCheckout");
		ProceedToRetailCheckout.click();	
	}	
	//Clicking on ship to selected address Amazon.ca
	public void shipto() {
		System.out.println("Clicking on Ship to Address");
		Shipto.click();	
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
