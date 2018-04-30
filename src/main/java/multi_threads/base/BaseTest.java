package multi_threads.base;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import static multi_threads.driverfactory.DriverFactory.getDriver;
import static multi_threads.driverfactory.DriverFactory.killDriver;
import multi_threads.driverfactory.Properties;
import multi_threads.pageobjects.PrecosEPrazosPageObject;
import multi_threads.utils.WebDriverUtils;

public class BaseTest {

	PrecosEPrazosPageObject precosPrazos = new PrecosEPrazosPageObject();
	WebDriverUtils utils = new WebDriverUtils();

	@Before
	public void inicio() throws Exception {

		precosPrazos.irParaUrlPrecosEPrazos();
		Assert.assertTrue(precosPrazos.isValidaTitulo());
	}

	@After
	public void fim() {

		getDriver().close();
		utils.returnAlterTab();

		if (Properties.FECHAR_BROWSER) {
			killDriver();
		}

	}

}
