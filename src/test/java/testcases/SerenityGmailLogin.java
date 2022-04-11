package testcases;

import java.time.Duration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;

import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class SerenityGmailLogin extends PageObject {

	@Managed(driver = "firefox")
	WebDriver driver;

	@Test
	public void doLogin() {

		openUrl("https://www.gmail.com");

		WebElementFacade username = find(By.xpath("//*[@id=\"identifierId\"]"));
		username.type("emmetcruiz@gmail.com");
		// waitForCondition().until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")));
		// WebElementFacade
		// next_button=find(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span"));

		// WebElementFacade
		// password=find(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));

		// password.type("");

		waitForCondition().withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(5))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(
						"/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")));
		WebElementFacade next_button = find(By.xpath(
				"/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span"));
		next_button.click();

	}
}
