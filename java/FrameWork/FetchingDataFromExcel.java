package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchingDataFromExcel {
@Test
//	public static void main(String[] args) throws Throwable {
		public void FetchingDataFromExcel() throws Throwable{
		//step1: path connection
		FileInputStream fis = new FileInputStream("./TestData.xlsx"); 
		
		//step2: excel sheet in read mode
		Workbook book = WorkbookFactory.create(fis);
		
		//step3: control on the sheet
		Sheet sheet = book.getSheet("Sheet1");
		
		//step4: control on the row
		Row row = sheet.getRow(3);
		
		//step5: control on the cell
	    Cell cell = row.getCell(1);
	    
	    String excelData = cell.getStringCellValue();
	    System.out.println(excelData);
	    
	    WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(excelData);
	    		

	}

}
