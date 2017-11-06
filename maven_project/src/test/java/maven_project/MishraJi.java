package maven_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MishraJi {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.quit();
		

	}

}
