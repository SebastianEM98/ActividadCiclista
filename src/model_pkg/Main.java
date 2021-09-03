/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_pkg;

import views_pkg.FrameMenu;

/**
 *
 * @author Sebastian Echeverry
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conexion inst_con = new Conexion();
        FrameMenu inst_frame = new FrameMenu();
        inst_con.getConnection();
        inst_frame.setVisible(true);
    }
    
}
