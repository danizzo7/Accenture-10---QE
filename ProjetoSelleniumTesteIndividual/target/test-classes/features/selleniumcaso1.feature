# language: pt
# encoding: utf-8

Funcionalidade: Testar Cadastro Informações Seguro do Automóvel

	Cenário: Preencher informaões do Veículo
	Dado que o usuário se encontra no site da Tricentris
	Quando preenche todos os dados do veículo de forma correta
	E clica no botão de Next
	Então deve ir para a página de Informações do seguro
	
	Cenário: Preenecher as informações de Seguro
	Dado que o usuário se encontra na aba de Informações de Seguro
	Quando preenche todos os dados do seguro de forma correta
	E clica no botão para ir para a aba de produto
	Então deve ir para a página de Informações do Produto
	
	
	Cenário: Preenecher as informações de Produto
	Dado que o usuário se encontra na aba de Informações de Produto
	Quando preenche todos os dados do produto de forma correta
	E clica no botão para ir para a aba de preço
	Então deve ir para a página de Seleção de Opções de Preços
	
	
	Cenário: Preenecher as informações de Seleção de Opções de Preço
	Dado que o usuário se encontra na aba de Informações de Seleção de Opções de Preço
	Quando preenche todos os dados de opções de preço de forma correta
	E clica no botão ir para a pagina de informaçoes da cota
	Então deve ir para a página de Seleção de Cota
	

	Cenário: Preenecher as informações de Cota
	Dado que o usuário se encontra na aba de Informações de Cota
	Quando preenche todos os dados de cota de forma correta
	E clica no botão de envio
	Então deve enviar com sucesso e mostrar a mensagem de confirmação 