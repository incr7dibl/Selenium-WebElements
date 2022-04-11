package testcases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;

import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class LoginTest extends PageObject {
	@Managed
	WebDriver driver;

	@Test
	public void doLogin() {

		//driver.get("https://www.google.com");
		openUrl("https://www.google.com");
		WebElementFacade textbox= find(By.name("q"));
		textbox.shouldBePresent();
		textbox.typeAndEnter("Hello World");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
