package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.Uteis;

public class CadastroDespesaPage extends Uteis {

	
	public CadastroDespesaPage(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
	@AndroidFindBy(xpath = "//android.view.View[@index='2']" )
	private MobileElement btnDespesas;
	
	@AndroidFindBy(accessibility = "Transporte")
	private MobileElement btnTransporte;
	
	public void acionarBtnDespesas() throws Exception {
		   btnDespesas.click();
	}
	public void acionarBtnTransporte() throws Exception {
		   btnTransporte.click();
	}
	
	
}
