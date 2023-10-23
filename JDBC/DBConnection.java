import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static void main(String[] args) {
        try {
            // 1. Load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
    
            // 2. Create a connection
            final String URL = "jdbc:mysql://localhost:3306/genjava";
            final String USERNAME = "root";
            final String PASSWORD = "root1";

            Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            if(conn != null) {
                System.out.println("DB Connected Successfully!");
            } else {
                System.out.println("Error in DB Connection!");
            }

            conn.close();   // Close the connection            
        } catch (ClassNotFoundException e) {
            // e.printStackTrace();
            System.out.println("Driver class not found");
        } catch (SQLException e) {
            // e.printStackTrace();
            System.out.println("Error establishing the database connection");
        }
    }
}