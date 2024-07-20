package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonEx {
@Test
	//public static void main(String[] args) {
	public  void AmazonEx() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
		
		//driver.findElement(By.name("field-keywords")).sendKeys("Amazon miniTV");
		//driver.findElement(By.className("nav-input nav-progressive-attribute")).click();
        //LinkText()
        //driver.findElement(By.linkText("Amazon miniTV")).click();
        //PartialLinkText()
       // driver.findElement(By.partialLinkText("Amazon m")).click();
        //driver.findElement(By.partialLinkText("Today's")).click();
      //cssSelector()
        driver.findElement(By.cssSelector("[href=\"/gp/bestsellers/?ref_=nav_cs_bestsellers\"]")).click();
        
        
	}

}