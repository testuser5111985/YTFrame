package org.testing.TestScripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class tc1 {

	@BeforeMethod
public void lunchurl() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\smrati.rai\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	
}

}
