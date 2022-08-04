/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package APP; 
import com.microsoft.sqlserver.jdbc.SQLServerConnectionPoolDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author alumnos
 */
public class Conexion {
    
    public static Connection getConnection(){
        //String  servidor="Localhost"; 
              
        String url="jdbc:sqlserver://localhost:1433;database=Escuela;integratedSecurity=true";  //
        try{
            Connection con=DriverManager.getConnection(url);
            return con;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"error al conectarse a la BD "+e.getMessage());
            return null;
        }
    
    }
    
    
}
