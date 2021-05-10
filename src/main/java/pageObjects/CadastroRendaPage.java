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

public class CadastroRendaPage extends Uteis {
	private AndroidDriver driver;	
	
	public CadastroRendaPage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.Button[@index='5']" )
	private MobileElement btnAdicionar;
	
	@AndroidFindBy(xpath = "//android.view.View[@index='3']" )
	private MobileElement btnRenda;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@index='0']")
	private MobileElement campoValor;
	
	@AndroidFindBy(accessibility = "Juros")
	private MobileElement btnJuros;
	
	@AndroidFindBy(xpath = "//android.widget.ScrollView[@index='1']")
	private MobileElement tela;
	
	@AndroidFindBy(accessibility = "Add")
	private MobileElement btnAddTransacao;
		
	public void acionarBtnAdicionar() throws Exception {
		   btnAdicionar.click();
	}
			
	public void acionarBtnRenda() throws Exception {
		   btnRenda.click();
	}
	
	public void preencherCampoValor(String valor) throws Exception {
			inputTextAppiumCommand(campoValor, valor);
			   
	}
	
	public void acionarBtnJuros() throws Exception {
		btnJuros.click();
	}
		
		
	public void acionarBtnCadastrarTransacao() throws Exception {
		
		  (new TouchAction(driver))
	      .press(PointOption.point(540,1651))
	      .waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000)))
	      .moveTo(PointOption.point(558,676))
	      .release()
	      .perform();		
		btnAddTransacao.click();
		
				
	}
	
	
	
	
}
