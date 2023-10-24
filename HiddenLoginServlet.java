

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/HiddenLoginServlet")
public class HiddenLoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("<html><body>");
		String s1=request.getParameter("t1");
		String s2=request.getParameter("t2");
		out.println("<form method='post' action='RetHiddenServlet'>");
		out.println("<input type='hidden' name='t1' value="+ s1 +">");
		out.println("<input type='hidden' name='t2' value="+ s2 +">");
		out.println("<input type='submit' value='submit'>");
		out.println("</form></body></html>");
		out.close();

	}

}
