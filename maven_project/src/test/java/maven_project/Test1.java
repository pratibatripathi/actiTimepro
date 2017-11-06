package maven_project;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Test1 {
WebDriver driver;

@Parameters("sBrowser")
@BeforeMethod
public void Launch(String sBrowser){
	{
		if(sBrowser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
				
}else if(sBrowser.equalsIgnoreCase("chrome")){
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
}
	}
	
}
@AfterMethod
public void close(){
	driver.quit();
	
}
}
