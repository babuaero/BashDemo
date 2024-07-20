package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWebElements {
 // part2 Java selenium
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		int count=0;
		for (WebElement link : allLinks)
		{
			//System.out.println(link.getText()); // fetching all the visible text present in the links website;
		    System.out.println(link.getAttribute("href"));  // fetching all the actual text present in the links;
		    count++;
        }
		System.out.println("total num of links:"+count);

}
}