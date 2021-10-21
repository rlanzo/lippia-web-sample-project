Feature: como usuario, realizar una busqueda en el buscador

  @Smoke
  Scenario Outline: El usuario realiza una busqueda exitosa"
    Given el usuario navega a la web de automation practice
    When el usuario ingresa un dato en el buscador<busqueda>
    Then el usuario ve en pantalla los resultados de la busqueda <mensaje>

    Examples:
      | busqueda | mensaje                  |
      | dress    | Showing 1 - 7 of 7 items |


  @Smoke
  Scenario Outline: El usuario realiza una busqueda y lo ordena por precio mas bajo"
    Given el usuario navega a la web de automation practice
    When el usuario ingresa un dato en el buscador<busqueda>
    And el usuario va selecciona ordenar por precio mas bajo <search>
    Then el usuario ve en pantalla correctamente ordenado

    Examples:
      | busqueda | search              |
      | SHORT    | Price: Lowest first |