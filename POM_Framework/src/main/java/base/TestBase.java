package base;

	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class TestBase {
		
		WebDriver driver;
		String browser = "Chrome";
		String url = "https://www.amazon.in/";
		
		public TestBase(WebDriver driver)
		{
			this.driver = driver;
			
		}

		public void launchUrl()
		{
			if(browser.equals("Chrome"))
			{
				driver = new ChromeDriver();
			}
			else if(browser.equals("Edge"))
			{
				driver = new EdgeDriver();
			}
			else if(browser.equals("FireFox"))
			{
				driver = new FirefoxDriver();
			}
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			
			
		}
		
		public 	void closeBrowser()
		{
			
			driver.close();
		}
	}