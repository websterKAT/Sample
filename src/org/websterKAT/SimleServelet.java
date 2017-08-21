package org.websterKAT;

import java.io.IOException;
import java.io.PrintWriter;	

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SimleServelet
 */
@WebServlet(description = "This is a simple experimanet", urlPatterns = { "/lizanKiara" },
   initParams = {@WebInitParam (name="defaultUser",value="John Doe")}

		)
public class SimleServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		if(userName != "" && userName != null){
			session.setAttribute("savedUserName",userName);
			context.setAttribute("savedUserName",userName);
		}
		out.println("Request parameter has username as ---"+ userName);
		out.println("Session parameter has userName as +++"+ (String) session.getAttribute("savedUserName"));
		out.println("Context parameter has userName as +++"+ (String) context.getAttribute("savedUserName"));
		out.println("Init parameter has default userName as +++"+ this.getServletConfig().getInitParameter("defaultUser"));
		
	}
 
}
