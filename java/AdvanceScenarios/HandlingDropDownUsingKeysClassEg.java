package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropDownUsingKeysClassEg {

		public static void main(String[] args) throws Throwable {
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.amazon.in");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//span[@class=\"nav-icon nav-arrow\"][1]")).click();
		  
			WebElement languageList1 = driver.findElement(By.name("lop"));
		
			Thread.sleep(2000);
			
			languageList1.sendKeys(Keys.ARROW_DOWN);
			languageList1.sendKeys(Keys.ARROW_DOWN);  
			
			languageList1.sendKeys(Keys.ARROW_DOWN);
			languageList1.sendKeys(Keys.ARROW_DOWN);
			
			languageList1.sendKeys(Keys.ARROW_DOWN);
			languageList1.sendKeys(Keys.ARROW_DOWN);
			
			
			languageList1.sendKeys(Keys.ARROW_DOWN);
			languageList1.sendKeys(Keys.ARROW_DOWN);
			
			Thread.sleep(2000);
			languageList1.sendKeys(Keys.ARROW_UP);
			languageList1.sendKeys(Keys.ARROW_UP);
			
			languageList1.sendKeys(Keys.ARROW_UP);
			languageList1.sendKeys(Keys.ARROW_UP);
			

		}

	}


