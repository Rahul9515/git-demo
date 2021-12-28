package qaclickacademy.mavenjava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class news {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
// selenium code-
     
		// Create Driver object for chrome browser
		
		/* Class name= chromeDriver
				 x driver = new x();*/
		//
		System.setProperty("webdriver.chrome.driver", "C:\\dat\\96\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www1.shoppersdrugmart.ca/en/home");
		driver.findElement(By.xpath("//*[@id=\"PageContent\"]/section[3]/div/div/article[1]/div/div/form/input")).sendKeys("patel@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"Footer\"]/div[2]/button")).click();
		driver.findElement(By.className("md-pav2__cta")).click();
		driver.findElement(By.id("searchInput")).sendKeys("airpods");
		driver.findElement(By.xpath("//*[@id=\"Header\"]/div/div[2]/div[1]/div/div[3]/div[2]/ul/li[4]/div/div/form/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"PageContent\"]/div/form/div[3]/ul/li[1]/div/div[2]/div/ul/li[1]/a/div[2]/h3")).click();
		
		//Thread.sleep(3000);
		//driver.findElement(By.cssSelector("button.wg-itb-list-btn")).click();
		
		//driver.findElement(By.id("ctl00_cp2_textfield2")).sendKeys("12345");
		//driver.findElement(By.className("uidPasswordLogon")).click();
		//driver.findElement(By.xpath("//*[@id=\'ctl00_cp2_imgbtn\']")).click();
		
	}
}
	