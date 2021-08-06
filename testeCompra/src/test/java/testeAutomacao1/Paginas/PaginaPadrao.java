package testeAutomacao1.Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PaginaPadrao {
	
	static WebDriver driver;
	static WebDriverWait wait;
	
	public PaginaPadrao (WebDriver driver) {
		PaginaPadrao.driver = driver;
		wait = new WebDriverWait(driver, 300);
		PageFactory.initElements(driver, this);
	}

	public void abrirPagina(String url) {
		driver.get(url);
	}
	
	public void maximizar() {
		driver.manage().window().maximize();
	}
	
	@FindBy(how = How.ID, using = "search_query_top")
	protected WebElement campoBusca;
	
	@FindBy(how = How.NAME, using = "submit_search")
	protected WebElement submitBusca;

	@FindBy(how = How.XPATH, using = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	protected WebElement signIn;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"header_logo\"]/a")
	protected WebElement home;
	
	public void digitarNomeItem(String item) {
		campoBusca.sendKeys(item);	
	}	
	
	public void buscarItem() {
		submitBusca.click();		
	}	
	
	public void irParaLogin() {
		if(signIn!=null) {
			signIn.click();
		}
	}
	
	
	public void irParaHome() {
		home.click();
	}

}
