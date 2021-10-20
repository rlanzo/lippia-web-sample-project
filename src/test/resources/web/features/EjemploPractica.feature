Feature: como usuario, quiero navegar al Sign in de la web de automation practice

  @Smoke
  Scenario: El usuario navega a "Sign in"
    Given el usuario navega a la web de automation practice
    When el usuario pulsa el boton "Sign in"
    Then el usuario verifica que se enseña la pagina de Sign in


