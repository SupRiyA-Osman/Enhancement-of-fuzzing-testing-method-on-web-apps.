



package thesis;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import base.DriverSetup;
public class Lifetime_acess extends DriverSetup  {
	String baseUrl="https://courses.rahulshettyacademy.com/";
	
	@Test
public void Lifetime_acess() throws InterruptedException {
driver.get(baseUrl);
	driver.manage().window().maximize();
	
	driver.get("https://rahulshettyacademy.com/#/lifetime-access");
	
	Thread.sleep(2000);
	
	
}
}
		
	