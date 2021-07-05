package Sel2020_1.Sel2020_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindAllLinks {
	
	public static WebDriver driver=null;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		System.setProperty("webdriver.gecko.driver", "C:\\Sel_Training\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.get("http://toolsqa.com/");
		List<WebElement> links= (List<WebElement>) driver.findElement(By.tagName("a"));
		System.out.println(links.size());
		 
		 for ( i = 1; i<=links.size(); i=i+1)
		 
		 {
		 
		 System.out.println(links.get(i).getText());
		 
		 }
		 
	boolean b=links.get(i).isEnabled();
	System.out.println(b);
	
	}

}





