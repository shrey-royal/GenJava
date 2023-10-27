import java.sql.Connection;
import java.sql.Statement;

public class UpdateData {

	public static void main(String[] args) {
		try {
			Connection conn = DBConnection.getConnection();
			
			String updateQuery = "UPDATE products " +
                    "SET product_name = 'New Product Name', " +
                    "description = 'New Description', " +
                    "price = 49.99, " +
                    "quantity = 100 " +
                    "WHERE product_id = 22;";
			
			Statement stmt = conn.createStatement();
			int re = stmt.executeUpdate(updateQuery);
			
			if(re > 0) {
				System.out.println("Data Updated Successfully!");
			} else {
				System.out.println("Data Failed to update!");
			}
			
			

		}catch (Exception e) {
			e.printStackTrace();
		}

	}
}