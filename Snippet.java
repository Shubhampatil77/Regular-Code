package snippet;

public class Snippet {
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import java.io.IOException;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
	
	@WebServlet("/regForm")
	public class  extends HttpServlet {
	    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/your_database";
	    private static final String JDBC_USER = "your_username";
	    private static final String JDBC_PASSWORD = "your_password";
	
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        // Retrieve form parameters
	        String firstName = request.getParameter("fname");
	        String lastName = request.getParameter("lname");
	        String street = request.getParameter("street");
	        String address = request.getParameter("address");
	        String city = request.getParameter("city");
	        String state = request.getParameter("state");
	        String email = request.getParameter("email1");
	        String phone = request.getParameter("phone");
	
	        // JDBC variables
	        Connection conn = null;
	        PreparedStatement stmt = null;
	
	        try {
	            // Register JDBC driver and open a connection
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
	
	            // SQL query to insert data into the database
	            String sql = "INSERT INTO customers (first_name, last_name, street, address, city, state, email, phone) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
	            stmt = conn.prepareStatement(sql);
	
	            // Set parameters
	            stmt.setString(1, firstName);
	            stmt.setString(2, lastName);
	            stmt.setString(3, street);
	            stmt.setString(4, address);
	            stmt.setString(5, city);
	            stmt.setString(6, state);
	            stmt.setString(7, email);
	            stmt.setString(8, phone);
	
	            // Execute the query
	            stmt.executeUpdate();
	
	            // Redirect to a confirmation page or wherever appropriate
	            response.sendRedirect("confirmation.html");
	
	        } catch (SQLException | ClassNotFoundException e) {
	            e.printStackTrace(); // Handle errors here
	        } finally {
	            // Close resources
	            try {
	                if (stmt != null) {
	                    stmt.close();
	                }
	                if (conn != null) {
	                    conn.close();
	                }
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}
	
}

