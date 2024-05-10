import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class week10_email{

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:\\ATT\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.gmail.com/");
		Thread.sleep(2000);
        WebElement createAccount = driver.findElement(By.xpath("(//span[normalize-space()='Create account'])[1]"));
        createAccount.click();
        Thread.sleep(2000);
        WebElement mySelft = driver.findElement(By.xpath("(//span[normalize-space()='For my personal use'])[1]"));
        mySelft.click();
        Thread.sleep(2000);
        WebElement firstname = driver.findElement(By.name("firstName"));
		firstname.sendKeys("Pavan");
		Thread.sleep(1000);
		WebElement lastname=driver.findElement(By.name("lastName"));
		lastname.sendKeys("Vasam");
		Thread.sleep(1000);
        WebElement bnl = driver.findElement(By.xpath("(//span[normalize-space()='Next'])"));
	    bnl.click();
	    Thread.sleep(3000);
	    Select month = new Select(driver.findElement(By.xpath("//select[@id='month'][1]")));
		month.selectByValue("7");
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.xpath("//input[@id='day'][1]"));
		day.sendKeys("14");
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.xpath("//input[@id='year'][1]"));
		year.sendKeys("2003");
		Thread.sleep(2000);
		Select gender = new Select(driver.findElement(By.xpath("//select[@id='gender'][1]")));
		gender.selectByValue("1");
		Thread.sleep(2000);
		WebElement bn2 = driver.findElement(By.xpath("(//span[normalize-space()='Next'])"));
	    bn2.click();
	    Thread.sleep(3000);
	    WebElement create=driver.findElement(By.id("selectioni3"));
	    create.click();
	    WebElement uid = driver.findElement(By.name("Username"));
	    uid.sendKeys("pavan57");
	    WebElement bn3 = driver.findElement(By.xpath("(//span[normalize-space()='Next'])"));
	    bn3.click();
	    Thread.sleep(3000);
	    WebElement pswd = driver.findElement(By.name("Passwd"));
	    pswd.sendKeys("pavan@561");
	    WebElement cpswd = driver.findElement(By.name("PasswdAgain"));
	    cpswd.sendKeys("pavan@561");
	    WebElement bn4 = driver.findElement(By.xpath("(//span[normalize-space()='Next'])"));
	    bn4.click();
	    Thread.sleep(3000);
	}
}