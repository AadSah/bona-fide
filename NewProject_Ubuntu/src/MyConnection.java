import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
    
        public static Connection getConnection(){
     
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_login_register", "bonafide","BoNaFiDe###@123");
            System.out.println("Ayush");
        } catch (Exception ex) {
        	
            System.out.println("Error");
        }
        
        return con;
    }
    
}