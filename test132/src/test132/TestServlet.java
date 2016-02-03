package test132;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		for(Enumeration<String> names = request.getHeaderNames();names.hasMoreElements();){
			String name = names.nextElement();
			out.println("<h3>" + name);
			for(Enumeration<String> values = request.getHeaderNames();values.hasMoreElements();){
				String value = values.nextElement();
				out.print(value+",");
			}
			out.println("</h3>");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		this.doGet(request, response);
	}

}
