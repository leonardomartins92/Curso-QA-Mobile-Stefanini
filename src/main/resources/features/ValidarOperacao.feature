#language: pt
#enconding: UTF-8

Funcionalidade: Validar operacao

Cenario: usuario realiza duas transoes
		
		Dado que o usuario esteja na pagina de transacoes
		E que o usuario acione o botao de adicionar transacao
		Quando selecionar a opcao de renda
		E inserir o valor de "200"
		E selecionar a categoria como Juros 
		E realizar operacao de despesa
		E inserir o valor de "50"
		E selecionar a categoria como Transporte 
		Entao o app soma o valor das duas operacoes a conta
