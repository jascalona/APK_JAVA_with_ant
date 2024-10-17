package Conn_db;

import javax.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author JEscalona
 */
public class Conexion {
    
    Connection conectar = null;
    
    public Connection conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/gxdeve_apps","root","root");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.print("Error al Conectar: " +e.getMessage());
        }
        return conectar;
    }

    public class sentencia {

        public sentencia() {
        }
    }
}
