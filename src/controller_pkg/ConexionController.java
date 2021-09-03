/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller_pkg;

import java.sql.Connection;
import java.sql.SQLException;
import model_pkg.Conexion;

/**
 *
 * @author Sebastian Echeverry
 */
public class ConexionController {
    
    Conexion conexion;
    
    public ConexionController() throws ClassNotFoundException, SQLException {
        conexion = new Conexion();
    }
    
    public Connection getConnection() {
        return conexion.getConnection();
    }
}
