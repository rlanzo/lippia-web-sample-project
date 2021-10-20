package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LoginService;
import org.testng.Assert;

public class LoginSteps extends PageSteps {
    @When("completar correo electronico (.*) y contraseña (.*) e ingresar")
    public void completeCorreoElectronico(String correo, String pass) {
        LoginService.ingresarCorreo(correo);
        LoginService.ingresarPassword(pass);
        LoginService.clickContinuar();
    }

    @Then("el usuario se encuentra logueado (.*)")
    public void elUsuarioSeEncuentraLogueadoTexto(String texto) throws InterruptedException {
        Assert.assertEquals(LoginService.verificarLogueoOk(), texto);

    }
}