/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Command;

import Class.User;
import GUI.Login;
import Interfaces.IntLogOut;
import Interfaces.IntUser;
import javax.swing.JFrame;

/**
 *
 * @author jorge
 */
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
        User.usuarioActivo.clear();
    }
    
    
}
