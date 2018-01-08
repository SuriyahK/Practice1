package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutContinue {
public static void chkout(WebDriver driver) {
	
	
	driver.findElement(By.xpath(".//*[@id='billing:firstname']")).sendKeys("kim");
	
	driver.findElement(By.xpath(".//*[@id='billing:lastname']")).sendKeys("johnson");
	
	//driver.findElement(By.xpath(".//*[@id='billing:email']")).sendKeys("kj@yahoo.com");
	driver.findElement(By.xpath(".//*[@id='billing:street1']")).sendKeys("10 way");
	driver.findElement(By.xpath(".//*[@id='billing:city']")).sendKeys("harleysville");
	driver.findElement(By.xpath(".//*[@id='billing:country_id']")).sendKeys("United States");
	
	
	
	driver.findElement(By.xpath(".//*[@id='billing:region_id']")).sendKeys("Pennsylvania");
	
	driver.findElement(By.xpath(".//*[@id='billing:postcode']")).sendKeys("19438");
	
	driver.findElement(By.xpath(".//*[@id='billing:customer_password']")).sendKeys("xyz123");
	
	driver.findElement(By.xpath(".//*[@id='billing:confirm_password']")).sendKeys("xyz123");
	
	
	driver.findElement(By.xpath(".//*[@id='co-billing-form']/fieldset/ul/li[2]/div[1]/label")).click();
	driver.findElement(By.xpath(".//*[@id='billing-buttons-container']/button")).click();
	//.//*[@id='co-billing-form']/fieldset/ul/li[2]/div[1]/label
	//.//*[@id='billing:region_id']
	
	
	
	//.//*[@id='billing:lastname']
	
	//.//*[@id='billing-buttons-container']/button
	//.//*[@id='billing:postcode']
}
}
