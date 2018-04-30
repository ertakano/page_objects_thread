package multi_threads.tests;

import org.junit.Assert;
import org.junit.Test;

import multi_threads.base.BaseTest;
import multi_threads.pageobjects.PrecosEPrazosPageObject;
import multi_threads.utils.WebDriverUtils;


public class ValidarConsultasEmPrecosPrazos extends BaseTest{

	PrecosEPrazosPageObject precosPrazos = new PrecosEPrazosPageObject();
	WebDriverUtils utils = new WebDriverUtils();

	/**
	 * CT01: Validar a Consulta de Preços e Prazos na opcao Aerograma
	 */
	@Test
	public void consultarPrecosPrazosPorAerograma() throws Exception {
		
		Assert.assertTrue(precosPrazos.isValidaTitulo());
		
		precosPrazos.preencherCepDeOrigem("01311200");
		precosPrazos.preencherCepDeDestino("11025000");
		precosPrazos.selecionarTipoServico("Aerograma");
		precosPrazos.clicarBotaoEnviar();
		
		utils.alterTab();
		Assert.assertEquals("3", precosPrazos.pegarTextoprazoEntregaTxt());
		Assert.assertEquals("Entrega domiciliar", precosPrazos.pegarTextoentregaTxt());
		Assert.assertEquals("Segunda a Sexta-Feira.", precosPrazos.pegarTextodiasEntregaTxt());
	
		try {
			precosPrazos.clicarBotaoDadosObjetoSimulado();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Assert.assertEquals("01311200", precosPrazos.pegarcepOrigemTxt());
		Assert.assertEquals("Avenida Paulista - de 1047 a 1865 - lado ímpar", precosPrazos.pegarendOrigemTxt());
		Assert.assertEquals("Bela Vista", precosPrazos.pegarbairroOrigemTxt());
		Assert.assertEquals("São Paulo / SP", precosPrazos.pegarcidadeOrigemTxt());
		
		Assert.assertEquals("11025000", precosPrazos.pegarcepDestinoTxt());
		Assert.assertEquals("Avenida Doutor Pedro Lessa - até 1594 - lado par", precosPrazos.pegarendDestinoTxt());
		Assert.assertEquals("Ponta da Praia", precosPrazos.pegarbairroDestinoTxt());
		Assert.assertEquals("Santos / SP", precosPrazos.pegarcidadeDestinoTxt());

	}
	
	/**
	 * CT02: Validar a Consulta de Preços e Prazos na opcao Carta Simples
	 */
	@Test
	public void consultarPrecosPrazosPorCartaSimples() throws Exception {
		
		Assert.assertTrue(precosPrazos.isValidaTitulo());

		precosPrazos.preencherCepDeOrigem("01311200");
		precosPrazos.preencherCepDeDestino("11025000");
		precosPrazos.selecionarTipoServico("Carta Simples");
		precosPrazos.clicarBotaoEnviar();
		
		utils.alterTab();
		Assert.assertEquals("3", precosPrazos.pegarTextoprazoEntregaTxt());
		Assert.assertEquals("Entrega domiciliar", precosPrazos.pegarTextoentregaTxt());
		Assert.assertEquals("Segunda a Sexta-Feira.", precosPrazos.pegarTextodiasEntregaTxt());
		
		try {
			precosPrazos.clicarBotaoDadosObjetoSimulado();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Assert.assertEquals("01311200", precosPrazos.pegarcepOrigemTxt());
		Assert.assertEquals("Avenida Paulista - de 1047 a 1865 - lado ímpar", precosPrazos.pegarendOrigemTxt());
		Assert.assertEquals("Bela Vista", precosPrazos.pegarbairroOrigemTxt());
		Assert.assertEquals("São Paulo / SP", precosPrazos.pegarcidadeOrigemTxt());
		
		Assert.assertEquals("11025000", precosPrazos.pegarcepDestinoTxt());
		Assert.assertEquals("Avenida Doutor Pedro Lessa - até 1594 - lado par", precosPrazos.pegarendDestinoTxt());
		Assert.assertEquals("Ponta da Praia", precosPrazos.pegarbairroDestinoTxt());
		Assert.assertEquals("Santos / SP", precosPrazos.pegarcidadeDestinoTxt());
		
	}
	
	/**
	 * CT03: Validar a Consulta de Preços e Prazos na opcao Carta Via Internet
	 */
	@Test
	public void consultarPrecosPrazosPorCartaViaInternet() throws Exception {
		
		Assert.assertTrue(precosPrazos.isValidaTitulo());
		
		precosPrazos.preencherCepDeOrigem("01311200");
		precosPrazos.preencherCepDeDestino("11025000");
		precosPrazos.selecionarTipoServico("Carta Via Internet");
		precosPrazos.clicarBotaoEnviar();
		
		utils.alterTab();
		Assert.assertEquals("4", precosPrazos.pegarTextoprazoEntregaTxt());
		Assert.assertEquals("Entrega domiciliar", precosPrazos.pegarTextoentregaTxt());
		Assert.assertEquals("Segunda a Sexta-Feira.", precosPrazos.pegarTextodiasEntregaTxt());
		
		try {
			precosPrazos.clicarBotaoDadosObjetoSimulado();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Assert.assertEquals("01311200", precosPrazos.pegarcepOrigemTxt());
		Assert.assertEquals("Avenida Paulista - de 1047 a 1865 - lado ímpar", precosPrazos.pegarendOrigemTxt());
		Assert.assertEquals("Bela Vista", precosPrazos.pegarbairroOrigemTxt());
		Assert.assertEquals("São Paulo / SP", precosPrazos.pegarcidadeOrigemTxt());
		
		Assert.assertEquals("11025000", precosPrazos.pegarcepDestinoTxt());
		Assert.assertEquals("Avenida Doutor Pedro Lessa - até 1594 - lado par", precosPrazos.pegarendDestinoTxt());
		Assert.assertEquals("Ponta da Praia", precosPrazos.pegarbairroDestinoTxt());
		Assert.assertEquals("Santos / SP", precosPrazos.pegarcidadeDestinoTxt());
		
	}
	
	
	
	
	/**
	 * CT01: Validar a Consulta de Preços e Prazos na opcao Aerograma
	 */
	@Test
	public void consultarPrecosPrazosPorAerograma2() throws Exception {
		
		Assert.assertTrue(precosPrazos.isValidaTitulo());
		
		precosPrazos.preencherCepDeOrigem("01311200");
		precosPrazos.preencherCepDeDestino("11025000");
		precosPrazos.selecionarTipoServico("Aerograma");
		precosPrazos.clicarBotaoEnviar();
		
		utils.alterTab();
		Assert.assertEquals("3", precosPrazos.pegarTextoprazoEntregaTxt());
		Assert.assertEquals("Entrega domiciliar", precosPrazos.pegarTextoentregaTxt());
		Assert.assertEquals("Segunda a Sexta-Feira.", precosPrazos.pegarTextodiasEntregaTxt());
	
		try {
			precosPrazos.clicarBotaoDadosObjetoSimulado();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Assert.assertEquals("01311200", precosPrazos.pegarcepOrigemTxt());
		Assert.assertEquals("Avenida Paulista - de 1047 a 1865 - lado ímpar", precosPrazos.pegarendOrigemTxt());
		Assert.assertEquals("Bela Vista", precosPrazos.pegarbairroOrigemTxt());
		Assert.assertEquals("São Paulo / SP", precosPrazos.pegarcidadeOrigemTxt());
		
		Assert.assertEquals("11025000", precosPrazos.pegarcepDestinoTxt());
		Assert.assertEquals("Avenida Doutor Pedro Lessa - até 1594 - lado par", precosPrazos.pegarendDestinoTxt());
		Assert.assertEquals("Ponta da Praia", precosPrazos.pegarbairroDestinoTxt());
		Assert.assertEquals("Santos / SP", precosPrazos.pegarcidadeDestinoTxt());

	}
	
	/**
	 * CT02: Validar a Consulta de Preços e Prazos na opcao Carta Simples
	 */
	@Test
	public void consultarPrecosPrazosPorCartaSimples2() throws Exception {

		Assert.assertTrue(precosPrazos.isValidaTitulo());
		
		precosPrazos.preencherCepDeOrigem("01311200");
		precosPrazos.preencherCepDeDestino("11025000");
		precosPrazos.selecionarTipoServico("Carta Simples");
		precosPrazos.clicarBotaoEnviar();
		
		utils.alterTab();
		Assert.assertEquals("3", precosPrazos.pegarTextoprazoEntregaTxt());
		Assert.assertEquals("Entrega domiciliar", precosPrazos.pegarTextoentregaTxt());
		Assert.assertEquals("Segunda a Sexta-Feira.", precosPrazos.pegarTextodiasEntregaTxt());
		
		try {
			precosPrazos.clicarBotaoDadosObjetoSimulado();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Assert.assertEquals("01311200", precosPrazos.pegarcepOrigemTxt());
		Assert.assertEquals("Avenida Paulista - de 1047 a 1865 - lado ímpar", precosPrazos.pegarendOrigemTxt());
		Assert.assertEquals("Bela Vista", precosPrazos.pegarbairroOrigemTxt());
		Assert.assertEquals("São Paulo / SP", precosPrazos.pegarcidadeOrigemTxt());
		
		Assert.assertEquals("11025000", precosPrazos.pegarcepDestinoTxt());
		Assert.assertEquals("Avenida Doutor Pedro Lessa - até 1594 - lado par", precosPrazos.pegarendDestinoTxt());
		Assert.assertEquals("Ponta da Praia", precosPrazos.pegarbairroDestinoTxt());
		Assert.assertEquals("Santos / SP", precosPrazos.pegarcidadeDestinoTxt());
		
	}
	
	/**
	 * CT03: Validar a Consulta de Preços e Prazos na opcao Carta Via Internet
	 */
	@Test
	public void consultarPrecosPrazosPorCartaViaInternet2() throws Exception {
		
		Assert.assertTrue(precosPrazos.isValidaTitulo());

		precosPrazos.preencherCepDeOrigem("01311200");
		precosPrazos.preencherCepDeDestino("11025000");
		precosPrazos.selecionarTipoServico("Carta Via Internet");
		precosPrazos.clicarBotaoEnviar();
		
		utils.alterTab();
		Assert.assertEquals("4", precosPrazos.pegarTextoprazoEntregaTxt());
		Assert.assertEquals("Entrega domiciliar", precosPrazos.pegarTextoentregaTxt());
		Assert.assertEquals("Segunda a Sexta-Feira.", precosPrazos.pegarTextodiasEntregaTxt());
		
		try {
			precosPrazos.clicarBotaoDadosObjetoSimulado();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Assert.assertEquals("01311200", precosPrazos.pegarcepOrigemTxt());
		Assert.assertEquals("Avenida Paulista - de 1047 a 1865 - lado ímpar", precosPrazos.pegarendOrigemTxt());
		Assert.assertEquals("Bela Vista", precosPrazos.pegarbairroOrigemTxt());
		Assert.assertEquals("São Paulo / SP", precosPrazos.pegarcidadeOrigemTxt());
		
		Assert.assertEquals("11025000", precosPrazos.pegarcepDestinoTxt());
		Assert.assertEquals("Avenida Doutor Pedro Lessa - até 1594 - lado par", precosPrazos.pegarendDestinoTxt());
		Assert.assertEquals("Ponta da Praia", precosPrazos.pegarbairroDestinoTxt());
		Assert.assertEquals("Santos / SP", precosPrazos.pegarcidadeDestinoTxt());
		
	}

}

