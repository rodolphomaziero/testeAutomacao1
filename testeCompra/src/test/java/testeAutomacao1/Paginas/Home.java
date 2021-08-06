package testeAutomacao1.Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import testeAutomacao1.utilities.Utilities;

public class Home  extends PaginaPadrao{
	
	Utilities utilities; 
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"homefeatured\"]/li[2]/div/div[2]/h5/a")
	protected WebElement itemHome;
	
	
	
	public Home(WebDriver driver) {
		super(driver);
		utilities = new Utilities(driver);
	}
	
	
	public void abrirItemHome(String item) {
		driver.findElement(By.linkText(item)).click();
	}
	

		
}
