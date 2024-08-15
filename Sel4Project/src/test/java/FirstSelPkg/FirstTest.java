package FirstSelPkg;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//Sanjeev Comments from gib web
//2nd comment from git web
public class FirstTest {

	public static void main(String[] args) {
	
		//System.setProperty("webdriver.chrome.driver","C:\\BuluHome\\Sanju\\Work\\SW\\CromeDriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		driver.quit();
		
	}
}
