package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myclass {
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver\\" , "C:\\Users\\ansha\\OneDrive\\Desktop\\selenium webdriver\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String alertMessage ="";
	driver.get("https://jsbin.com/Usidix/1");
	driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
	alertMessage = (String) driver.switchTo().alert().getText();
	driver.switchTo().alert().accept();
	System.out.println(alertMessage);
	driver.quit();
}
}
