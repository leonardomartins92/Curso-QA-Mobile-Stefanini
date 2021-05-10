#language: pt
#enconding: UTF-8

Funcionalidade: Editar Transacao 

Cenario: usuario edita uma transacao da conta
		
		Dado que o usuario esteja na pagina de transacoes
		Quando o usuario selecionar a transacao
		E e acionar o botao para editar
		E inserir uma quantia de "50"
		Entao a transacao deve ser atualizada
