package maven_project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Test1_2 extends Test1{
	@Test
	public void click() throws Exception{
	driver.get("http://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
        driver.findElement(By.linkText("Selenium - Web Browser Automation")).click();

	}

}
