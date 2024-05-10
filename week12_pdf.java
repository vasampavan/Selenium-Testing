import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class week12_pdf {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		System.setProperty("Webdriver.chrome.driver","E:\\\\ATT\\\\chromedriver-win64\\\\chromedriver-win64\\chromedriver.exe");
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("word to pdf");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement link=driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div/div[1]/div/div/span/a/h3"));
		link.click();
		Thread.sleep(1000);		
		WebElement select=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/header/div[2]/div/div/label/div/div[2]/form/label/div/div[2]/button[1]/span"));
		select.click();
		Thread.sleep(1000);
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		StringSelection str=new StringSelection("Downloads\\ex.docx");
		Thread.sleep(1000);
		clipboard.setContents(str, null);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(15000);
		WebElement download=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/header/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/div/button[1]/div"));
		download.click();
	}

}