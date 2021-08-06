package testeAutomacao1.Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import testeAutomacao1.utilities.Utilities;

public class Produto extends PaginaPadrao{
	Utilities utilities; 
	

	@FindBy(how = How.ID, using = "quantity_wanted")
	protected WebElement quantidade;

	@FindBy(how = How.ID, using = "group_1")
	protected WebElement tamanho;
	
	@FindBy(how = How.NAME, using = "Submit")
	protected WebElement addToCart;
	
	@FindBy(how = How.XPATH, using = "//a[@title='Proceed to checkout']")
	protected WebElement irParaCheckout;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/div/div/div[3]/h1")
	protected WebElement itemName;
	
	public Produto(WebDriver driver) {
		super(driver);
		utilities = new Utilities(driver);
	}
	
	public void trocarQuantidade (String quant) {
		quantidade.clear();
		quantidade.sendKeys(quant);
	}
	
	public void trocarTamanho (String taman) {
		new Select(tamanho).selectByVisibleText(taman);				
	}
	
	public void trocarCor (String cor) {
		driver.findElement(By.name(cor)).click();
	}
	
	public void adicionarAoCarrinho() {
		addToCart.click();
	}
	
	public void irParaCarrinho() {
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(irParaCheckout)).click();
	}
	
	public String itemNome() {
		return itemName.getText();
	}
	
	
	

}
