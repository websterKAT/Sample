package org.websterKAT;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		out.println("Hello from the get method"+ userName);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		String fullName = request.getParameter("fullName");
		out.println("Hello from POST Method "+ userName+" We know your full Name: "+fullName);
		String prof = request.getParameter("prof");
		out.println("You are a "+prof);
		
		String[] location = request.getParameterValues("location");
		out.println("You are at "+location.length + " places");
		for(int j = 0; j < location.length;j++){
			out.println(location[j]);
		}
	}

}
 