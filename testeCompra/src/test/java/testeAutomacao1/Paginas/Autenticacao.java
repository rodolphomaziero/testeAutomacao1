package testeAutomacao1.Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import testeAutomacao1.utilities.Utilities;

public class Autenticacao extends PaginaPadrao{
	Utilities utilities; 

	
	@FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/div[1]/ol/li")
	protected WebElement errorMsg;
	
	
	@FindBy(how = How.ID, using = "email")
	protected WebElement login;
	
	@FindBy(how = How.ID, using = "passwd")
	protected WebElement passwd;
	
	@FindBy(how = How.ID, using = "SubmitLogin")
	protected WebElement submitLogin;
	
	
	public Autenticacao(WebDriver driver) {
		super(driver);
		utilities = new Utilities(driver);
	}

		
	public void login(String email, String senha) {
		login.sendKeys(email);
		passwd.sendKeys(senha);
		submitLogin.click();	
	}
	
	public String obterMsgErro() {
		return errorMsg.getText();
	}
	
	

}
