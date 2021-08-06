package testeAutomacao1.Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import testeAutomacao1.utilities.Utilities;

public class Conclusao extends PaginaPadrao{
Utilities utilities; 
	

	@FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/div/p/strong")
	protected WebElement mensagemCartao;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/p[1]")
	protected WebElement mensagemCheque;
	
	public Conclusao(WebDriver driver) {
		super(driver);
		utilities = new Utilities(driver);
	}
	
	public String obter_mensagem_sucessoCartao() {
		return mensagemCartao.getText();
	}
	public String obter_mensagem_sucessoCheque() {
		return mensagemCheque.getText();
	}
	
	
	
}
