import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class week6_ajio {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chromedriver","D:\\\\21561\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ajioLink=driver.findElement(By.xpath("//*[@id=\"loginAjio\"]"));
		ajioLink.click();
	    Thread.sleep(2000);
        WebElement facebookBtn=driver.findElement(By.xpath("//*[@id=\"login-modal\"]/div/div/div[2]/div/form/div[1]/div[1]/div[1]/div/span[2]"));
        facebookBtn.click();
		Thread.sleep(2000);
		Set<String> parentWindow = driver.getWindowHandles();
		Iterator<String> iterator = parentWindow.iterator();
		while(iterator.hasNext())
		{
			String childWindow = iterator.next();
			if(!parentWindow.equals(childWindow))
			{
				driver.switchTo().window(childWindow);
				}
				}
		WebElement emailOrMobileNo =
		driver.findElement(By.xpath("//*[@id=\"email\"]"));
        emailOrMobileNo.sendKeys("pavanvasam@gmail.com");
	    WebElement pwd = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		pwd.sendKeys("pavan@123");
        WebElement loginBtn = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/form/div/div[4]/label[2]/input"));
        loginBtn.click();
				}
				
}