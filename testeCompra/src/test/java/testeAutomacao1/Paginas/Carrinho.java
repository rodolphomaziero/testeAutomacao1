package testeAutomacao1.Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import testeAutomacao1.utilities.Utilities;

public class Carrinho extends PaginaPadrao{
Utilities utilities; 
	
	
	@FindBy(how = How.LINK_TEXT, using = "Proceed to checkout")
	protected WebElement ir_para_checkout;
	

	public Carrinho(WebDriver driver) {
		super(driver);
		utilities = new Utilities(driver);
	}
	
	public void ir_para_checkout() {
		ir_para_checkout.click();
	}
	
}
