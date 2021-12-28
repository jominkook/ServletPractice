package ch3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/ch3/myServlet2")
public class MyServlet2 extends HttpServlet {


	@Override
    public void service(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException{
		response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>MyServlet2</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>파이팅 코리아!!!</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}