Feature: como usuario, quiero navegar al Sign in de la web de automation practice

  @Smoke
  Scenario: El usuario navega a "Sign in"
    Given el usuario navega a la web de automation practice
    When el usuario pulsa el boton "Sign in"
    Then el usuario verifica que se enseña la pagina de Sign in

  @Smoke
  Scenario Outline: El usuario navega a "Sign in"
    Given el usuario navega a la web de automation practice
    When el usuario pulsa el boton "Sign in"
    And el usuario ingresa el usuario <usuario> y la Password <password>
    Then el usuario se encuentra logueado <texto>

    Examples:
      | usuario             | password  | texto      |
      | dilanzita@gmail.com | Gire2021* | My account |

  @Smoke
  Scenario Outline: El usuario navega a "Sign in"
    Given el usuario navega a la web de automation practice
    When el usuario ingresa un dato en el buscador <busqueda>
    Then el usuario ve en pantalla los resultados de la busqueda

    Examples:
      | busqueda |
      | dress    |

  @Smoke
  Scenario Outline: El usuario navega a "Sign in"
    Given el usuario navega a la web de automation practice
    When el usuario ingresa un dato en el buscador <busqueda>
    And el usuario va a ordenar por precio mas bajo
    Then el usuario ve en pantalla correctamente ordenado

    Examples:
      | busqueda |
      | dress    |