import java.sql.*;
import javax.swing.JOptionPane;


public class connect_database {

    public static Connection join_database(){
        
        try{  
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");  
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://database/funkay_boys_database.accdb");  
            return con;
        }catch(Exception e){
        JOptionPane.showMessageDialog( null, e,"Error", JOptionPane.ERROR_MESSAGE);
         return null;
        }

    }
}


