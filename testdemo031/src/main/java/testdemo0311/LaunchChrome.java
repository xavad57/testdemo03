package testdemo0311;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchChrome
{
public static void main(String[] args)
{
	System.setProperty("webdriver.gecko.driver", "D:\\seleniumdrivers\\geckodriver-v0.23.0-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.wikipedia.org/");
	driver.findElement(By.id("js-link-box-en")).click();
	String title2 = "Wikipedia, the free encyclopedia";
	String title1 = driver.getTitle();
	driver.close();
	System.out.println("Title of page : "+title1);
	if(title1.equals(title2))
	{
		System.out.println("passed");
	}
	else
		System.out.println("Failed");

}
}
