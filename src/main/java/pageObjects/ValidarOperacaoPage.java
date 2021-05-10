package pageObjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.Uteis;

public class ValidarOperacaoPage extends Uteis {
	
	public ValidarOperacaoPage(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
	public void validarOperacao() {
		assertTrue(driver.findElement(MobileBy.AccessibilityId("Total-R$148.00")).isDisplayed());
	}
	
	

}
