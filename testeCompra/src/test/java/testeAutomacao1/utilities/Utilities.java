package testeAutomacao1.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import testeAutomacao1.Paginas.PaginaPadrao;

public class Utilities extends PaginaPadrao {

	protected static WebDriver driver;
	protected WebDriverWait wait;
	
	
	public Utilities() {
		super(setarNavegador());		
	}
	
	public Utilities(WebDriver driver) {
		super(driver);
	}
	

	

			
	public static WebDriver setarNavegador() {
		System.setProperty("webdriver.chrome.driver","drivers//chromedriver.exe");
		driver =new ChromeDriver();
		return driver;
	}
		
	public static WebDriver getDriver() {
		return driver;
	}
	

}
