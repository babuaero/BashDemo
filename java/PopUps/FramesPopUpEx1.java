package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesPopUpEx1 {

	public static void main(String[] args) {
		// 1) Handling frames using index:---->index vaue starts from 0
		// 2) Handling frames using id() or name() Attribute:
		// 3) Handling frames using WebElements:
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
	/*	driver.switchTo().frame(0);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver); 
	    act.dragAndDrop(drag, drop).perform(); */

	}

}
