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

    @Then("el usuario verifica que se enseña la pagina de Sign in")
    public void elUsuarioVerificaQueSeEnseñaLaPaginaDeSignIn() {
        EjemploPracticaService.verificarSignInPage();
    }

}