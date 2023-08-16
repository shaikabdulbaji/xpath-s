package gXPath_Axes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * ancestor : //td[text()='Maria Anders']/ancestor::div
 			  //td[text()='Maria Anders']/ancestor::*
 			   	
 * ancestor-or-self : //td[text()='Maria Anders']/ancestor-or-self::* {it include current element also}
 
 * descendant : //table[@id='contactList']/descendant::tr
 				//table[@id='contactList']/descendant::*
 				 
 * descendant-or-self : //table[@id='contactList']/descendant-or-self::* {it include current element also}
 	   
 */

public class XPath_Axes {
	
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
	
	// XPath functions
	public static void chapter1()
	{
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		
		/*
		//following-sibling
		highlight(driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[@type='text']")));
		driver.findElement(By.xpath("//td[text()='Maria Anders']/preceding-sibling::td/input[@type='checkbox']")).click();
		
		//child
		driver.findElement(By.xpath("//td[text()='Maria Anders']/preceding-sibling::td/child::input")).click();
		//table[@id='contactList']/child::tbody/child::tr
		*/
		
		//parent
		highlight(driver.findElement(By.xpath("//td[text()='Maria Anders']/parent::tr")));
	}

}
