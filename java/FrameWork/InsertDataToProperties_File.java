package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InsertDataToProperties_File {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("./PropertyData.properties"); //readmode
		
		
		Properties pro = new Properties();
		pro.load(fis);
		pro.getProperty("url", "https://www.saucedemo.com/v1/");
	    pro.getProperty("username","standard_user");
		pro.getProperty("password","secret_sauce");
		
		FileOutputStream fos = new FileOutputStream("./PropertyData.properties"); //writemode
		pro.store(fos, "COMMONDATA");
		//fetching Data
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver(); 
		 FileInputStream fis1 = new FileInputStream("./PropertyData.properties");
		 
		 //Step2 : load data into properties class
		 
			Properties pro1 = new Properties();
			pro.load(fis);
			String URL = pro.getProperty("url");
			String USERNAME = pro.getProperty("username");
			String PASSWORD = pro.getProperty("password");
			driver.get(URL);
			driver.findElement(By.id("user-name")).sendKeys(USERNAME);
			driver.findElement(By.id("password")).sendKeys(PASSWORD);	    
			driver.findElement(By.id("login-button")).click();	  

	}

}
