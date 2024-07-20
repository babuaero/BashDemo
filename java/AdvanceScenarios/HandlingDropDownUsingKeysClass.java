package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownUsingKeysClass {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		//driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		WebElement dayList = driver.findElement(By.id("day"));
		//WebElement dayList = driver.findElement(By.xpath("//select[@title=\"Day\"]"));
		dayList.click();
		Thread.sleep(2000);
		dayList.sendKeys(Keys.ARROW_DOWN);
		dayList.sendKeys(Keys.ARROW_DOWN);  
		
		dayList.sendKeys(Keys.ARROW_DOWN);
		dayList.sendKeys(Keys.ARROW_DOWN); 
		
		dayList.sendKeys(Keys.ARROW_DOWN);
		dayList.sendKeys(Keys.ARROW_DOWN);
	
		Thread.sleep(2000);
		dayList.sendKeys(Keys.ARROW_UP);
		dayList.sendKeys(Keys.ARROW_UP);
																
		dayList.sendKeys(Keys.ARROW_UP);
		dayList.sendKeys(Keys.ARROW_UP);
		
		dayList.sendKeys(Keys.ARROW_UP); 
		dayList.sendKeys(Keys.ARROW_UP);
		
		WebElement monthList = driver.findElement(By.id("month"));
		Thread.sleep(2000);
        monthList.click();
        
        monthList.sendKeys(Keys.ARROW_DOWN);
        monthList.sendKeys(Keys.ARROW_DOWN);  
		
        monthList.sendKeys(Keys.ARROW_DOWN);
        monthList.sendKeys(Keys.ARROW_DOWN); 
		
        monthList.sendKeys(Keys.ARROW_DOWN);
//what is the issuse   
        monthList.sendKeys(Keys.ARROW_DOWN);
		
        monthList.sendKeys(Keys.ARROW_UP);
        monthList.sendKeys(Keys.ARROW_UP); 
        monthList.sendKeys(Keys.ARROW_UP); 
        monthList.sendKeys(Keys.ARROW_UP); 
        monthList.sendKeys(Keys.ARROW_UP);

	}

}
