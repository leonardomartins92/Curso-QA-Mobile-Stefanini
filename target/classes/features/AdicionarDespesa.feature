#language: pt
#enconding: UTF-8

Funcionalidade: Adicionar Transacao de Despesa

Cenario: usuario adicionar uma transacao de despesa em sua conta
		
		Dado que o usuario esteja na pagina de transacoes
		E que o usuario acione o botao de adicionar transacao
		Quando selecionar a opcao de despesa
		E inserir o valor de "100"
		E selecionar a categoria como Transporte 
		Entao o app subtraira o valor da conta
