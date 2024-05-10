import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class week2_mercurytravels{

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\\\\\\\ATT\\\\\\\\chromedriver-win64\\\\\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercurytravels.co.in/");
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement clogin=driver.findElement(By.xpath("(//a[normalize-space()='Customer Login'])[2]"));
		actions.moveToElement(clogin).build().perform();
		Thread.sleep(2000);
		WebElement reg = driver.findElement(By.xpath("(//a[normalize-space()='Register'])[2]"));
		reg.click();
		Thread.sleep(2000);
		WebElement fn=driver.findElement(By.id("acc_first_name"));
		fn.sendKeys("Pavan");
		Thread.sleep(2000);
		WebElement ln=driver.findElement(By.name("last_name"));
		ln.sendKeys("Vasam");
		Thread.sleep(2000);
		WebElement mail=driver.findElement(By.id("acc_user_email"));
		mail.sendKeys("pavanavasam@gamil.com");
		Thread.sleep(2000);
		WebElement sp=driver.findElement(By.id("acc_user_password"));
		sp.sendKeys("abcdef10");
		Thread.sleep(2000);
		WebElement cp=driver.findElement(By.id("acc_user_passconf"));
		cp.sendKeys("abcdef10");
		Thread.sleep(2000);
		WebElement phno=driver.findElement(By.id("acc_mobile_no"));
		phno.sendKeys("8245697624");
		Thread.sleep(2000);
		WebElement regbt=driver.findElement(By.xpath("//*[@id=\"modalUserLogin\"]/div/div/div[2]/form/button"));
		regbt.click();
		
	}

}