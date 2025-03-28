package HandlingSSL_Certificate;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SSL_Certificate {

	WebDriver driver;

	@BeforeClass
	public void setUp() {

		// Creating Chrome Options
		ChromeOptions opt = new ChromeOptions();
		opt.setAcceptInsecureCerts(true);
		// Initiate ChromeDriver
		driver = new ChromeDriver(opt);
	}

	@Test
	public void sslCertificate() {
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		
		System.out.println("Driver of the page: "+driver.getTitle());
	}

	@AfterClass()
	public void tearDown() {
		driver.quit();
	}

}
