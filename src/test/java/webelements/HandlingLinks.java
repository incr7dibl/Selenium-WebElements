package webelements;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class HandlingLinks extends PageObject {

	@Managed(driver = "firefox")
	WebDriver driver;

	@Test
	public void webElementTest() {

		openUrl("https://www.wikipedia.org/");
		WebElementFacade section = find(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[11]/div[3]"));
		List<WebElementFacade> links = section.thenFindAll(By.tagName("a"));

		for (WebElementFacade link : links) {
			System.out.println("Link Text :-" + link.getText() + "Link  URL" + link.getAttribute("href"));
		}

	}

}
