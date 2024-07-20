package POMRepo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PomImp {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver(); 
		 driver.manage().window().maximize();
		 
		 //Step1: Path connection
		 FileInputStream fis = new FileInputStream("./PropertyData.properties");
		 
		//Step2: load data into properties class
		 Properties pro = new Properties();
		 pro.load(fis);
		   String URL = pro.getProperty("url");
			String USERNAME = pro.getProperty("username");
			String PASSWORD = pro.getProperty("password");
			driver.get(URL);
		/*	driver.findElement(By.id("user-name")).sendKeys(USERNAME);
			driver.findElement(By.id("password")).sendKeys(PASSWORD);	    
			driver.findElement(By.id("login-button")).click(); */
			
			//Implementing using POM class
		/*	LoginPage login = new LoginPage(driver);
			login.getUserTextField().sendKeys(USERNAME);
			login.getPasswordTextField().sendKeys(PASSWORD);
			login.getLoginButton().click(); */
			
			LoginPage login = new LoginPage(driver);
			login.logicToApp(USERNAME, PASSWORD);
			

	}

}
