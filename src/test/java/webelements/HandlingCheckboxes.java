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
import net.thucydides.core.webelements.Checkbox;

@RunWith(SerenityRunner.class)
public class HandlingCheckboxes extends PageObject {

	@Managed(driver = "chrome")
	WebDriver driver;

	@Test
	public void webElementTest() {

		openUrl("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElementFacade precheckedsection = find(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[6]"));
		List<WebElementFacade> checkboxes = precheckedsection.thenFindAll(By.name("sports"));

		for (WebElementFacade checkbox : checkboxes) {
			if (checkbox.isSelected()) {
				checkbox.click();
			}
		}
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
