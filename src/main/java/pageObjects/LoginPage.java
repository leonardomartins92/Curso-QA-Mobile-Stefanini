package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.Uteis;

public class LoginPage extends Uteis {
	

	public LoginPage(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
	@AndroidFindBy(accessibility = "Log in")
	private MobileElement btnEntrar;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Email address']")
	private MobileElement campoEmail;
	
	@AndroidFindBy(accessibility = "Next")
	private MobileElement btnProximo;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Password']")
	private MobileElement campoSenha;
	
		
	public void realizarLogin() throws Exception {
		btnEntrar.click();
		inputTextAppiumCommand(campoEmail,"leomrjc@hotmail.com");
		driver.navigate().back();
		btnProximo.click();
		inputTextAppiumCommand(campoSenha,"test123");
		driver.navigate().back();
		btnProximo.click();
			
	}
}
