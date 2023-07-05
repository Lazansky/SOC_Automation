Feature: Realizar uma busca no blog na pagina inicial do blog

  Scenario: Validar se pesquisa retorna o resultado desejado
    Given Usuário está na página principal
    When Usuário clica na lupa de pesquisa
    And Digita o desejado na barra de busca
    Then O resultado é mostrado na tela
