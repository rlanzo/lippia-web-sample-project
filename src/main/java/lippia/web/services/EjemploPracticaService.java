package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.EjemploPracticaConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;


public class EjemploPracticaService extends ActionManager {

    public static void navegarWeb() {
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void clickButton() {
        click(EjemploPracticaConstants.BUTTON_SIGNIN_XPATH);
    }

    public static void verificarSignInPage() {
        waitVisibility(EjemploPracticaConstants.INPUT_ADDRESS_XPATH);
        Assert.assertTrue(isVisible(EjemploPracticaConstants.INPUT_ADDRESS_XPATH));
        waitVisibility(EjemploPracticaConstants.H1_TITULO_XPATH);
        Assert.assertEquals(getText(EjemploPracticaConstants.H1_TITULO_XPATH), "AUTHENTICATION", "No se encuentra el titulo");
    }

    public static void verificarLoginOk(String texto) {
        waitVisibility(EjemploPracticaConstants.H2_TITULO_XPATH);
        Assert.assertEquals(getText(EjemploPracticaConstants.H2_TITULO_XPATH), "MY ACCOUNT", "No se encuentra el titulo");
    }

    public static void ingresarUsuario(String usuario) {
        waitVisibility(EjemploPracticaConstants.INPUT_ADDRESS_XPATH);
        ingresarUsuario(EjemploPracticaConstants.INPUT_ADDRESS_XPATH);
    }

    public static void ingresarPassword(String password) {
        waitVisibility(EjemploPracticaConstants.INPUT_PASSWORD_XPATH);
        ingresarUsuario(EjemploPracticaConstants.INPUT_PASSWORD_XPATH);
    }

    public static void clickButtonSignIn() {
        click(EjemploPracticaConstants.BUTTON_SIGNIN_LOGIN_XPATH);

    }

    public static void visualizarBucador() {
        waitVisibility(EjemploPracticaConstants.BUSCADOR_XPATH);

    }

    public static void realizarBusqueda(String dato) {
        realizarBusqueda(EjemploPracticaConstants.INPUT_PASSWORD_XPATH);

    }
    public static void resultadoBusqueda(){
        waitVisibility(EjemploPracticaConstants.RESULTADO_BUSQUEDA_XPATH);
        Assert.assertEquals(getText(EjemploPracticaConstants.RESULTADO_BUSQUEDA_XPATH), "7 results have been found.", "No se encuentran resultados");
    }
}
