package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Util.Lib;
public class Home {
	public static void ent(WebDriver driver) throws InterruptedException {
	
	WebElement emaillogin = driver.findElement(By.id("search"));
	emaillogin.sendKeys("Zero to Infinity");
	
	//sleep(driver, 2);
	Thread.sleep(5000);
	driver.findElement(By.xpath(".//*[@id='search_autocomplete']/ul/li[3]/a")).click();

}}
