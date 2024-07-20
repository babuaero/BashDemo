package AdvanceScenarios;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingKeyBoardUsingRobotClassEg1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
	//	driver.get("https://www.facebook.com/");
		/* driver.findElement(By.name("user-name")).sendKeys("standard_user",Keys.TAB);
		driver.findElement(By.name("password")).sendKeys("secret_sauce");  
		driver.findElement(By.id("login-button")).sendKeys(Keys.ENTER);
	    Robot rob =	new Robot();
	    rob.keyPress(KeyEvent.VK_ENTER);
	    rob.keyRelease(KeyEvent.VK_ENTER); */
	//	scenario 1:
	/*	Robot robot =	new Robot();
	    driver.findElement(By.id("user-name")).sendKeys("standard_user");
	    
	    robot.keyPress(KeyEvent.VK_TAB);
	    robot.keyRelease(KeyEvent.VK_TAB);
	    
	    driver.findElement(By.id("password")).sendKeys("secret_sauce");
	    
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);  */
		
	//Scenario 2:
		// case 1:
		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
	/*	driver.findElement(By.id("email")).sendKeys("babuaero@gmail.com");
		Robot robot =	new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_A);
		
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);  */
		
		// case 2:
		/* WebElement UN = driver.findElement(By.name("user-name"));
	      UN.sendKeys("standard_user");
	      UN.sendKeys(Keys.COMMAND, "a");
	      UN.sendKeys(Keys.COMMAND, "c");
	      WebElement PW = driver.findElement(By.id("password"));
	      PW.sendKeys(Keys.COMMAND, "v");  */
	}

}
