package testeAutomacao1.Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import testeAutomacao1.utilities.Utilities;

public class Confirmacao extends PaginaPadrao{
Utilities utilities; 
	

	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'I confirm my order')]")
	protected WebElement confirmar;
	
	
	public Confirmacao(WebDriver driver) {
		super(driver);
		utilities = new Utilities(driver);
	}
	
	public void confirmar() {
		confirmar.click();
	}
	
	
	
}
