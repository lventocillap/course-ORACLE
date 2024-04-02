
package crud_tarea_10_y_11;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class Consultas {
    
    public static void MostrarDatos(JTable tblDatos){
        Conexion cn = new Conexion();
        Connection conectar = cn.conectar();
        
        DefaultTableModel modelo  = new DefaultTableModel();
        modelo.addColumn("productId");
        modelo.addColumn("productName");
        modelo.addColumn("supplierId");
        modelo.addColumn("categoryId");
        modelo.addColumn("quantityPerUnit");
        modelo.addColumn("unitPrice");
        modelo.addColumn("unitsInStock");
        modelo.addColumn("unitsOnOrder");
        modelo.addColumn("reorderLevel");
        modelo.addColumn("discontinued");
        tblDatos.setModel(modelo);
        
        String query = "select * from product"; 
        
        try{
            Statement st = conectar.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                String[] dato = new String[10];
                for (int i = 0; i < dato.length; i++) {
                    dato[i]=rs.getString(i+1);
                }
                modelo.addRow(dato);
            }
            
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    
    public static void GuardarDatos(String[] datos){
        Conexion cn = new Conexion();
        Connection conectar = cn.conectar();
        String[] fila = datos;
        for (int i = 0; i < fila.length; i++) {
            System.out.println(fila[i]);
        }
        
        try{
            PreparedStatement ps = conectar.prepareStatement("INSERT INTO product(productName,supplierId,categoryId,quantityPerUnit"
                    + ",unitPrice,unitsInStock,unitsOnOrder,reorderLevel,discontinued"
                    + ") VALUES(?,?,?,?,?,?,?,?,?)");
            
                 ps.setString(1, fila[0]);
                 ps.setInt(2, Integer.parseInt(fila[1]));
                 ps.setInt(3, Integer.parseInt(fila[2]));
                 ps.setString(4, fila[3]);
                 ps.setDouble(5, Double.parseDouble(fila[4]));
                 ps.setInt(6, Integer.parseInt(fila[5]));
                 ps.setInt(7,Integer.parseInt(fila[6]));
                 ps.setInt(8, Integer.parseInt(fila[7]));
                 ps.setString(9, fila[8]);
            ps.executeUpdate();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    
    public static void EliminarDatos(String ID){
        Conexion cn = new Conexion();
        Connection conectar = cn.conectar();
        try{
            PreparedStatement ps = conectar.prepareStatement("delete from product where productId = "+ID);
            ps.executeUpdate();
        }catch(SQLException e){
            throw new RuntimeException();
        }
    }
    
    public static void ActualizaerDatos(String consulta){
        Conexion cn = new Conexion();
        Connection conectar = cn.conectar();
        
        try{
            PreparedStatement ps = conectar.prepareStatement("UPDATE product SET "+consulta);
            ps.executeUpdate();
        }catch(SQLException e){
            throw new RuntimeException();
        }
        
        
    }
    
    
    
}
