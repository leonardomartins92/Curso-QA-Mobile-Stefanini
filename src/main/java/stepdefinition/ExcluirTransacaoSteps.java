package stepdefinition;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.ExcluirTransacaoPage;
import utils.Uteis;

public class ExcluirTransacaoSteps extends Uteis {
	
	ExcluirTransacaoPage ep = new ExcluirTransacaoPage(driver);
	
	@Quando("e acionar o botao para excluir")
	public void eAcionarOBotaoParaExcluir() throws Exception {
	    ep.acionarBtnExcluir();
	}

	@Quando("confirma a exclusao")
	public void confirmaAExclusao()throws Exception {
	    ep.acionarBtnSim();
	}

	@Entao("a transacao deve ser excluida")
	public void aTransacaoDeveSerExcluida()throws Exception {
	    
	}

}
