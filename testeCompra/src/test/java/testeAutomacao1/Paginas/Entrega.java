package testeAutomacao1.Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import testeAutomacao1.utilities.Utilities;

public class Entrega extends PaginaPadrao{
	
	Utilities utilities;
	
	@FindBy(how = How.ID, using = "cgv")
	protected WebElement cgv;
	
	@FindBy(how = How.NAME, using = "processCarrier")
	protected WebElement ir_para_checkout;

	public Entrega(WebDriver driver) {
		super(driver);
		utilities = new Utilities(driver);
	}
	
	public void check_termos() {
		cgv.click();
	}
	
	public void ir_para_checkout() {
		ir_para_checkout.click();
	}
	
}
