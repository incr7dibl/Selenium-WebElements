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
public class HandlingAlert extends PageObject {

	@Managed(driver = "firefox")
	WebDriver driver;

	@Test
	public void handling_Alert() {

		openUrl("http://demo.automationtesting.in/Alerts.html");
		WebElementFacade button=find(By.xpath("//button[@class='btn btn-danger']"));
		
		button.click();
		Alert alert=getAlert();
		System.out.println(alert.getText());
		alert.accept();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
