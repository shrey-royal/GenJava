import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CreateTable {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/genjava", "root", "root");

            String query = "CREATE TABLE products ( product_id INT PRIMARY KEY AUTO_INCREMENT, product_name VARCHAR(255) NOT NULL, description TEXT, price DECIMAL(10, 2) NOT NULL, quantity INT NOT NULL)";

            Statement stmt = conn.createStatement();
            int rowsAffected = stmt.executeUpdate(query);  //return the number of rows affected

            if(rowsAffected >= 0) {
                System.out.println("Table created successfully!");
            } else {
                System.out.println("Error creating table!");
            }

        } catch (Exception e) {
            // System.out.println(e);
            e.printStackTrace();
        }
    }
}
