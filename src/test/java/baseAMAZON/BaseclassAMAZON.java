package baseAMAZON;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseclassAMAZON {

	public static Properties prop=new Properties();
	public static WebDriver driver;

	public BaseclassAMAZON () {
		try {
		
			FileInputStream file=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\AmazonProject\\src\\test\\java\\enviornmentvariablesAMAZON\\config.propertiesAMAZON");
			prop.load(file);
		}
			catch(FileNotFoundException e) {
				e.printStackTrace();
		}
			catch(IOException a) {
				a.printStackTrace(); 
		}
	}

	
	@SuppressWarnings("deprecation")
	public static void initiate() {
		String browsername=	prop.getProperty("browser");
		
		if(browsername.equals("ChromeDriver")) {
			System.setProperty("WebDriver.Chrome.Driver", "chromedriver.exe");
			driver=new ChromeDriver();					
		}
		else if(browsername.equals("FirefoxDriver")) {
			System.setProperty("WebDriver.Gecko.driver", "geckodriver.exe");			
			driver=new FirefoxDriver();
		}
		driver.get(prop.getProperty("url"));		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	
	}	
	public static void screenshots(String Filename) {
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file,new File("C:\\Users\\DELL\\eclipse-workspace\\AmazonProject\\src\\test\\java\\screeenshotsAMAZON\\ScreenshotsAMAZON"+Filename+".jpg"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}

//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
