import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		try {
			Connection conn = DBConnection.getConnection();
			
			String query = "INSERT INTO products (product_name, description, price, quantity) VALUES (?, ?, ?, ?)";	//? -> placeholders
			
			PreparedStatement pstmt = conn.prepareStatement(query);
			Scanner sc = new Scanner(System.in);
			
			System.out.println("product name: ");
			pstmt.setString(1, sc.nextLine());
			System.out.println("product description: ");
			pstmt.setString(2, sc.nextLine());
			System.out.println("product price: ");
			pstmt.setInt(3, sc.nextInt());
			System.out.println("product quantity: ");
			pstmt.setInt(4, sc.nextInt());
			
			if(pstmt.executeUpdate() > 0) {
				System.out.println("Data Inserted Successfully!");
			} else {
				System.out.println("Data Failed to Insert!");
			}
			
			sc.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
