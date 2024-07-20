package LocatorAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapdealXpath {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name=\"keyword\"][1]")).sendKeys("Wired Earphone");
		driver.findElement(By.xpath("//button[@class=\"searchformButton col-xs-4 rippleGrey\"]")).click();
		String name = driver.findElement(By.xpath("//p[@class='product-title' and @title='Portronics Conch Beat A 3.5 mm Wired Earphone In Ear Light Weight Silver']")).getText();
        System.out.println(name);
	}

}
