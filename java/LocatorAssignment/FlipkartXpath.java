package LocatorAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartXpath {

	public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@class=\"Pke_EE\"]")).sendKeys("Iphone");
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			//String name = driver.findElement(By.xpath("//div[contains(text(),\"Apple iPhone\")]")).getText();
			//String Result = driver.findElement(By.partialLinkText("Apple iPho")).getText();
			//String Result1 = driver.findElement(By.partialLinkText("Apple")).getText();
			//System.out.println(Result); 
			//System.out.println(Result1);
			//System.out.println(name); 
			// method 2 Xpath
			//String name = driver.findElement(By.xpath("//div[@class=\"_4rR01T\"][1]")).getText();
			//System.out.println(name); 
			//String Price = driver.findElement(By.xpath("//div[@class=\"_30jeq3 _1_WHN1\"][1]")).getText();
			//System.out.println(Price); 
			
			List<WebElement> allNames = driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]"));
			List<WebElement> allPrice = driver.findElements(By.xpath("//div[@class=\"_30jeq3 _1_WHN1\"]"));
			
			for (WebElement name1 : allNames)
			for (WebElement price1 : allPrice)	
			
			{
				System.out.println(name1.getText());
				System.out.println(price1.getText());
		    }
			
		
	}

}
