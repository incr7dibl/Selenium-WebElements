package webelements;

import static org.mockito.ArgumentMatchers.byteThat;

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
public class HandlingWebTables extends PageObject {

	@Managed(driver = "firefox")
	WebDriver driver;

	@Test
	public void handling_Alert() {

		openUrl("https://money.rediff.com/gainers");

		WebElementFacade table = $("//*[@id=\"leftcontainer\"]/table/tbody");

		List<WebElementFacade> rowsElementFacades = table.thenFindAll(By.tagName("tr"));
		System.out.println("row numbers are " + rowsElementFacades.size());
		String rows_dataString = "";
		for (WebElementFacade row : rowsElementFacades) {
			rows_dataString = rows_dataString + "\n" + row.getText();
		}
		System.out.println(rows_dataString);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
