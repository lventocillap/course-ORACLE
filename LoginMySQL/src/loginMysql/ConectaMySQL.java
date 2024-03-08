package loginMysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectaMySQL {
    public static Connection ConectarBD(){
        Connection conexion;
        String host="jdbc:mysql://localhost:3306/";
        String user="root";
        String pass="";
        String bd="prueba";
        System.out.println("Conectado...");
        try{
            conexion=DriverManager.getConnection(host+bd, user, pass);
            System.out.println("Conexion exitosa !!!");
        }catch(SQLException e){
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
        return conexion;
    }
    public static void main(String[] args) {
        Connection bd=ConectarBD();
    }
}
