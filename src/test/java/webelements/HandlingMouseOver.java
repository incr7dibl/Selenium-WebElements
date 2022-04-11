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
public class HandlingMouseOver extends PageObject {

	@Managed(driver = "firefox")
	WebDriver driver;

	@Test
	public void mouseOver() {

		openUrl("https://www.way2automation.com");
		
		withAction().moveToElement(find(By.xpath("//*[@id=\"menu-item-27617\"]/a/span[2]"))).perform();
		find(By.xpath("//*[@id=\"menu-item-27619\"]/a/span[2]")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
