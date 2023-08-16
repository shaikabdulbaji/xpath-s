package eXPath_with_Index;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath_with_Index {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		chapter1();
	}
	
	public static void highlight(WebElement element)
	{
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);  

	}
	
	// XPath with Index
	public static void chapter1()
	{
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		//highlight(driver.findElement(By.xpath("//table[@id='contactList']/tbody/tr[2]")));
		highlight(driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr/td)[14]")));
	}
	
	

}
