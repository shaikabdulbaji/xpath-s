package aTypes_Of_Xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class aAbsolute_Xpath {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		chapter1();
		chapter2();
	}
	
	public static void highlight(WebElement element)
	{
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);  

	}
	
	// Absolute Xpath
	public static void chapter1()
	{
		driver.get("https://www.w3schools.com");
		highlight(driver.findElement(By.xpath("/html/body/div/a[3]")));
	}
	
	//Relative Xpath
	public static void chapter2()
	{
		driver.get("https://www.w3schools.com");
		highlight(driver.findElement(By.xpath("//a[@title='Our Services']")));
	}

}
