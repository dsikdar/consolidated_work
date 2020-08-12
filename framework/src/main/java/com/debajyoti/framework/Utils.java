package com.debajyoti.framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Utils {

	static ExtentTest test;
	static ExtentReports report;
	WebDriver driver;
	
	String getScreenShot() throws IOException {
		String dateValue = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts= (TakesScreenshot) driver;
		File screenshotfile=ts.getScreenshotAs(OutputType.FILE);
		String destinationfileName=dateValue.toString()+".png";
		File DestinationFile = new File(destinationfileName);
		FileUtils.copyFile(screenshotfile, DestinationFile);
		return destinationfileName;
	}
	
	void createExtentReport() {
		report = new ExtentReports("ExtentReportResults.html");
		
	}
	void closeExtentReport() {
		report.flush();
		report.close();
	}
	public void testStepaddScreenshot(int success) throws Exception {

		String screenshotPath = getScreenShot();
		if (success == ITestResult.FAILURE)
			test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath));
		if (success == ITestResult.SUCCESS)
			test.log(LogStatus.PASS, test.addScreenCapture(screenshotPath));

	}
	public static String[][] getUserNamePhoneFromExcel() throws Exception{
		File dataFile=new File("src//main//java//testdata//phonebookdata.xlsx");
		
		FileInputStream dataInputStream=new FileInputStream(dataFile);
		XSSFWorkbook book=new XSSFWorkbook(dataInputStream);
		XSSFSheet sheet=book.getSheet("data");
		int rownumber=sheet.getPhysicalNumberOfRows();
		String rowdata[][]=new String[rownumber][2];
		for(int i=0 ; i< rownumber ; i++ ) {
			//for(int j=1;j<2;j++) {
				rowdata[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
				rowdata[i][1]=sheet.getRow(i).getCell(1).getRawValue();
			//}
				
		}
		
		return rowdata;
	}
}
