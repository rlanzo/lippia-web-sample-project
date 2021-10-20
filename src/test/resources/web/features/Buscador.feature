Feature: como usuario, realizar una busqueda en el buscador

  @Smoke @romi
  Scenario Outline: El usuario navega a "Sign in"
    Given el usuario navega a la web de automation practice
    When el usuario ingresa un dato en el buscador<busqueda>
    Then el usuario ve en pantalla los resultados de la busqueda <mensaje>

    Examples:
      | busqueda | mensaje                  |
      | dress    | Showing 1 - 7 of 7 items |