package org.durga.servlet;

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
 * Servlet implementation class SessionDemoServlet
 */
@WebServlet(description = "A servlet to demonstrate the use of Session and Context object", urlPatterns = {
		"/SessionDemoServlet" }, initParams = { @WebInitParam(name = "defaultUser", value = "Durga") })
public class SessionDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");

		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		if (userName != null && userName != "") {
			session.setAttribute("savedUserName", userName);
			context.setAttribute("savedUserName", userName);
		}

		out.println("Request parameter has username as " + userName);
		out.flush();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println("<br>Session parameter has username as " + (String) session.getAttribute("savedUserName"));
		out.println("<br>Context parameter has username as " + (String) context.getAttribute("savedUserName"));

		out.println("\n<br>Init parameter has the default username as " + 
					getServletConfig().getInitParameter("defaultUser"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
