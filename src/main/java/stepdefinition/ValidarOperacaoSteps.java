package stepdefinition;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CadastroDespesaPage;
import pageObjects.CadastroRendaPage;
import pageObjects.ValidarOperacaoPage;
import utils.Uteis;
public class ValidarOperacaoSteps extends Uteis{
	CadastroDespesaPage dc = new CadastroDespesaPage(driver);
	CadastroRendaPage rp = new CadastroRendaPage(driver);
	ValidarOperacaoPage op = new ValidarOperacaoPage(driver);
	
	@Quando("realizar operacao de despesa")
	public void realizarOperacaoDeDespesa() throws Exception {
		rp.acionarBtnCadastrarTransacao();
		rp.acionarBtnAdicionar();
	 }

	@Entao("o app soma o valor das duas operacoes a conta")
	public void oAppSomaOValorDasDuasOperacoesAConta() throws Exception{
	   rp.acionarBtnCadastrarTransacao();
	   op.validarOperacao();
	}


}
