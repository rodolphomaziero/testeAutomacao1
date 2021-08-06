package testeAutomacao1.testeCompra;



import org.junit.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import testeAutomacao1.Paginas.Autenticacao;
import testeAutomacao1.Paginas.Carrinho;
import testeAutomacao1.Paginas.Conclusao;
import testeAutomacao1.Paginas.Confirmacao;
import testeAutomacao1.Paginas.Endereco;
import testeAutomacao1.Paginas.Entrega;
import testeAutomacao1.Paginas.Home;
import testeAutomacao1.Paginas.MinhaConta;
import testeAutomacao1.Paginas.Pagamento;
import testeAutomacao1.Paginas.Produto;
import testeAutomacao1.Paginas.ResultadoBusca;
import testeAutomacao1.utilities.Utilities;

public class StepDefinitions {

	static Utilities utilities ;
	static Home paginaHome;
	static ResultadoBusca resultadoBusca;
	static Produto paginaProduto;
	static Carrinho carrinho;
	static Autenticacao autenticacao;
	static Endereco endereco;
	static Entrega entrega;
	static Pagamento pagamento;
	static Conclusao conclusao;
	static Confirmacao confirmacao;
	static MinhaConta minhaConta;
	
	@Before
	public static void setUpBeforeClass() throws Exception {
		System.out.println("!!!          Inicio Teste       !!!");
		utilities = new Utilities();
		paginaHome = new Home(Utilities.getDriver());
		resultadoBusca = new ResultadoBusca(Utilities.getDriver());
		paginaProduto = new Produto(Utilities.getDriver());
		carrinho = new Carrinho(Utilities.getDriver());
		endereco = new Endereco(Utilities.getDriver());
		entrega = new Entrega(Utilities.getDriver());
		pagamento = new Pagamento(Utilities.getDriver());
		conclusao = new Conclusao(Utilities.getDriver());
		autenticacao = new Autenticacao(Utilities.getDriver());
		confirmacao = new Confirmacao(Utilities.getDriver());
		minhaConta = new MinhaConta(Utilities.getDriver());
	}

	@After
	public static void tearDownAfterClass() throws Exception {
		System.out.println("!!!          Fim Teste       !!!");
		Utilities.getDriver().close();
	}
	
	
	
	@Given("abrir navegador no sistema {string}")
	public void abrir_navegador_no_sistema(String url) {
//		utilities.maximizar();
		utilities.abrirPagina(url);
	}
	
	@Given("buscar por item {string}")
	public void buscar_por_item(String item) {
		paginaHome.digitarNomeItem(item);
		paginaHome.buscarItem();
		resultadoBusca.clickOnItem(item);
	}
	
	@Given("clicar em item {string} na home")
	public void clicar_em_item_na_home(String item) {
	    paginaHome.abrirItemHome(item);
	    
	}
	
	@Given("adicionar no carrinho")
	public void adicionar_no_carrinho() {
		paginaProduto.adicionarAoCarrinho();
		paginaProduto.irParaCarrinho();
	}
	
	@Given("ir para checkout")
	public void ir_para_checkout() {
		carrinho.ir_para_checkout();
	}
	
	@Given("efetuar login com email {string}, senha {string}")
	public void efetuar_login_com_email_senha(String login, String senha) {
		 autenticacao.login(login, senha);
	}
	
	@Given("proceder para tela de Entrega")
	public void proceder_para_tela_de_entrega() {
		 endereco.ir_para_checkout();
	}
	
	@Given("proceder para tela de Pagamento")
	public void proceder_para_tela_de_pagamento() {
		entrega.check_termos();
	    entrega.ir_para_checkout();
	}
	
	@Given("realizar o pagamento via cartao de credito")
	public void realizar_o_pagamento_via_cartao_de_credito() {
		pagamento.pagar_com_cartao();
	}
	
	@Given("realizar o pagamento via cheque")
	public void realizar_o_pagamento_via_cheque() {
		pagamento.pagar_com_cheque();
	}
	
	@Given("confirmar compra")
	public void confirmar_compra() {
		confirmacao.confirmar();
	}
	
	@Then("visualizar a mensagem de sucesso por cartao {string}")
	public void visualizar_a_mensagem_de_sucesso_por_cartao(String msg) {
		Assert.assertEquals(msg, conclusao.obter_mensagem_sucessoCartao());
	}
	
	@Then("visualizar a mensagem de sucesso por cheque {string}")
	public void visualizar_a_mensagem_de_sucesso_por_cheque(String msg) {
		Assert.assertEquals(msg, conclusao.obter_mensagem_sucessoCheque());
	}
		
	@Given("alterar cor para {string}, tamanho para {string} e quantidade para {string}")
	public void alterar_cor_para_tamanho_para_e_quantidade_para(String cor, String tamanho, String quantidade) {
	    paginaProduto.trocarCor(cor);
	    paginaProduto.trocarTamanho(tamanho);
	    paginaProduto.trocarQuantidade(quantidade);
	}
	
	@Given("ir para tela de login")
	public void ir_para_tela_de_login() {
	    utilities.irParaLogin();
	}
	
	
	@Given("ir para home")
	public void ir_para_home() {
		utilities.irParaHome();
	}
	
	
	@Then("visualizar item {string}")
	public void visualizar_item(String item) {
		Assert.assertEquals(item, paginaProduto.itemNome());
	}
	
	@Then("visualizar parametros alterados")
	public void visualizar_parametros_alterados() {
		// TODO
	}
	
	@Then("visualizar tela {string}")
	public void visualizar_tela(String title) {
		Assert.assertEquals(title.toLowerCase(), minhaConta.obterTitle().toLowerCase());		
	}
	
	@Then("visualizar mensagem de erro {string}")
	public void visualizar_mensagem_de_erro(String erro) {
		Assert.assertEquals(erro.toLowerCase(), autenticacao.obterMsgErro().toLowerCase());	
	}
		
}
