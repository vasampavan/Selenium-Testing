	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	
	public class week3_facebook{
	
		public static void main(String[] args) throws InterruptedException{
			WebDriver driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","E:\\ATT\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			driver.get("https://www.facebook.com/");
			Thread.sleep(200);
			driver.findElement(By.partialLinkText("Create new account")).click();
			Thread.sleep(500);
			WebElement firstname = driver.findElement(By.name("firstname"));
			firstname.sendKeys("Pavan");
			WebElement SurName = driver.findElement(By.name("lastname"));
			SurName.sendKeys("Vasam");
			Thread.sleep(500);
			WebElement MobileNoOrEmailId = driver.findElement(By.name("reg_email__"));
			MobileNoOrEmailId.sendKeys("8555869096");
			Thread.sleep(500);
			WebElement password = driver.findElement(By.name("reg_passwd__"));
			password.sendKeys("12357edfg");
			Select dataDropdown = new Select(driver.findElement(By.name("birthday_day")));
			dataDropdown.selectByValue("19");
			Thread.sleep(500);
			Select monthdropdown = new Select(driver.findElement(By.name("birthday_month")));
			monthdropdown.selectByValue("7");	
			Thread.sleep(500);
			Select yearDropdown = new Select(driver.findElement(By.name("birthday_year")));
			yearDropdown.selectByValue("2003");
			Thread.sleep(500);
			WebElement maleRadioBtn = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label"));
			maleRadioBtn.click();
			Thread.sleep(500);
			WebElement signupBtn = driver.findElement(By.name("websubmit"));
			signupBtn.click();
		}
		}