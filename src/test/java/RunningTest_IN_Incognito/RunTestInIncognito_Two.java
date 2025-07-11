package RunningTest_IN_Incognito;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RunTestInIncognito_Two {
	
	public static void main(String[] args) {
		// Chrome Options
		ChromeOptions cop = new ChromeOptions();
		cop.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(cop);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href='/downloads']")).click();
		
		driver.close();
	}

}
