package tests;

import java.net.URL;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class NewSample2 {

	@Test
	public void test1() throws Exception {
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),options);
		driver.get("https://google.com/");
		Thread.sleep(60000);
		driver.quit();
		
	}

}
