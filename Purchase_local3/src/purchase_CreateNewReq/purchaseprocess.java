package purchase_CreateNewReq;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class purchaseprocess {

	
	
	WebDriver driver;
	@Test(priority=1)
	public void purchase() throws InterruptedException {
		//WebDriver driver=driver1;
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\MUM\\Desktop\\automation\\Purchase_CreateNewReqsn-master\\Purchase1\\src\\object\\chromedriver.exe");
	   driver=new ChromeDriver();
		
	 //get url
	 		driver.get("http://192.168.1.102/JIBE/Account/Login.aspx");
	 		Thread.sleep(4000);
	   
	   driver.findElement(By.id("ctl00_MainContent_LoginUser_UserName")).sendKeys("shailesh");
	   Thread.sleep(3000);
	   driver.findElement(By.id("ctl00_MainContent_LoginUser_Password")).sendKeys("Jibe@123");
	   Thread.sleep(3000);
	   driver.findElement(By.id("ctl00_MainContent_LoginUser_LoginButton")).click();
	   Thread.sleep(3000);
		
	 //get url
		driver.get("http://192.168.1.102/JIBE/purchase/PendingRequisitionDetails.aspx");
		Thread.sleep(4000);
		
		//iframe
		WebElement iframe=driver.findElement(By.id("ctl00_MainContent_mainFrame"));
		driver.switchTo().frame(iframe);
		Thread.sleep(2000);
		
		driver.findElement(By.id("rgdNewREQ_ctl00_ctl04_ImgSelect")).click();
		Thread.sleep(4000);
		
	}
}
