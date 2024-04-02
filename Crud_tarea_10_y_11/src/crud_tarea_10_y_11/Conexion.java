
package crud_tarea_10_y_11;

import java.sql.*;
public class Conexion {
    
    public Connection conectar(){
        Connection conecta;
        String url = "jdbc:mysql://localhost:3306/northwind?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String user = "root";
        String password = "";
        
        try{
            conecta = DriverManager.getConnection(url, user, password);
            System.out.println("Conexion Exitosa");
        }catch(SQLException e){
          throw new RuntimeException(e);
        }
        return conecta;
    }
    
   
}
