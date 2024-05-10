import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class week5_beesresult{

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\ATT\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.get("https://cmritautonomous.org/beeserp/Login.aspx");
		Thread.sleep(1000);
		WebElement search=driver.findElement(By.name("txtUserName"));
		search.sendKeys("21r01a0561");
		Thread.sleep(1000);
		search.sendKeys(Keys.ENTER);
		WebElement search1=driver.findElement(By.name("txtPassword"));
		Thread.sleep(1000);
		search1.sendKeys("Pavan014740");
		search1.sendKeys(Keys.ENTER);
		driver.get("https://cmritautonomous.org/BEESERP/StudentLogin/Student/OverallResultStudent.aspx");
	}

}