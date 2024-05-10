import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class week8_imagedownload {

	public static void main(String[] args) throws InterruptedException, AWTException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\ATT\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("cmrit");
		Thread.sleep(1000);
		search.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		WebElement img=driver.findElement(By.xpath("//a[normalize-space()='Images']"));
		img.click();
		Thread.sleep(1000);
		WebElement img1=driver.findElement(By.xpath("//img[@alt='CMR Institute of Technology | Top Engineering College in Hyderabad']"));
		Actions actions=new Actions(driver);
		actions.contextClick(img1).build().perform();
		Thread.sleep(1000);	
		Robot robot=new Robot();
		for(int i=0;i<7;i++) {
		robot.keyPress(KeyEvent.VK_DOWN);
	    Thread.sleep(1000);
		}
	    /*
	    robot.keyPress(KeyEvent.VK_DOWN);
	    Thread.sleep(1000);
	    robot.keyPress(KeyEvent.VK_DOWN);
	    Thread.sleep(1000);
	    robot.keyPress(KeyEvent.VK_DOWN);
	    Thread.sleep(1000);
	    robot.keyPress(KeyEvent.VK_DOWN);
	    Thread.sleep(1000);
	    robot.keyPress(KeyEvent.VK_DOWN);
	    Thread.sleep(1000);
	    robot.keyPress(KeyEvent.VK_DOWN);
	    Thread.sleep(1000);*/
	    robot.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(1000);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    
}
}