package testeAutomacao1.Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import testeAutomacao1.utilities.Utilities;

public class ResultadoBusca  extends PaginaPadrao{
	
	Utilities utilities; 
	
	public ResultadoBusca(WebDriver driver) {
		super(driver);
		utilities = new Utilities(driver);
	}
	
	
	public void clickOnItem(String item) {
		driver.findElement(By.linkText(item)).click();
	}

		
}
