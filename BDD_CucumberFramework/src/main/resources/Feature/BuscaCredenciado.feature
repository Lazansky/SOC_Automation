Feature: Realizar uma busca de credenciado na Rede Soc
   
    Scenario: Validar a busca de credenciado no site
    	Given Usuário está na página Rede SOCNET
    	And clicar no botão Buscar Credenciados
    	And preencher os filtros para busca
    	Then deve ser mostrado os resultados