package extent_Reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent_Reports_File_Creation 
{

	public static void main(String[] args) 
	{
		
		String filepath="D:\\sunill\\17th_Sep_11-30AM\\Reports\\MyReports.html";
		ExtentReports reports=new ExtentReports(filepath, true);
		
		ExtentTest test=reports.startTest("Login_invalid", "login with Invalid email");

		test.log(LogStatus.INFO, "Browser launched");
		test.log(LogStatus.SKIP, "Skip maximize browser");
		test.log(LogStatus.PASS, "Test verfied");
		test.log(LogStatus.FAIL, "Data not verifed");
		test.log(LogStatus.FATAL, "Total test fail no workarround");
		test.log(LogStatus.INFO, "Screen captured "
		                 +test.addScreenCapture("imagepath"));
		reports.endTest(test);
		
		
		
		ExtentTest test1=reports.startTest("Login valid");
		test1.log(LogStatus.INFO, "Navigated to login page");
		test1.log(LogStatus.PASS, "Login successfull");
		reports.endTest(test1);
		
		
		reports.flush();
	}

}
