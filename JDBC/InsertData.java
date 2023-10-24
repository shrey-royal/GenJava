import java.sql.Connection;

public class InsertData {
    public static void main(String[] args) {
        Connection conn = DBConn.getConnection();
        
        try {
            String query = "INSERT INTO products (product_name, description, price, quantity)\r\n" + //
                    "VALUES ('IPhone 15', 'IPhone Description', 159000, 100);\r\n";

            int rowsAffected = conn.createStatement().executeUpdate(query);

            if(rowsAffected > 0) {
                System.out.println("Data inserted successfully!");
            } else {
                System.out.println("Failed to insert data!");
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
