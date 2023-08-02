package pages;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	import base.TestBase;

	public class MobilePage extends TestBase{

		WebDriver driver;
		By smartPhone = By.linkText("Smartphones");
		By accessories = By.linkText("Accessories");
		
		public MobilePage(WebDriver driver) {
			super(driver);
			// TODO Auto-generated constructor stub
		}
		void clickSmartPhone()
		{
			driver.findElement(smartPhone).click();
		}

		
	}