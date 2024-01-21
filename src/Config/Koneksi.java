package Config;
import java.sql.*;
import javax.swing.JOptionPane;

public class Koneksi {
    Connection cn;
    
    public static Connection BukaKoneksi(){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/mahasiswa", "root", "");
                return cn;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
                return null;
            }
        }
        
    }

