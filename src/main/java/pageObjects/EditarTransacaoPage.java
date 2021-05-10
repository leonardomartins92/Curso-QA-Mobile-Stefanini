package pageObjects;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import utils.Uteis;

public class EditarTransacaoPage extends Uteis {
	
	public EditarTransacaoPage(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@index='2']")
	private MobileElement btnTransacao;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@index='1']")
	private MobileElement detalhesTransacao;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@index='0']")
	private MobileElement campoValor;
	
	@AndroidFindBy(xpath = "//android.view.View[@index='3']")
	private MobileElement btnRenda;
	
	@AndroidFindBy(xpath = "//android.view.View[@index='0']")
	private MobileElement ListaTransacoes;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@index='2']")
	private MobileElement btnEditar;
	
	@AndroidFindBy(accessibility = "Save")
	private MobileElement btnSalvar;
		
	public void acionarBtnTransacao() {
		btnTransacao.click();
	}
	
	public void acionardetalhesTransacao() {
		detalhesTransacao.click();
	}
	public void acionarBtnListaTransacoes() {
		ListaTransacoes.click();
	}
	
	public void acionarBtnEditar() {
		btnEditar.click();
	}
	
	public void acionarBtnSalvar() {
		(new TouchAction(driver))
	      .press(PointOption.point(540,1651))
	      .waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000)))
	      .moveTo(PointOption.point(558,676))
	      .release()
	      .perform();	
		btnSalvar.click();
	}
	
	public void preencherCampoValor(String valor) throws Exception {
		btnRenda.click();
		inputTextAppiumCommand(campoValor, valor);
		driver.navigate().back();		   
}
	
	
	
}
