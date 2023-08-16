package fXPath_functions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * There are 6 XPath functions are there, they are :
    	1. text
    	2. contains 		: //a[contains(text(), 'in into')]
    	3. starts-with		: //a[starts-with(text(),'Sign in into')]
    	4. normalize-space	: //h1[normalize-space(text())= 'XPath Practice']
    	5. last				: (//table[@id='contactList']/tbody/tr)[last()]
    	6. position			: (//table[@id='contactList']/tbody/tr)[position()=2]
    	
  * All most all contains and starts-with both are same.
  * All most all last and position both are same.
  
 */


public class XPath_functions {
	
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
		//text
		highlight(driver.findElement(By.xpath("//label[text()='Last Name']")));
		highlight(driver.findElement(By.xpath("//a[text()='Sign in into account']")));
		
		//contains : If we want to find the element with partial text.
		highlight(driver.findElement(By.xpath("//a[contains(text(), 'in into')]")));
		highlight(driver.findElement(By.xpath("//label[contains(text(), 'Repeat')]")));
		
		
		//another way of contains : If we want to find the element with partial attribute value.
		highlight(driver.findElement(By.xpath("//h1[contains(@class, 'post-title')]"))); 
		highlight(driver.findElement(By.xpath("(//div[contains(@class, 'menu')])[6]"))); 
		 
		//starts-with : If we want to find the element with starting text.
		highlight(driver.findElement(By.xpath("//a[starts-with(text(),'Sign in into')]")));
		
		//normalize-space : If we want to find the element with spaces at starting and ending of text.
		highlight(driver.findElement(By.xpath("//h1[normalize-space(text())= 'XPath Practice']")));		
		highlight(driver.findElement(By.xpath("//label[normalize-space(text())='First Name']")));
		
		//last : If we want to find the element with at last in row or last in column any no.of rows 
		//and columns will update in feature it will identify last element.
		highlight(driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr)[last()]")));		
		*/
		
		//position : If we want to find the element with position, we can find this with operators like
		// (//table[@id='contactList']/tbody/tr)[position()>2], (//table[@id='contactList']/tbody/tr)[position()!=2]
		highlight(driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr)[position()=2]")));	
		System.out.println(driver.findElements(By.xpath("(//table[@id='contactList']/tbody/tr)[position()>2]")).size());	
	}
	
	

}
