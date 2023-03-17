


package thesis;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import base.DriverSetup;
public class Course_enroll extends DriverSetup  {
	String baseUrl="https://courses.rahulshettyacademy.com/";
	
	@Test
public void Course_enroll() throws InterruptedException {
driver.get(baseUrl);
	driver.manage().window().maximize();
	
	driver.get("https://rahulshettyacademy.com/");
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[4]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div[3]/div[1]/div/div[3]/a")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector("//*[@id=\"block-40025179\"]/div/div/div/div/div/ul/li/a/div")).click();
	Thread.sleep(2000);
	
	//WebElement dropdownElement = driver.findElement(By.id("input-subject"));
	//dropdownElement.click();
	
	driver.get("https://courses.rahulshettyacademy.com/courses/java-sdet-automation-package-web-api-mobile-automation/lectures/24795346");
	Thread.sleep(2000);
}
}
		
	