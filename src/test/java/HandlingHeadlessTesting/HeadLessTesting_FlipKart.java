package HandlingHeadlessTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class HeadLessTesting_FlipKart {
	public static void main(String[] args) {
		
		// Initialize Chrome Options.
		ChromeOptions cop = new ChromeOptions();
		cop.addArguments("--headless=new");
		
		WebDriver driver = new ChromeDriver(cop);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement logo = driver.findElement(By.xpath("//img[@title='Flipkart']"));
		if(logo.isDisplayed()) {
			Assert.assertTrue(true);
			System.out.println("Test got passed");
		}
		else {
			Assert.assertTrue(false);
			System.out.println("Test got Failed");
		}
	}
}
