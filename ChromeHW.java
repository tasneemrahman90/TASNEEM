package hello;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeHW {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver_win32");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.MICROSECONDS);
		driver.navigate().to("http://google.com");
		driver.manage().window().maximize();

	}

}
