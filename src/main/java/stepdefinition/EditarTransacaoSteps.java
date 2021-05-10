package stepdefinition;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CadastroRendaPage;
import pageObjects.EditarTransacaoPage;
import utils.Uteis;

public class EditarTransacaoSteps extends Uteis {
	EditarTransacaoPage et = new EditarTransacaoPage(driver);
	CadastroRendaPage rp = new CadastroRendaPage(driver);
	
@Quando("o usuario selecionar a transacao")
public void oUsuarioSelecionarATransacao() throws Exception {
	et.acionarBtnTransacao();
	et.acionarBtnListaTransacoes();
	
}

@Quando("e acionar o botao para editar")
public void eAcionarOBotaoParaEditar() throws Exception {
 et.acionarBtnEditar();   
}

@Quando("inserir uma quantia de {string}")
public void inserirUmaQuantiaDe(String string) throws Exception {
    et.preencherCampoValor(string);
}

@Entao("a transacao deve ser atualizada")
public void aTransacaoDeveSerAtualizada() throws Exception{
	et.acionarBtnSalvar();
}


}
