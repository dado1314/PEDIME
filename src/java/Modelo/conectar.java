package Modelo;
import com.mysql.jdbc.Connection;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conectar {
    
    public static final String url = "jdbc:mysql://localhost:3306/menu_electronico";
    public static final String username = "root";
    public static final String password = "NicoLepo72";
    
    public static Connection Conecto(){
        Connection con = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url, username, password);
            //JOptionPane.showMessageDialog(null,"Coneccion Exitosa");
            
        } catch(HeadlessException | ClassNotFoundException | SQLException e){
            System.out.println(e);
            
            
        }
        return con;
    }
    
    
    
}
