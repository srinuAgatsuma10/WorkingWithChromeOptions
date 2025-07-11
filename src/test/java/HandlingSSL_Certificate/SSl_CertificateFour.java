package HandlingSSL_Certificate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SSl_CertificateFour {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		// Initialize ChromeOptions
		ChromeOptions cop = new ChromeOptions();
		cop.setAcceptInsecureCerts(true);
		// WebDriver
		driver = new ChromeDriver(cop);
	}
	
	@Test
	public void handlingSSL() {
		driver.get("https://self-signed.badssl.com/");
		driver.manage().window().maximize();
		
		System.out.println("Title of the page : "+driver.getTitle());
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
