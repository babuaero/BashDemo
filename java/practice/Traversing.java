package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Traversing {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.saucedemo.com/v1/");
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("Phone");
	    driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	    String Phonename = driver.findElement(By.xpath("(//div[.=\"20% off\"])[1]/../../../preceding-sibling::div/div[.=\"Motorola G34 5G (Ocean Green, 128 GB)\"]")).getText();
		
		String Phoneprice = driver.findElement(By.xpath("//div[text()=\"Motorola G34 5G (Ocean Green, 128 GB)\"]/../following-sibling::div//div[text()=\"₹11,999\"]")).getText();
		
		String OfferPercentage  = driver.findElement(By.xpath("//div[.=\"Motorola G34 5G (Ocean Green, 128 GB)\"]/../following-sibling::div//div[.=\"20% off\"]")).getText();
		
		System.out.println("Phonename"+':'+' '+Phonename+' '+'-'+"Price"+':'+Phoneprice+' '+'-'+"OfferPercentage"+':'+OfferPercentage);
		//driver.findElement(By.xpath("(//a[@target='_blank'])[1]")).click();

	}

}
