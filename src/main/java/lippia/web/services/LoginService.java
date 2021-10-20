package lippia.web.services;

import com.crowdar.core.actions.MobileActionManager;
import lippia.web.constants.LoginConstants;

public class LoginService {

    public static void ingresarCorreo(String correo) {
        MobileActionManager.setInput(LoginConstants.INPUT_CORREO_ELECTRONICO_XPATH, correo);

    }

    public static void ingresarPassword(String password) {
        MobileActionManager.setInput(LoginConstants.INPUT_PASSWORD_XPATH, password);

    }

    public static void clickContinuar() {
        MobileActionManager.click(LoginConstants.BUTTON_SIGNIN_XPATH);
    }

    public static String verificarLogueoOk() throws InterruptedException {
        return MobileActionManager.getText(LoginConstants.INGRESO_OK_XPATH);
    }
}

