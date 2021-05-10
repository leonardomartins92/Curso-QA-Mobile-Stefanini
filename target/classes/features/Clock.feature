#language: pt
#enconding: UTF-8

Funcionalidade: Adicionar Transacao de Renda

Cenario: usuario adicionar uma transacao de renda em sua conta
		
		Dado que o usuario esteja na tela de transacoes
		Quando acionar o botao de adicionar transacao
		E selecionar a opcao de renda
		E inserir o valor de "200"
		E selecionar a categoria como outros 
		Entao o app soma o valor adicionado a conta
			|Repeat                  |
			|Default (Cesium)        |
			|Label                   |
			|Delete                  |