package ch8;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ch8/getServlet")
public class GetServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		String msg = request.getParameter("msg");
		String value = request.getParameter("value");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter(); 
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Get Servlet 방식</h1>");
		out.println("<h2>msg : "+msg + "</h2>");
		out.println("<h2>value : "+value + "</h2>");
		out.println("</body>");
		out.println("</html>");
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		String msg = request.getParameter("msg");
		String value = request.getParameter("value");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter(); 
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Get Servlet 방식</h1>");
		out.println("<h2>msg : "+msg + "</h2>");
		out.println("<h2>value : "+value + "</h2>");
		out.println("</body>");
		out.println("</html>");
	}
}