package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.EjemploPracticaService;

public class EjemploPracticaSteps extends PageSteps {

    @Given("el usuario navega a la web de automation practice")
    public void elUsuarioNavegaALaWebDeAutomationPractice() {
        EjemploPracticaService.navegarWeb();

    }

    @When("^el usuario pulsa el boton \"(.*)\"$")
    public void elUsuarioPulsaElBoton(String boton) {
        EjemploPracticaService.clickButton();

    }

    @And("el usuario ingresa el usuario (.*) y la Password (.*)")
    public void ingresarUsuarioYPassword(String usuario, String password) {
        EjemploPracticaService.ingresarUsuario(usuario);
        EjemploPracticaService.ingresarPassword(password);
        EjemploPracticaService.clickButtonSignIn();

    }

    @Then("el usuario se encuentra logueado (.*)")
    public void elUsuarioSeEncuentraLogueado(String texto) {
        EjemploPracticaService.verificarLoginOk(texto);

    }

    @Then("el usuario verifica que se enseña la pagina de Sign in")
    public void elUsuarioVerificaQueSeEnseñaLaPaginaDeSignIn() {
        EjemploPracticaService.verificarSignInPage();
    }

    @When("el usuario ingresa un dato en el buscador (.*)")
    public void usuarioVisualizaBusca(String dato) {
        EjemploPracticaService.visualizarBucador();
        EjemploPracticaService.realizarBusqueda(dato);

    }

    @Then("el usuario ve en pantalla los resultados de la busqueda")
    public void elUsuarioVeEnPantallaLosResultadosDeLaBusqueda() {
        EjemploPracticaService.resultadoBusqueda();
    }
}