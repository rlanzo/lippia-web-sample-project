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

    public static void clickOptionPrecioMasBajo(String precioMasBajo) {
        MobileActionManager.setCheckbox(BuscadorConstants.SORT_BY_XPATH, Boolean.valueOf("precioMasBajo"));
    }

    public static boolean verificaPrecio1() {
        return MobileActionManager.isPresent(BuscadorConstants.PRECIO1_XPATH);
    }

    public static boolean verificaPrecio2() {
        return MobileActionManager.isPresent(BuscadorConstants.PRECIO2_XPATH);
    }

    public static boolean verificaPrecio3() {
        return MobileActionManager.isPresent(BuscadorConstants.PRECIO3_XPATH);
    }

    public static boolean verificaPrecio4() {
        return MobileActionManager.isPresent(BuscadorConstants.PRECIO4_XPATH);
    }
}
