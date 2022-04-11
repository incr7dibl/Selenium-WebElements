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
public class HandlingDropdowns extends PageObject {

	@Managed(driver = "firefox")
	WebDriver driver;

	@Test
	public void webElementTest() {

		openUrl("https://www.wikipedia.org/");
		WebElementFacade dropdownsection=find(By.id("searchLanguage"));
		List<WebElementFacade> values = dropdownsection.thenFindAll(By.tagName("Option"));

//		 System.out.println("Number of dropdowns are"+values.get(7).getText());
		String dropdownString="";
		for (WebElementFacade value : values) {
			dropdownString=dropdownString+"\n"+value.getText();
		}
		System.out.println(dropdownString);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
