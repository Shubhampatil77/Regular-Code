package Day9;

import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;

public class jdbcCRUD {
	public static void main(String args[]) throws Exception {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Rollno: ");
			int id1 = sc.nextInt();

			System.out.print("Enter Marks: ");
			int marks1 = sc.nextInt();

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shubham", "root", "1234");

			PreparedStatement ps = con.prepareStatement("update student set marks=? where rollno=?");
			ps.setInt(1, marks1);     
			ps.setInt(2, id1);

			int count = ps.executeUpdate();
			if (count > 0) {
				System.out.println("sucess");
			} else {
				System.out.println("not sucess");
			}
		}
	}
}
