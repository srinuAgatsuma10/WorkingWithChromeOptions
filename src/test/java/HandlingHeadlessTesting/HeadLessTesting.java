package HandlingHeadlessTesting;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessTesting {

	public static void main(String[] args) {
		
		//Creating Chrome Options
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--headless=new");
		
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		
		String titile = driver.getTitle();
		if(titile.equals("YouTube")) {
			System.out.println("test pass...");
		}
		else {
			System.out.println("test fail...");
		}

	}

}
