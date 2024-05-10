


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class week11_myntra {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\\\ATT\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.myntra.com");
		driver.manage().window().maximize();
		WebElement profile=driver.findElement(By.xpath("(//span[@class='desktop-userTitle'])[1]"));
        profile.click();
        WebElement login=driver.findElement(By.xpath("(//a[@class='desktop-linkButton'])[1]"));
        login.click();
        WebElement mobno=driver.findElement(By.xpath("(//input[@class='form-control mobileNumberInput'])[1]"));
        mobno.sendKeys("9100884975");
        WebElement conbtn=driver.findElement(By.xpath("(//div[@class='submitBottomOption'])[1]"));
        conbtn.click();
        
	}

}
