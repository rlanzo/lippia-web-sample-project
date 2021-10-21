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

    @When("el usuario va selecciona ordenar por precio mas bajo (.*)")
    public void usuarioSeleccionaPrecioMasBajo(String PrecioBajo) {
        BuscadorServices.clickOptionPrecioMasBajo(PrecioBajo);


    }

    @Then("el usuario ve en pantalla los resultados de la busqueda (.*)")
    public void visualizarResultadoBusqueda(String mensaje) throws InterruptedException {
        Assert.assertEquals(BuscadorServices.verificarBusquedaOk(), mensaje);
    }

    @Then("el usuario ve en pantalla correctamente ordenado")
    public void visualizarOrdendadoPrecio() {
        Assert.assertTrue(BuscadorServices.verificaPrecio1(),"No se ve el precio1");
        Assert.assertTrue(BuscadorServices.verificaPrecio2(),"No se ve el precio2");
        Assert.assertTrue(BuscadorServices.verificaPrecio3(),"No se ve el precio3");
        Assert.assertTrue(BuscadorServices.verificaPrecio4(),"No se ve el precio4");
    }
}


