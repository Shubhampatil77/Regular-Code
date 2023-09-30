package Day9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Connectionjdbc {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Id: ");
		int id1 = sc.nextInt();

		System.out.print("Enter Name: ");
		String name1 = sc.next();

		System.out.print("Enter Marks: ");
		int marks1 = sc.nextInt();

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shubham", "root", "1234");

		PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?)");
		ps.setInt(1, id1);
		ps.setString(2, name1);
		ps.setInt(3, marks1);

		int i = ps.executeUpdate();
		if (i > 0) {
			System.out.print("Success");

		} else {
			System.out.print("not Success");

		}
	}

}
