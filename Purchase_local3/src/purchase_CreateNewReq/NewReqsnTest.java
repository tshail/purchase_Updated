package purchase_CreateNewReq;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import common_Function.WebDriverPass;

public class NewReqsnTest extends WebDriverPass{
	
	
	
	
	ExtentReports report;
	ExtentTest test;
	newReqsn p=new newReqsn();

	@Test(priority = 1)
	public void search() throws Exception {
		test = report.startTest("search ");
		p.search(driver);
		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "purchase-->purchase process--> New Reqsn-->search Functionality");
		System.out.println("purchase-->purchase process--> New Reqsn-->search Functionality Successfully run");
	}
	/*@Test(priority = 2)
	public void Remarks() throws Exception {
		test = report.startTest("Vessel Remarks ");
		p.Remarks(driver);
		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "purchase-->purchase process--> New Reqsn-->Vessel Remarks");
	}
	
	

	@Test(priority = 3)
	public void AllRemarks() throws Exception {
		test = report.startTest("All Remarks ");
		p.AllRemarks(driver);
		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "purchase-->purchase process--> New Reqsn-->All Remarks");
	}
	*/
	
	@Test(priority = 4)
	public void holdtounhold() throws Exception {
		test = report.startTest("hold to unhold ");
		p.holdtounhold(driver);
		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "purchase-->purchase process--> New Reqsn-->hold to unhold");
	}
	
	/*@Test(priority = 5)
	public void DuplicateRequisition() throws Exception {
		test = report.startTest("Duplicate Requisition ");
		p.DuplicateRequisition(driver);
		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "purchase-->purchase process--> New Reqsn-->Duplicate Requisition");
	}
	
	@Test(priority = 6)
	public void AddItemsfromOfficeside() throws Exception {
		test = report.startTest("Add Items from Office side ");
		p.AddItemsfromOfficeside(driver);
		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "purchase-->purchase process-->Add Items from Office side");
	}
	
	
	@Test(priority = 7)
	public void Addattachment() throws Exception {
		test = report.startTest("Add attachment ");
		p.Addattachment(driver);
		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "purchase-->purchase process-->Add attachmente");
	}
	
	
	@Test(priority = 8)
	public void Supplier() throws Exception {
		test = report.startTest("supplier");
		p.Supplier(driver);
		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "purchase-->purchase process-->create New Reqsn-->supplier");
	}*/
	
	@AfterMethod
	public void afterMethod(ITestResult result) {
	    if (result.getStatus() == ITestResult.FAILURE) {
	        test.log(LogStatus.FAIL, "Test failed " + result.getThrowable());
	    } else if (result.getStatus() == ITestResult.SKIP) {
	        test.log(LogStatus.SKIP, "Test skipped " + result.getThrowable());
	    } else {
	        test.log(LogStatus.PASS, "Test passed");
	    }
	    report.endTest(test);
	    report.flush();
}
  @BeforeSuite
  public void beforeSu() {
	  report = newReqsn.getReporter(path.concat("Report.html"));
  }
  
 /* @AfterSuite
public void afterSu() {
      report.close();
  }*/
}


