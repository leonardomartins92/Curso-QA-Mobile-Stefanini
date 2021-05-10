package stepdefinition;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CadastroRendaPage;
import pageObjects.LoginPage;
import utils.Uteis;

public class CadastroRendaSteps extends Uteis{
	
	CadastroRendaPage rp = new CadastroRendaPage(driver);
	LoginPage lp = new LoginPage(driver);
	
	@Dado("que o usuario esteja na pagina de transacoes")
	public void queOUsuarioEstejaNaPaginaDeTransacoes() throws Exception {
	  lp.realizarLogin();
	}
	
	@Dado("que o usuario acione o botao de adicionar transacao")
	public void queOUsuarioAcioneOBotaoDeAdicionarTransacao() throws Exception {
		rp.acionarBtnAdicionar();
	}

	@Quando("selecionar a opcao de renda")
	public void selecionarAOpcaoDeRenda() throws Exception {
		rp.acionarBtnRenda();
	}

	@Quando("inserir o valor de {string}")
	public void inserirOValorDe(String string) throws Exception {
		rp.preencherCampoValor(string);
	}

	@Quando("selecionar a categoria como Juros")
	public void selecionarACategoriaComo() throws Exception {
		rp.acionarBtnJuros();
	  
	}

	@Entao("o app soma o valor adicionado a conta")
	public void oAppSomaOValorAdicionadoAConta() throws Exception {
		rp.acionarBtnCadastrarTransacao();
	}

	
	
}
