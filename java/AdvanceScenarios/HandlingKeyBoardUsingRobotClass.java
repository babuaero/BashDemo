package AdvanceScenarios;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingKeyBoardUsingRobotClass {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		//driver.findElement(By.name("field-keywords")).sendKeys("Nike",Keys.ENTER);
		driver.findElement(By.name("field-keywords")).sendKeys("Bluetooth");
	    Robot rob =	new Robot();
	    rob.keyPress(KeyEvent.VK_ENTER);
	    rob.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}

}
