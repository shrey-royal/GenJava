import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/genjava", "root", "root");

            if(conn != null) {
                System.out.println("Connected to database!");
            } else {
                System.out.println("Failed to connect to database!");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    // public static void main(String[] args) {
    //     System.out.println(getConnection());
    // }
}
