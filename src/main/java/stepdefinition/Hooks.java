package stepdefinition;

import java.io.IOException;
import java.net.MalformedURLException;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.Uteis;

public class Hooks extends Uteis {
	
	
	@Before
	public void setUp() throws MalformedURLException, InterruptedException {
		acessarApp();
	}

	@After
	public void fecharApp(Scenario cenario) throws IOException{
		gerarScreenShot(cenario);
		driver.quit();
	}
}
