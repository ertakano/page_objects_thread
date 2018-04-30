package multi_threads.pageobjects;

import org.openqa.selenium.By;

import multi_threads.base.BasePage;

public class PrecosEPrazosPageObject extends BasePage{
	
	private By xpathTitulo = By.xpath("//div[@class='tituloimagem']/h3");
	
	private By xpathElementoCepOrigem = By.xpath("//input[@name='cepOrigem']");

	private By xpathElementoCepDestino = By.xpath("//input[@name='cepDestino']");
	
	private By namelistBoxTipoServico = By.name("servico");

	private By xpathElementoBotaoEnviar = By.xpath("//div[@id='spanBotao']/input");
	
	private By botaoDadosObjetoSimulado = By.xpath("//div[@class='expodados']/b");
	
	private By prazoEntregaTxt = By.xpath("//tr[@class='destaque']/td/prazoentrega");
	
	private By entregaTxt = By.xpath("//td[text()='Entrega domiciliar']");

	private By diasEntregaTxt = By.xpath("//td[text()='Segunda a Sexta-Feira.']");

	private By cepOrigemTxt = By.xpath("//th[text()='CEP']/../td");

	private By endOrigemTxt = By.xpath("//th[.='Endereço']/../td");	
	
	private By bairroOrigemTxt = By.xpath("//th[.='Bairro']/../td");

	private By cidadeOrigemTxt = By.xpath("//th[contains(text(),'Cidade')]/../td");

	private By cepDestinoTxt = By.xpath("//th[.='CEP']/../td[2]");

	private By endDestinoTxt = By.xpath("//th[contains(.,'Endereço')]/../td[2]");

	private By bairroDestinoTxt = By.xpath("//th[.='Bairro']/../td[2]");
	
	private By cidadeDestinoTxt = By.xpath("//th[contains(.,'Cidade')]/../td[2]");
		
	public void irParaUrlPrecosEPrazos() {
		navigateTo("http://www2.correios.com.br/sistemas/precosPrazos/");
	}
	
	public boolean isValidaTitulo() throws Exception {
		containsTextInElement(xpathTitulo, getText(xpathTitulo));
		return true;
	}
	
	public String pegarTextoprazoEntregaTxt() throws Exception {
		containsElement(prazoEntregaTxt);
		return getText(prazoEntregaTxt);
	}
	
	public String pegarTextoentregaTxt() throws Exception {
		containsElement(entregaTxt);
		return getText(entregaTxt);
	}
	
	public String pegarTextodiasEntregaTxt() throws Exception {
		containsElement(diasEntregaTxt);
		return getText(diasEntregaTxt);
	}
	
	public String pegarcepOrigemTxt() throws Exception {
		containsElement(cepOrigemTxt);
		return getText(cepOrigemTxt);
	}
	
	public String pegarendOrigemTxt() throws Exception {
		containsElement(endOrigemTxt);
		return getText(endOrigemTxt);
	}
	
	public String pegarbairroOrigemTxt() throws Exception {
		containsElement(bairroOrigemTxt);
		return getText(bairroOrigemTxt);
	}
	
	public String pegarcidadeOrigemTxt() throws Exception {
		click(cidadeOrigemTxt);
		containsElement(cidadeOrigemTxt);
		return getText(cidadeOrigemTxt);
	}
	
	public String pegarcepDestinoTxt() throws Exception {
		containsElement(cepDestinoTxt);
		return getText(cepDestinoTxt);
	}
	
	public String pegarendDestinoTxt() throws Exception {
		containsElement(endDestinoTxt);
		return getText(endDestinoTxt);
	}
	
	public String pegarbairroDestinoTxt() throws Exception {
		containsElement(bairroDestinoTxt);
		return getText(bairroDestinoTxt);
	}
	
	public String pegarcidadeDestinoTxt() throws Exception {
		containsElement(cidadeDestinoTxt);
		return getText(cidadeDestinoTxt);
	}

	public void preencherCepDeOrigem(String cepOrigem) {
		click(xpathElementoCepOrigem);
		clear(xpathElementoCepOrigem);
		writeText(xpathElementoCepOrigem, cepOrigem);
	}
	
	public void preencherCepDeDestino(String cepDestino) {
		click(xpathElementoCepDestino);
		clear(xpathElementoCepDestino);
		writeText(xpathElementoCepDestino, cepDestino);
	}
	
	public void selecionarTipoServico(String tipoServico) {
		selectElementListBox(namelistBoxTipoServico, tipoServico);
	}
	
	public void clicarBotaoEnviar() {	
		click(xpathElementoBotaoEnviar);
	}
	
	public void clicarBotaoDadosObjetoSimulado() {	
		click(botaoDadosObjetoSimulado);
	}

}

