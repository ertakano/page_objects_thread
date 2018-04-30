package multi_threads.base;

import static multi_threads.driverfactory.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import multi_threads.utils.WebDriverUtils;


public class BasePage extends WebDriverUtils{
	
	public static void switchToFrame (String idOrName) {
		getDriver().switchTo().frame(idOrName);
	}
	
	public static void switchToDefaultContent () {
		getDriver().switchTo().defaultContent();
	}
	
	public String getTextByXpath(String xpath) {
		return getDriver().findElement(By.xpath(xpath)).getText();
	}
	
	protected boolean containsElement(By by) throws Exception {
		try {
			awaitsElementToGoAppear(by);
			if (!getDriver().findElement(by).equals(null)) {
				return true;
			}
		} catch (Exception e) {
			throw new Exception("O elemento não foi encontrado", e);
		}
		return false;
	}
	
	protected boolean containsElementsByText(String text) throws Exception {
		try {
			if (getDriver().getPageSource().contains(text)) {
				return true;
			}
		} catch (Exception e) {
			throw new Exception("O texto: " + text + " não foi encontrado", e);
		}
		return false;
	}
		
	protected boolean containsTextInElement(By by, String text) throws Exception {
		try {
			awaitsElementToGoAppear(by);
			if (getDriver().findElement(by).getText().equals(text)) {
				return true;
			}
		} catch (Exception e) {
			throw new Exception("O texto: " + text + "não foi encontrado", e);
		}
		return false;
	}

	protected boolean isEnabled(By by) {
		awaitsElementToGoAppear(by);
		return getDriver().findElement(by).isEnabled();
	}
	
	protected void click(By by) {
		awaitsElementToGoAppear(by);
		getDriver().findElement(by).click();
	}

	protected void clear(By by) {
		awaitsElementToGoAppear(by);
		getDriver().findElement(by).clear();
	}
	
	protected void writeText(By by, String text) {
		clear(by);
		getDriver().findElement(by).sendKeys(text);
	}
	
	protected void selectElementListBox(By by, String itemValue) {
		awaitsElementToGoAppear(by);
		new Select(getDriver().findElement(by)).selectByVisibleText(itemValue);
	}

	protected void navigateTo(String url) {
		getDriver().navigate().to(url);
	}
		
	public String getText(By by) {
		return getDriver().findElement(by).getText();
	}

}

