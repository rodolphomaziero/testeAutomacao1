Feature: Teste de compra

	Scenario: 1 - Teste de Busca de produto
		Given abrir navegador no sistema "http://automationpractice.com/index.php"
		And buscar por item "Blouse"
		Then visualizar item "Blouse"

	Scenario: 2 - Teste de link de produto da home 
		Given abrir navegador no sistema "http://automationpractice.com/index.php"
		And clicar em item "Blouse" na home
		Then visualizar item "Blouse"

	Scenario: 3 - Teste de alterção de produto (quantidade, cor, tamanho)
		Given abrir navegador no sistema "http://automationpractice.com/index.php?id_product=2&controller=product"
		And alterar cor para "White", tamanho para "M" e quantidade para "5"
		Then visualizar parametros alterados

	Scenario: 4 - Teste de login com cadastro existente  e email/senha corretos
		Given abrir navegador no sistema "http://automationpractice.com/index.php?controller=authentication&back=my-account"
		And efetuar login com email "rodolpho.maziero@hotmail.com", senha "password"
		Then visualizar tela "My account"

	Scenario: 5 - Teste de login com cadastro existente  e senha incorretos
		Given abrir navegador no sistema "http://automationpractice.com/index.php?controller=authentication&back=my-account"
		And efetuar login com email "rodolpho.maziero@hotmail.com", senha "password1"
		Then visualizar mensagem de erro "Authentication failed."

	Scenario: 6 - Teste de login comcampos vazios
		Given abrir navegador no sistema "http://automationpractice.com/index.php?controller=authentication&back=my-account"
		And efetuar login com email "", senha ""
		Then visualizar mensagem de erro "An email address required."

	Scenario: 7 - Teste de fluxo de compra completo com login após a seleção de produto, buscando pelo produto,  produto sem alteração,  e pagamento em cartão
		Given abrir navegador no sistema "http://automationpractice.com/index.php"
		And buscar por item "Blouse"
		And adicionar no carrinho
		And ir para checkout
		And efetuar login com email "rodolpho.maziero@hotmail.com", senha "password"
		And proceder para tela de Entrega
		And proceder para tela de Pagamento
		And realizar o pagamento via cartao de credito
		And confirmar compra
		Then visualizar a mensagem de sucesso por cartao "Your order on My Store is complete."

	Scenario: 8 - Teste de fluxo de compra completo com login após a seleção de produto, buscando pelo produto, produto sem alteração, e pagamento em cheque
		Given abrir navegador no sistema "http://automationpractice.com/index.php"
		And buscar por item "Blouse"
		And adicionar no carrinho
		And ir para checkout
		And efetuar login com email "rodolpho.maziero@hotmail.com", senha "password"
		And proceder para tela de Entrega
		And proceder para tela de Pagamento
		And realizar o pagamento via cheque
		And confirmar compra
		Then visualizar a mensagem de sucesso por cheque "Your order on My Store is complete."

	Scenario: 9 - Teste de fluxo de compra completo com login após a seleção de produto, produto selecionado na home,  produto sem alteração, e pagamento em cartão
		Given abrir navegador no sistema "http://automationpractice.com/index.php"
		And clicar em item "Blouse" na home
		And adicionar no carrinho
		And ir para checkout
		And efetuar login com email "rodolpho.maziero@hotmail.com", senha "password"
		And proceder para tela de Entrega
		And proceder para tela de Pagamento
		And realizar o pagamento via cartao de credito
		And confirmar compra
		Then visualizar a mensagem de sucesso por cartao "Your order on My Store is complete."

	Scenario: 10 - Teste de fluxo de compra completo com login após a seleção de produto, produto selecionado na home,  produto sem alteração, e pagamento em cheque
		Given abrir navegador no sistema "http://automationpractice.com/index.php"
		And clicar em item "Blouse" na home
		And adicionar no carrinho
		And ir para checkout
		And efetuar login com email "rodolpho.maziero@hotmail.com", senha "password"
		And proceder para tela de Entrega
		And proceder para tela de Pagamento
		And realizar o pagamento via cheque
		And confirmar compra
		Then visualizar a mensagem de sucesso por cheque "Your order on My Store is complete."

	Scenario: 11 - Teste de fluxo de compra completo com login após a seleção de produto, buscando pelo produto,  produto com alteração,  e pagamento em cartão
		Given abrir navegador no sistema "http://automationpractice.com/index.php"
		And buscar por item "Blouse"
		And alterar cor para "White", tamanho para "M" e quantidade para "5"
		And adicionar no carrinho
		And ir para checkout
		And efetuar login com email "rodolpho.maziero@hotmail.com", senha "password"
		And proceder para tela de Entrega
		And proceder para tela de Pagamento
		And realizar o pagamento via cartao de credito
		And confirmar compra
		Then visualizar a mensagem de sucesso por cartao "Your order on My Store is complete."

	Scenario: 12 - Teste de fluxo de compra completo com login após a seleção de produto, buscando pelo produto, produto com alteração, e pagamento em cheque
		Given abrir navegador no sistema "http://automationpractice.com/index.php"
		And buscar por item "Blouse"
		And alterar cor para "White", tamanho para "M" e quantidade para "5"
		And adicionar no carrinho
		And ir para checkout
		And efetuar login com email "rodolpho.maziero@hotmail.com", senha "password"
		And proceder para tela de Entrega
		And proceder para tela de Pagamento
		And realizar o pagamento via cheque
		And confirmar compra
		Then visualizar a mensagem de sucesso por cheque "Your order on My Store is complete."

	Scenario: 13 - Teste de fluxo de compra completo com login após a seleção de produto, produto selecionado na home,  produto com alteração, e pagamento em cartão
		Given abrir navegador no sistema "http://automationpractice.com/index.php"
		And clicar em item "Blouse" na home
		And alterar cor para "White", tamanho para "M" e quantidade para "5"
		And adicionar no carrinho
		And ir para checkout
		And efetuar login com email "rodolpho.maziero@hotmail.com", senha "password"
		And proceder para tela de Entrega
		And proceder para tela de Pagamento
		And realizar o pagamento via cartao de credito
		And confirmar compra
		Then visualizar a mensagem de sucesso por cartao "Your order on My Store is complete."

	Scenario: 14 - Teste de fluxo de compra completo com login após a seleção de produto, produto selecionado na home,  produto com alteração, e pagamento em cheque
		Given abrir navegador no sistema "http://automationpractice.com/index.php"
		And clicar em item "Blouse" na home
		And alterar cor para "White", tamanho para "M" e quantidade para "5"
		And adicionar no carrinho
		And ir para checkout
		And efetuar login com email "rodolpho.maziero@hotmail.com", senha "password"
		And proceder para tela de Entrega
		And proceder para tela de Pagamento
		And realizar o pagamento via cheque
		And confirmar compra
		Then visualizar a mensagem de sucesso por cheque "Your order on My Store is complete."

	Scenario: 15 - Teste de fluxo de compra completo com login antes da seleção de produto, buscando pelo produto,  produto sem alteração,  e pagamento em cartão
		Given abrir navegador no sistema "http://automationpractice.com/index.php"
		And ir para tela de login
		And efetuar login com email "rodolpho.maziero@hotmail.com", senha "password"
		And buscar por item "Blouse"
		And adicionar no carrinho
		And ir para checkout
		And proceder para tela de Entrega
		And proceder para tela de Pagamento
		And realizar o pagamento via cartao de credito
		And confirmar compra
		Then visualizar a mensagem de sucesso por cartao "Your order on My Store is complete."

	Scenario: 16 - Teste de fluxo de compra completo com login antes da seleção de produto, buscando pelo produto, produto sem alteração, e pagamento em cheque
		Given abrir navegador no sistema "http://automationpractice.com/index.php"
		And ir para tela de login
		And efetuar login com email "rodolpho.maziero@hotmail.com", senha "password"
		And ir para home
		And buscar por item "Blouse"
		And adicionar no carrinho
		And ir para checkout
		And proceder para tela de Entrega
		And proceder para tela de Pagamento
		And realizar o pagamento via cheque
		And confirmar compra
		Then visualizar a mensagem de sucesso por cheque "Your order on My Store is complete."

	Scenario: 17 - Teste de fluxo de compra completo com login antes da seleção de produto, produto selecionado na home,  produto sem alteração, e pagamento em cartão
		Given abrir navegador no sistema "http://automationpractice.com/index.php"
		And ir para tela de login
		And efetuar login com email "rodolpho.maziero@hotmail.com", senha "password"
		And ir para home
		And clicar em item "Blouse" na home
		And adicionar no carrinho
		And ir para checkout
		And proceder para tela de Entrega
		And proceder para tela de Pagamento
		And realizar o pagamento via cartao de credito
		And confirmar compra
		Then visualizar a mensagem de sucesso por cartao "Your order on My Store is complete."

	Scenario: 18 - Teste de fluxo de compra completo com login antes da seleção de produto, produto selecionado na home,  produto sem alteração, e pagamento em cheque
		Given abrir navegador no sistema "http://automationpractice.com/index.php"
		And ir para tela de login
		And efetuar login com email "rodolpho.maziero@hotmail.com", senha "password"
		And ir para home
		And clicar em item "Blouse" na home
		And adicionar no carrinho
		And ir para checkout
		And proceder para tela de Entrega
		And proceder para tela de Pagamento
		And realizar o pagamento via cheque
		And confirmar compra
		Then visualizar a mensagem de sucesso por cheque "Your order on My Store is complete."

	Scenario: 19 - Teste de fluxo de compra completo com login antes da seleção de produto, buscando pelo produto,  produto com alteração,  e pagamento em cartão
		Given abrir navegador no sistema "http://automationpractice.com/index.php"
		And ir para tela de login
		And efetuar login com email "rodolpho.maziero@hotmail.com", senha "password"
		And buscar por item "Blouse"
		And alterar cor para "White", tamanho para "M" e quantidade para "5"
		And adicionar no carrinho
		And ir para checkout
		And proceder para tela de Entrega
		And proceder para tela de Pagamento
		And realizar o pagamento via cartao de credito
		And confirmar compra
		Then visualizar a mensagem de sucesso por cartao "Your order on My Store is complete."

	Scenario: 20 - Teste de fluxo de compra completo com login antes da seleção de produto, buscando pelo produto, produto com alteração, e pagamento em cheque
		Given abrir navegador no sistema "http://automationpractice.com/index.php"
		And ir para tela de login
		And efetuar login com email "rodolpho.maziero@hotmail.com", senha "password"
		And buscar por item "Blouse"
		And alterar cor para "White", tamanho para "M" e quantidade para "5"
		And adicionar no carrinho
		And ir para checkout
		And proceder para tela de Entrega
		And proceder para tela de Pagamento
		And realizar o pagamento via cheque
		And confirmar compra
		Then visualizar a mensagem de sucesso por cheque "Your order on My Store is complete."

	Scenario: 21 - Teste de fluxo de compra completo com login antes da seleção de produto, produto selecionado na home,  produto com alteração, e pagamento em cartão
		Given abrir navegador no sistema "http://automationpractice.com/index.php"
		And ir para tela de login
		And efetuar login com email "rodolpho.maziero@hotmail.com", senha "password"
		And ir para home
		And clicar em item "Blouse" na home
		And alterar cor para "White", tamanho para "M" e quantidade para "5"
		And adicionar no carrinho
		And ir para checkout
		And proceder para tela de Entrega
		And proceder para tela de Pagamento
		And realizar o pagamento via cartao de credito
		And confirmar compra
		Then visualizar a mensagem de sucesso por cartao "Your order on My Store is complete."

	Scenario: 22 - Teste de fluxo de compra completo com login antes da seleção de produto, produto selecionado na home,  produto com alteração, e pagamento em cheque
		Given abrir navegador no sistema "http://automationpractice.com/index.php"
		And ir para tela de login
		And efetuar login com email "rodolpho.maziero@hotmail.com", senha "password"
		And ir para home
		And clicar em item "Blouse" na home
		And alterar cor para "White", tamanho para "M" e quantidade para "5"
		And adicionar no carrinho
		And ir para checkout
		And proceder para tela de Entrega
		And proceder para tela de Pagamento
		And realizar o pagamento via cheque
		And confirmar compra
		Then visualizar a mensagem de sucesso por cheque "Your order on My Store is complete."
