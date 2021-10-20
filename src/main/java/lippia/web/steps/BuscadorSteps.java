package lippia.web.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.BuscadorServices;
import org.testng.Assert;

public class BuscadorSteps {
    @When("el usuario ingresa un dato en el buscador(.*)")
    public void completaryBuscar(String dato) {
        BuscadorServices.ingresarDato(dato);
        BuscadorServices.clickLupita();

    }
        @Then("el usuario ve en pantalla los resultados de la busqueda (.*)")
        public void visualizarResultadoBusqueda(String mensaje) throws InterruptedException {
            Assert.assertEquals(BuscadorServices.verificarBusquedaOk(), mensaje);
        }
    }

