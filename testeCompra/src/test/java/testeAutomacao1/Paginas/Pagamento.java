package testeAutomacao1.Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import testeAutomacao1.utilities.Utilities;

public class Pagamento extends PaginaPadrao{
	Utilities utilities; 

	@FindBy(how = How.CLASS_NAME, using = "bankwire")
	protected WebElement bankwire;
	
	
	@FindBy(how = How.CLASS_NAME, using = "cheque")
	protected WebElement cheque;
	
	
	public Pagamento(WebDriver driver) {
		super(driver);
		utilities = new Utilities(driver);
	}
	
	public void pagar_com_cartao() {
		bankwire.click();
	}
	
	
	public void pagar_com_cheque() {
		cheque.click();
	}
	
	
}
