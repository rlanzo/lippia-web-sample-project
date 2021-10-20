Feature: como usuario, quiero loguearme a la aplicacion

  @Smoke
  Scenario Outline: El usuario hace el login OK"
    Given el usuario navega a la web de automation practice
    When el usuario pulsa el boton "Sign in"
    And completar correo electronico <usuario> y contraseña <password> e ingresar
    Then el usuario se encuentra logueado <texto>

    Examples:
      | usuario             | password  | texto      |
      | dilanzita@gmail.com | Gire2021* | MY ACCOUNT |