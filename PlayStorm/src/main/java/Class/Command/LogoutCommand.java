package Class.Command;

import Class.User;
import GUI.Login;
import Interfaces.IntLogOut;
import javax.swing.JFrame;

public class LogoutCommand implements IntLogOut {

    @Override
    public void logOut(JFrame vista) {
        Login login = new Login();
        login.setVisible(true);
        vista.dispose();

        logOutUser();
    }

    @Override
    public void logOutUser() {
        User.activeUser.clear();
    }

}
