package Test;

import java.util.concurrent.TimeUnit;



import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Checkout;
import Pages.CheckoutCont1;
import Pages.CheckoutContinue;
import Pages.FinalPayment;
import Pages.Home;
import Pages.Proceed;
import Pages.Selection;
import Util.Lib;
	public class Test extends Lib{

	 

		static WebDriver driver;

		@Before
		public void before() throws InterruptedException {
			System.out.println("this is before class");

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\anika\\eclipse-workspace\\HwAutomate\\chromedriver.exe");

			// Webdriver is interface
			driver = new ChromeDriver();
			driver.manage().window().maximize();

			driver.get("http://thegreatcourses.com");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Thread.sleep(5000);
			
			
		//driver.findElement(By.xpath(".//*[@id='search'].//*[@id='search']")).sendKeys("math");
		
			//driver.findElement(By.id("search_autocomplete")).click();
			
		//driver.findElement(By.xpath(".//*[@id='search_autocomplete']/ul/li[3]/a")).click();
			//sleep(driver, 2);
		//	.//*[@id='search_mini_form']/div/button
		}

		//private void click() {
			// TODO Auto-generated method stub
			
		
		//http://thegreatcourses.com
		@After
		public void after() {
			driver.manage().deleteAllCookies();
			// driver.close();
		}

		@org.junit.Test
		public void Testing () throws InterruptedException {
			System.out.println("test");
			
		
		
		
			
			//Sel() throws InterruptedException{
				Home hm = new Home();
				hm.ent(driver);
		
		
			
		Selection sl = new Selection (); 
	sl.bookselection(driver);
	Thread.sleep(2000);
	    Proceed pl = new Proceed();
		pl.clickproceed(driver);
		Thread.sleep(2000);
		
		Checkout co = new Checkout();
		co.chkmethod(driver);
		Thread.sleep(2000);
		
		CheckoutContinue co1 = new CheckoutContinue();
		
		co1.chkout(driver);
		
		Thread.sleep(2000);
		
		CheckoutCont1 cck = new CheckoutCont1();
		
		cck.chekout1(driver);
		Thread.sleep(2000);
		
		FinalPayment fp = new FinalPayment();
		
		fp.finalpayment1(driver);
		
		
		
	}}
				

			

