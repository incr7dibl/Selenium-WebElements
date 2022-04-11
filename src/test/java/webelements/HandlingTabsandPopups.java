package webelements;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.webelements.Checkbox;

@RunWith(SerenityRunner.class)
public class HandlingTabsandPopups extends PageObject {

	@Managed(driver = "firefox")
	WebDriver driver;

	@Test
	public void handling_Alert() {

		openUrl("https://www.encodedna.com/javascript/demo/open-new-window-using-javascript-method.htm");
		
		/*
		 * $("//*[@id=\"content\"]/div[3]/p[2]/input[1]").click();
		 * 
		 * ArrayList<String> tabStrings= new ArrayList<String>
		 * (getDriver().getWindowHandles());
		 * 
		 * getDriver().switchTo().window(tabStrings.get(1));
		 * waitForCondition().withTimeout(Duration.ofSeconds(10))
		 * .pollingEvery(Duration.ofSeconds(5)).until(ExpectedConditions.
		 * elementToBeClickable (By.xpath("//img[@id='searchicon']")));
		 * $("//img[@id='searchicon']").click();
		 * 
		 * getDriver().close(); getDriver().switchTo().window(tabStrings.get(0)); try {
		 * Thread.sleep(3000); } catch (InterruptedException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); }
		 */
		
		///////////////////////////////////////////// or ///////////////////////////////
		$("//*[@id=\"content\"]/div[3]/p[2]/input[1]").click();
		String parentwindowString=getDriver().getWindowHandle();
		
		for(String windowhaandle :getDriver().getWindowHandles())
		{
			getDriver().switchTo().window(windowhaandle);
		}
		$("//img[@id='searchicon']").click();
		getDriver().close();
		getDriver().switchTo().window(parentwindowString);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
