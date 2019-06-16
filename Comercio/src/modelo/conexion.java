package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ivet
 */
public class conexion {
    
    private final String base = "comercio";
    private final String password = "";
    private final String user = "root";
    private final String url = "jdbc:mysql://localhost:3306" + base;
    private Connection con = null;
    
    public Connection getConexion(){
        
        
            
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.url, this.user, this.password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        return con;
        
    }
    
}
