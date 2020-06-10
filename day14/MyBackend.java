package com.techment.java;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyBackend
 */
@WebServlet("/MyBackend")
public class MyBackend extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		System.out.println("MyBackend class");
		PrintWriter out = response.getWriter();
		String name=request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		
		out.print("<br> Your name is "+name +"<br>");
		out.print("Your age is "+age +"<br>");
		
		if(age >= 18)
			out.print("You are eligible for vote");
		else
			out.print("You are not eligible for vote");
		
		Cookie cookie = new Cookie("mykey1",name);
		response.addCookie(cookie);  //created by server and stored in browser
		
		out.print("<br> <a href='Second' > Go to second page.</a>");
	}

}
