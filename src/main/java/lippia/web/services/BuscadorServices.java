package lippia.web.services;

import com.crowdar.core.actions.MobileActionManager;
import lippia.web.constants.BuscadorConstants;

public class BuscadorServices {

    public static void ingresarDato(String dato) {
        MobileActionManager.setInput(BuscadorConstants.VISTA_BUSCADOR_XPATH, dato);

    }
    public static void clickLupita() {
        MobileActionManager.click(BuscadorConstants.LUPITA_BUSCADOR_XPATH);
    }

    public static String verificarBusquedaOk() throws InterruptedException {
        return MobileActionManager.getText(BuscadorConstants.RESULTADO_BUSQUEDA_XPATH);
    }

}
