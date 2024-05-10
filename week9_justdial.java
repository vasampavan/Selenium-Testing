import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class week9_justdial{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\\\ATT\\\\chromedriver-win64\\\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.justdial.com/Hyderabad/Bakeries-in-Medchal/nct-10033880");
		List<WebElement>m=driver.findElements(By.xpath("//*[@id=\"040PXX40.XX40.190215150141.Z9B6\"]/div/div[2]/h2/a/div[1]"));
		for(int i=0; i<m.size(); i++)
		{
			String s=m.get(i).getText();
			System.out.println("bakery "+(i+1)+":"+s);
		}
	}
}