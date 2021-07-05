package Sel2020_1.Sel2020_1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autosuggestion {
	
	public static WebDriver driver=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver", "C:\\Sel_Training\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		//driver.manage().timeouts().implicitlyWait(05,TimeUnit.SECONDS) ;
		 driver.findElement(By.name("q")).sendKeys("sel");
		 
		 List<WebElement> Google= driver.findElement(By.xpath("//ul[@role='listbox//li'")).findElements(By.xpath("//li[@role='presentation'"));
		 for (int i = 0; i < Google.size(); i++) {
	    		System.out.println(Google.get(i).getText());
	    	}
		 
		 
		 
	}

}
