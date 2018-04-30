package multi_threads.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static multi_threads.driverfactory.DriverFactory.getDriver;

public class WebDriverUtils {
	
	private static long timeout = 10;
	private static WebDriverWait wait;

	public WebDriverUtils() {
		wait = new WebDriverWait(getDriver(), timeout);
	}

	public static void awaitsElementToGoAway(By by) {

		wait.until(ExpectedConditions.invisibilityOf(getDriver().findElement(by)));
	}

	public static void awaitsElementToGoAppear(By by) {

		WebElement element = getDriver().findElement(by);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void awaitsElementToGoAppearByName(String name) {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(name)));
	}

	public static void awaitsElementToGoAppearById(String id) {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
	}

	public static void awaitsElementToGoAppearByXpath(String xpath) {

		getDriver().manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}

	public void alterTab() {
		for (String winHandle : getDriver().getWindowHandles()) {
			getDriver().switchTo().window(winHandle);
		}
	}

	public void returnAlterTab() {
		for (String winHandleBefore : getDriver().getWindowHandles()) {
			getDriver().switchTo().window(winHandleBefore);
		}
	}

}

