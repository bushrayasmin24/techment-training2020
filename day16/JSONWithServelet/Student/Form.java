package com.techment.webjava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class Form
 */
@WebServlet("/Form")
public class Form extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Gson gson = new Gson();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Students s = new Students();
		
		s.setId(Integer.parseInt(request.getParameter("id")));
		s.setName(request.getParameter("name"));
		s.setAddress(request.getParameter("address"));
		s.setRating(Integer.parseInt(request.getParameter("rating")));
		s.setMop(Integer.parseInt(request.getParameter("mop")));
		
		String empjsonstring=gson.toJson(s);
		
		PrintWriter out = response.getWriter();
		
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
		out.print(empjsonstring);
			
}

}
