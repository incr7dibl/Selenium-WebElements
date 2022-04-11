package webelements;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.webelements.Checkbox;

@RunWith(SerenityRunner.class)
public class HandlingIFrame extends PageObject {

	@Managed(driver = "firefox")
	WebDriver driver;

	@Test
	public void handling_Alert() {

		openUrl("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");

		getDriver().switchTo().frame("iframeResult");
		$("/html/body/form/input[3]").click();

		getDriver().switchTo().defaultContent();

		List<WebElementFacade> frames = findAll(By.tagName("iframe"));
		String frames_idString = "";

		for (WebElementFacade frame : frames) {
			frames_idString = frames_idString + "\n" + frame.getAttribute("id");

		}
		System.out.println(frames.size() + "  " + frames_idString);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
