

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DatabaseLogin")
public class DatabaseLogin extends HttpServlet 
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter	out=response.getWriter();
	response.setContentType("text/html");
	
	String s1=request.getParameter("s1");
	String s2=request.getParameter("s2");
	out.println("<html><body>");
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shubham","root","1234");
		PreparedStatement stat=con.prepareStatement("select * from user where uid=? and pwd=?");
		stat.setString(1, s1);
		stat.setString(2, s2);
		ResultSet rs=stat.executeQuery();
		if(rs.next())
		{
		out.println("<h1>Welcome To My Home Page!!!!!</h1>");
	}
	else
		out.println("<h3>Login Failed!!!!!!!</h3>");
		rs.close();
		con.close();
	}
	catch(Exception e)
	{
		out.println(e);
	}
	
	out.println("</body></html>");
	out.close();
	}

}
