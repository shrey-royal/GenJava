import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveData {
	public static void main(String[] args) {
		try {
			Connection conn = DBConnection.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from products");
			
			System.out.println("Product ID\tProduct Name\tDescription\t\t\t\t\tPrice\tQuantity");
			while(rs.next()) {
				System.out.println("\t" + rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t\t\t" + rs.getInt(4) + "\t" + rs.getInt(5));
			}
			
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
