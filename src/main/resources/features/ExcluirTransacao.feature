#language: pt
#enconding: UTF-8

Funcionalidade: Excluir Transacao 

Cenario: usuario exclui uma transacao da conta
		Dado que o usuario esteja na pagina de transacoes
		Quando o usuario selecionar a transacao
		E e acionar o botao para excluir
		E confirma a exclusao
		Entao a transacao deve ser excluida
