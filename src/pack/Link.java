package pack;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {
@SuppressWarnings({ "unused", "unchecked" })
public static <WebElement> void main(String[] args) {
	System.setProperty("webdriver.chrome.driver" , "C:\\Users\\ansha\\OneDrive\\Desktop\\selenium webdriver\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String homepage="https://www.facebook.com/";
	driver.get(homepage);
	System.out.println("total link count" +driver.findElements(By.tagName("a")).size());
	
	//WebElement head =(WebElement) driver.findElement(By.id("//id header"));
	//System.out.println("total link in head" +driver.findElements(By.tagName("a")).size());
	WebElement foot =(WebElement) driver.findElement(By.id("pageFooter"));
	System.out.println("total link in footer" +driver.findElements(By.tagName("a")).size());
}
}