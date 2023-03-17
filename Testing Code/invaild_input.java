


package thesis;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import base.DriverSetup;
public class invaild_input extends DriverSetup  {
	String baseUrl="https://courses.rahulshettyacademy.com/";
	
	@Test
public void invaild_input() throws InterruptedException {
driver.get(baseUrl);
	driver.manage().window().maximize();
	
	driver.get("https://rahulshettyacademy.com/");
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[7]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("name")).sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
	Thread.sleep(2000);
	
	driver.findElement(By.name("email")).sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("#form-submit")).click();
	Thread.sleep(2000);
	
	//WebElement dropdownElement = driver.findElement(By.id("input-subject"));
	//dropdownElement.click();
	
	
	Thread.sleep(2000);
}
}
		
	