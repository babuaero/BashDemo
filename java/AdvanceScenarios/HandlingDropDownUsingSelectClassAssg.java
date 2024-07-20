package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownUsingSelectClassAssg {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//span[text()=\"Account & Lists\"]"));
        Actions act = new Actions(driver);
        act.moveToElement(ele).perform();
		driver.findElement(By.xpath("//span[text()=\"Your Account\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt=\"Your Addresses\"]")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//input[@id=\"ap_email\"]")).sendKeys("babuaerospace@gmail.com");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ap_password")).sendKeys("Lakshana12");
		driver.findElement(By.xpath("//input[@type=\"submit\"][1]")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h2[text()=\"Add address\"]")).click();
		driver.findElement(By.id("address-ui-widgets-enterAddressFullName")).sendKeys("RAKESH",Keys.TAB,"7777788888",Keys.TAB,"560071",Keys.TAB,"81",Keys.TAB,"ANNA SAALAI",Keys.TAB,"NEAR ANM",Keys.TAB,"BANGALORE");
		WebElement statelist = driver.findElement(By.id("address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId"));
		Select sel = new Select(statelist);
	    sel.selectByVisibleText("TAMIL NADU");
		driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
		driver.findElement(By.xpath("(//input[@class=\"a-button-input\"])[3]")).sendKeys(Keys.ENTER);
		
	}

	}


