Feature: Realizar uma busca no blog na pagina inicial do blog

  Scenario: Validar se pesquisa retorna o resultado desejado
    Given Usuário está na página principal
    When Usuário clica na lupa de pesquisa
    And Digita o desejado na barra de busca
    Then O resultado é mostrado na tela

    Scenario: Validar a busca de credenciado no site
    	Given Usuário está na página "Rede SOCNET"
    	And clicar no botão "Buscar Credenciados"
    	And preencher os filtros para busca
    	Then deve ser mostrado os resultados
    	