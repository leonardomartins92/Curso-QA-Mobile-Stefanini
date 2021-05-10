#language: pt
#enconding: UTF-8

Funcionalidade: Adicionar Transacao de Renda

Cenario: usuario adicionar uma transacao de renda em sua conta
		
		Dado que o usuario esteja na pagina de transacoes
		Dado que o usuario acione o botao de adicionar transacao
		Quando selecionar a opcao de renda
		E inserir o valor de "200"
		E selecionar a categoria como "Juros" 
		Entao o app soma o valor adicionado a conta
			