import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteData {

	public static void main(String[] args) {
		try {
			Connection conn = DBConnection.getConnection();
			
			String deleteQuery = "DELETE FROM products WHERE product_id = ?";
			
			PreparedStatement pstmt = conn.prepareStatement(deleteQuery);
			pstmt.setInt(1, 22);
			
			int re = pstmt.executeUpdate();
			
			if(re > 0) {
				System.out.println("Data Deleted Successfully!");
			} else {
				System.out.println("Data Failed to Delete!");
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
