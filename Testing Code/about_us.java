



package thesis;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import base.DriverSetup;
public class about_us extends DriverSetup  {
	String baseUrl="https://courses.rahulshettyacademy.com/";
	
	@Test
public void about_us() throws InterruptedException {
driver.get(baseUrl);
	driver.manage().window().maximize();
	
	driver.get("https://rahulshettyacademy.com/about-my-mission");
	
	Thread.sleep(2000);
	
	
}
}
		
	