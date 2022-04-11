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
public class HandlingRightClick extends PageObject {

	@Managed(driver = "firefox")
	WebDriver driver;

	@Test
	public void right_click() {

		openUrl("https://deluxe-menu.com/popup-mode-sample.html");
		WebElementFacade image=find(By.xpath("/html/body/div/table/tbody/tr/td[2]/div[2]/table[1]/tbody/tr/td[3]/p[2]/img"));
		
		withAction().contextClick(image).perform();
		withAction().moveToElement($("//*[@id=\"dm2m1i1tdT\"]")).perform();
		withAction().moveToElement($("//*[@id=\"dm2m2i1tdT\"]")).perform();
		$("//*[@id=\"dm2m3i1tdT\"]").click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
