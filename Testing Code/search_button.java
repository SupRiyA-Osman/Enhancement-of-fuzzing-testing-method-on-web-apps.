

package thesis;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import base.DriverSetup;
public class search_button extends DriverSetup  {
	String baseUrl="https://courses.rahulshettyacademy.com/";
	
	@Test
public void search_button() throws InterruptedException {
driver.get(baseUrl);
	driver.manage().window().maximize();
	
	driver.get("https://courses.rahulshettyacademy.com/courses");
	
	
	
	driver.findElement(By.xpath("//*[@id=\"search-courses\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("query")).sendKeys("All-Access Membership");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("#search-course-button")).click();
	Thread.sleep(2000);
	
	//WebElement dropdownElement = driver.findElement(By.id("input-subject"));
	//dropdownElement.click();
	
	
	Thread.sleep(2000);
}
}
		
	