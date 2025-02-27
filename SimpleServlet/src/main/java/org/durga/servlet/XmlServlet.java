package org.durga.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		out.println("<h1>Hello from GET method! " + userName + "</h1>");
		
		out.println("<br>Init parameter has the default username as " + getServletConfig().getInitParameter("defaultUser"));
	}
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		String fullName = request.getParameter("fullName");
		out.println("<h1>Hello from POST method! " + userName + "! We know your full name is " + fullName + "</h1>");
		String profession = request.getParameter("profession");
		out.println("<h1>You are a " + profession + "</h1>");
		String[] locations = request.getParameterValues("location");
		out.println("<h1>You are from " + locations.length + " places</h1>");
		for (String location : locations) {
			out.println("<h1>" + location + "</h1>");
		}
	}

}
