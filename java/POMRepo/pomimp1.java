package POMRepo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pomimp1 {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver(); 
		 driver.manage().window().maximize();
		 
		 //Step1: Path connection
		 FileInputStream fis = new FileInputStream("./Flipkart.properties");
		 
		 //Step2: load data into properties class
		    Properties pro = new Properties();
		    pro.load(fis);
		    String URL = pro.getProperty("url");
			String SEARCHBAR = pro.getProperty("searchbar");
			String SEARCH = pro.getProperty("search");
			driver.get(URL);
			
			Flipkart search = new Flipkart(driver);
			search.loginToApp(SEARCHBAR, SEARCH);

	}

}
