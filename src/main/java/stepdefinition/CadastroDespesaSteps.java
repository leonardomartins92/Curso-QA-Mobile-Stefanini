package stepdefinition;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CadastroDespesaPage;
import pageObjects.CadastroRendaPage;
import utils.Uteis;

public class CadastroDespesaSteps extends Uteis {
	
	CadastroDespesaPage dc = new CadastroDespesaPage(driver);
	CadastroRendaPage rp = new CadastroRendaPage(driver);
	
	@Quando("selecionar a opcao de despesa")
	public void selecionarAOpcaoDeDespesa() throws Exception {
	   dc.acionarBtnDespesas();
	}

	@Quando("selecionar a categoria como Transporte")
	public void selecionarACategoriaComoTransporte() throws Exception {
	  dc.acionarBtnTransporte();
	}

	@Entao("o app subtraira o valor da conta")
	public void oAppSubtrairaOValorDaConta() throws Exception {
	    rp.acionarBtnCadastrarTransacao();
	}

	
}
