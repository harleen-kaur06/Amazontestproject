package testlayerAMAZON;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseAMAZON.BaseclassAMAZON;
import pompackageAMAZON.PomclassAMAZON;
import testclassAMAZON.ExcelsheetsAMAZON;

public class LogintestclassAMAZON extends BaseclassAMAZON {
	PomclassAMAZON log;
	
	public LogintestclassAMAZON() {
		super();
	}
	
	@BeforeMethod
	public void initsetup() throws InterruptedException {
		initiate();		
		log= new PomclassAMAZON();		  
	}

@Test(priority=1,enabled=false)
	public void Title() {		
		String actual=log.verify();
		System.out.println("Verifying the page title has started");
		System.out.println(actual);	
		System.out.println("The page title has been successfully verified");	
		Assert.assertEquals(actual,"Amazon Registration");
	}
@DataProvider 
public Object[][] Details(){ 
	Object result[][]=ExcelsheetsAMAZON.readdata("Sheet1"); 
	return result; 
}
//Create Account on Amazon.ca
	@Test(priority=2 ,enabled=false, dataProvider="Details")
	// With Excel File Entries
	public void CreateAccount(String name,String email,String password,String confirmpassword) throws InterruptedException {
			log.typeusername(name);
			Thread.sleep(3000);
			log.typeemail(email);
			Thread.sleep(3000);
			log.typepassword(password);
			Thread.sleep(3000);
			log.typeconfirmpassword(confirmpassword);
			Thread.sleep(3000);
			log.clickverifyemail();
			Thread.sleep(3000);
	}
	/* With Config File Entries
	 public void CreateAccount(String name,String email,String password,String confirmpassword) throws InterruptedException {
			log.typeusername(prop.getProperty("name"));
			Thread.sleep(3000);
			log.typeemail(prop.getProperty("email"));
			Thread.sleep(3000);
			log.typepassword(prop.getProperty("password"));
			Thread.sleep(3000);
			log.typeconfirmpassword(prop.getProperty("confirmpassword"));
			Thread.sleep(3000);
			log.clickverifyemail();
			Thread.sleep(3000);
	}*/

//SignIn Account on Amazon.ca
	@Test(priority=3, enabled=true )
	public void SignIn() throws InterruptedException {
		driver.get(prop.getProperty("url1"));
		log.typeemail(prop.getProperty("email"));
		log.clickcontinuebt();
		log.typepassword(prop.getProperty("password"));
		log.signInSubmit();
		Thread.sleep(500);		
		//Clicking on Deals Tab Amazon.ca
		log.deals();
		Thread.sleep(1500);
		//Clicking on Product Category Tile for Products Amazon.ca	
		log.category();
		Thread.sleep(500);	
		//Clicking on FirstProduct of Selected Category Amazon.ca	
		log.product();
		Thread.sleep(500);
		//Clicking on No Thanks Pop-up to go Add to Cart for Selected product Amazon.ca			
		log.cart();
		Thread.sleep(500);
		//Clicking on Add to Cart for Selected product Amazon.ca
		log.nothanks();
		Thread.sleep(500);
		//Clicking on ProceedToRetailCheckout Amazon.ca
		log.checkout();
		Thread.sleep(500);		
		//Clicking on ship to selected address Amazon.ca
		log.shipto();
		Thread.sleep(500);	
		//Your Account on Amazon.ca		
		log.AccountsLists();			
		Thread.sleep(3000);		
		//Your Orders on Amazon.ca
		log.YourOrder();			
		Thread.sleep(3000);
	}
		
  @AfterMethod 
  public void close() throws InterruptedException {
	  Thread.sleep(3000); driver.close(); 
  }		 
		 
}
