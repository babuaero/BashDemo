package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseActions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		//Move
	/*	WebElement ele = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
        Actions act = new Actions(driver);
        act.moveToElement(ele).perform();
        
        //Rightclick
        WebElement ele1 = driver.findElement(By.xpath("//a[text()=\"Mobiles\"]"));
        act.contextClick(ele1).perform();  */
		
	/*	driver.get("https://www.saucedemo.com/v1/");
		WebElement USERNAME = driver.findElement(By.id("user-name"));
		WebElement PASSWORD = driver.findElement(By.id("password"));
		WebElement LOGIN = driver.findElement(By.id("login-button"));
		
		 Actions act = new Actions(driver);
		/* act.sendKeys(USERNAME, "standard_user").perform();
		 act.sendKeys(PASSWORD, "secret_sauce").perform();
		 act.click(LOGIN).perform();  */
		 //or
		 //with or without build it will work
		// act.sendKeys(USERNAME, "standard_user").sendKeys(PASSWORD, "secret_sauce").click(LOGIN).build().perform();
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	//	WebElement drag = driver.findElement(By.id("draggable"));
		//WebElement drop = driver.findElement(By.id("droppable"));
	//	Actions act = new Actions(driver); 
		//act.clickAndHold(drag).perform();
		//act.release(drop).perform();
		
		//or
		//act.clickAndHold(drag).release(drop).perform();
		
		//or
	 // act.dragAndDrop(drag, drop).perform();
		
	/*	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement ele = driver.findElement(By.xpath("//button[text()=\"Double-Click Me To See Alert\"]"));
		
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();  */
		
		// CLOSING POPUP
	/*	driver.get("https://www.goibibo.com/");
		Actions act = new Actions(driver);
		act.moveByOffset(20, 30).click().perform(); // offset any values we can give  */
		
		
	}
	

}
