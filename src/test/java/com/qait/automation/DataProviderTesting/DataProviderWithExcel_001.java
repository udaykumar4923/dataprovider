package com.qait.automation.DataProviderTesting;


		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;

		import org.openqa.selenium.WebDriver;

		import org.openqa.selenium.firefox.FirefoxDriver;

		import org.testng.annotations.AfterMethod;

		import org.testng.annotations.BeforeMethod;

		import org.testng.annotations.Test;

		import org.testng.annotations.DataProvider;

		import utilities.ExcelUtils;

	public class DataProviderWithExcel_001 {

//	    @BeforeMethod
//	    public void beforeMethod() throws Exception {
//		}

	@Test(dataProvider="Authentication")
    public void Registration_data(String sUserName,String sPassword)throws  Exception{
		System.out.println(sUserName + " : " +sPassword);
		}

    @DataProvider
    public Object[][] Authentication() throws Exception{
    	String path = "/home/qainfotech/eclipse-workspace/TestNgTest/src/testData/TestData1.xlsx";
    	String sheet = "Sheet1";
         Object[][] testObjArray = ExcelUtils.getTableArray(path,sheet);
         return (testObjArray);

		}

//    @AfterMethod
//    public void afterMethod() {
//    	}

}