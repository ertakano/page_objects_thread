package multi_threads.driverfactory;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import multi_threads.enuns.ExecutionType;

public class DriverFactory {
	
	private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<WebDriver>(){
		@Override
		protected synchronized WebDriver initialValue(){
			return initDriver();
		}
	};
	
	private DriverFactory() {}
	
	public static WebDriver getDriver(){
		return threadDriver.get();
	}
	
	public static WebDriver initDriver(){
		WebDriver driver = null;
		if(Properties.TIPO_EXECUCAO == ExecutionType.LOCAL) {
			switch (Properties.BROWSER) {
				case FIREFOX: driver = new FirefoxDriver(); break;
				case CHROME: System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver"); driver = new ChromeDriver(); break;
			}
		}
		if(Properties.TIPO_EXECUCAO == ExecutionType.GRID) {
			DesiredCapabilities cap = null;
			switch (Properties.BROWSER) {
				case FIREFOX: cap = DesiredCapabilities.firefox(); break;
				case CHROME: cap = DesiredCapabilities.chrome(); break;
			}
			try {
				driver = new RemoteWebDriver(new URL("http://192.168.0.184:4444/wd/hub"), cap);
			} catch (MalformedURLException e) {
				System.err.println("Falha na conexão com o GRID");
				e.printStackTrace();
			}
		}
		if(Properties.TIPO_EXECUCAO == ExecutionType.NUVEM) {
			DesiredCapabilities cap = null;
			switch (Properties.BROWSER) {
				case FIREFOX: cap = DesiredCapabilities.firefox(); break;
				case CHROME: cap = DesiredCapabilities.chrome(); break;
			}
			try {
				driver = new RemoteWebDriver(new URL("http://exemplo:172fcd87-6b7d-4c8d-8693-e20c903affa4@ondemand.saucelabs.com:80/wd/hub"), cap);
			} catch (MalformedURLException e) {
				System.err.println("Falha na conexão com a Saucelabs");
				e.printStackTrace();
			}
		}
		driver.manage().window().setSize(new Dimension(1200, 765));			
		return driver;
	}

	public static void killDriver(){
		WebDriver driver = getDriver();
		if(driver != null) {
			driver.quit();
			driver = null;
		}
		if(threadDriver != null) {
			threadDriver.remove();
		}
	}
}

