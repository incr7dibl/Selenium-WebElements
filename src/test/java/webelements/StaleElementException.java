package webelements;

import java.time.Duration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class StaleElementException extends PageObject {

	@Managed
	WebDriver driver;

	@Test
	public void checkStalElement() {
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		WebElement namElementFacade = driver
				.findElement(By.xpath("/html/body/app-root/form-comp/div/form/div[1]/input"));// ("/html/body/app-root/form-comp/div/form/div[1]/input");

		driver.findElement(By.xpath("/html/body/app-root/app-navbar/div/nav/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();

		namElementFacade.sendKeys("Hello world!");
	
		// Now using Serenity page object model this stale element refference error
		// doesnt come

		openUrl("https://rahulshettyacademy.com/angularpractice/");

		waitForCondition().withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(2)).until(
				ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-navbar/div/nav/ul/li[2]/a")));
		$("body > app-root:nth-child(1) > app-navbar:nth-child(1) > div:nth-child(1) > nav:nth-child(1) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)")
				.click();
		$("/html/body/app-root/app-navbar/div/nav/ul/li[2]/a").click();
		$("//a[normalize-space()='Home']").click();
		namElementFacade.sendKeys("Hello world!");
	}

}
