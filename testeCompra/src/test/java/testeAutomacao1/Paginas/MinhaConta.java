package testeAutomacao1.Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import testeAutomacao1.utilities.Utilities;

public class MinhaConta extends PaginaPadrao{
	Utilities utilities; 
	

	@FindBy(how = How.CLASS_NAME, using = "page-heading")
	protected WebElement title;
	
	public MinhaConta(WebDriver driver) {
		super(driver);
		utilities = new Utilities(driver);
	}

	
	public String obterTitle() {
		return title.getText();
	}
	
	

}
