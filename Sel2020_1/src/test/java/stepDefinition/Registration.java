package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Registration {
	public static WebDriver driver=null;
	 // public static Properties OR=new Properties();
	  

	@Given("^I open website$")
	public void i_open_website() throws Throwable {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Sel_Training\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	    driver.get("http://demo.automationtesting.in/Register.html");
	  
	}

	@When("^I enter all valid details$")
	public void i_enter_all_valid_details() throws Throwable {
		
	//	FileInputStream  fis=new FileInputStream(System.getProperty("C://Pramod_Selenium_Projects//Pramod_Mavan_Latest//Pramod_Maven_Adv1//Pramod_Maven_Adv1//OR.properties"));
	//	OR.load(fis);
	    
		driver.findElement(By.xpath("//div/input[@placeholder='First Name']")).sendKeys("Amit");
		//driver.findElement(By.xpath(OR.getProperty("firstname"))).sendKeys("Amit");
		driver.findElement(By.xpath("//div/input[@placeholder='Last Name']")).sendKeys("Jadhav");
		driver.findElement(By.xpath("//div/textarea[@ng-model='Adress']")).sendKeys("Wakad Pune");
		driver.findElement(By.xpath("//div/input[@ng-model='EmailAdress']")).sendKeys("amit@gmail.com");
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("3456789084");
		driver.findElement(By.xpath("//div/label/input[@value='Male']")).click();
		driver.findElement(By.xpath("//div/input[@value='Movies']")).click();
		driver.findElement(By.xpath("//div/select[@id='countries']")).sendKeys("India");
		driver.findElement(By.xpath("//*[@id='yearbox']")).sendKeys("1980");
		driver.findElement(By.xpath("//*[@placeholder='Month']")).sendKeys("March");
		driver.findElement(By.xpath("//*[@id='daybox']")).sendKeys("12");
		driver.findElement(By.xpath("//*[@ng-model='Password']")).sendKeys("Pramod@45678");
		driver.findElement(By.xpath("//*[@ng-model='CPassword']")).sendKeys("Pramod@45678");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("//div/button[@id='submitbtn']")).click();
		
		
	}

	
	   
	
}

