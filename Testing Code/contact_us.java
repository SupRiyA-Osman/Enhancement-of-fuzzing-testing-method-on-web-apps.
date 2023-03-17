
package thesis;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import base.DriverSetup;
public class contact_us extends DriverSetup  {
	String baseUrl="https://courses.rahulshettyacademy.com/";
	
	@Test
public void contact_us() throws InterruptedException {
driver.get(baseUrl);
	driver.manage().window().maximize();
	
	driver.get("https://www.rahulshettyacademy.com/contact-us");
	
	
	driver.findElement(By.name("username")).sendKeys("mouly");
	Thread.sleep(2000);
	driver.findElement(By.name("mobileno")).sendKeys("01710416153");
	Thread.sleep(2000);
	driver.findElement(By.name("country")).sendKeys("Bangladesh");
	Thread.sleep(2000);
	driver.findElement(By.name("email")).sendKeys("mouly@gmail.com");
	Thread.sleep(2000);
	
	//WebElement dropdownElement = driver.findElement(By.id("input-subject"));
	//dropdownElement.click();
	
	Thread.sleep(2000);
	Thread.sleep(9000);
	Thread.sleep(2000);
	// create a new instance of the Select class and pass in the dropdown element
	//Select a = new Select(dropdownElement);

	// select an option by its visible text
	//a.selectByVisibleText("Apply For A Teacher");
	Thread.sleep(2000);
	driver.findElement(By.name("message")).sendKeys("no message");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("#contactUsForm > div > div:nth-child(7) > button")).click();
	
	Thread.sleep(2000);
}
}
		
	