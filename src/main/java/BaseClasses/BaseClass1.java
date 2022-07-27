 package BaseClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import UtilityClasses.Util1;

public class BaseClass1 {

	static WebDriver driver = null;
	public static WebDriver getDriver(String browser) throws IOException {
		System.out.println(driver);
		if(driver==null) {
			if(browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "D:\\programms\\flipkart_maven\\src\\main\\resources\\Browser\\chromedriver.exe");
				driver = new ChromeDriver();
			}else if(browser.equals("firefox")) {
				 System.setProperty("webdriver.gecko.driver", "D:\\programms\\flipkart_maven\\src\\main\\resources\\Browser\\geckodriver.exe");
				 driver = new FirefoxDriver();
			}
			driver.get(Util1.getProperty("url"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			return driver;
		}else {
			System.out.println("in else");
			return driver;
		}
		
	}

}
