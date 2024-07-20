package LocatorAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonXpath {
@Test
	//public static void main(String[] args) {
	public void AmazonXpath() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Iphone");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		//String Result = driver.findElement(By.partialLinkText("RAPOO")).getText();
		//String Result1 = driver.findElement(By.partialLinkText("₹3,799")).getText();
		//System.out.println(Result); 
		//System.out.println(Result1);
		List<WebElement> allNames = driver.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
		
		for (WebElement name1 : allNames)
		
		
		{
			System.out.println(name1.getText());
		
	    }

	}

}
