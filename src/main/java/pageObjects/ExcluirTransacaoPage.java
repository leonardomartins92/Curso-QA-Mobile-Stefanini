package pageObjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.Uteis;

public class ExcluirTransacaoPage extends Uteis {
	public ExcluirTransacaoPage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
	@AndroidFindBy(accessibility = "DELETE")
	private MobileElement btnExcluir;
	
	@AndroidFindBy(accessibility = "YES")
	private MobileElement btnSim;
	
	@AndroidFindBy(xpath = "\\android.view.View[@index='1']")
	private MobileElement lista;
	
	
	public void acionarBtnExcluir() {
		btnExcluir.click();
	}
	
	public void acionarBtnSim() {
		btnSim.click();
	}
	
	public void validar() {
		assertTrue(lista.isDisplayed());
	}
	}
