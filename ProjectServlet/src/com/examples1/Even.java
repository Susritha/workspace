package com.examples1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Even
 */
@WebServlet("/Even")
public class Even extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Even() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw;
		pw = response.getWriter();
		String name = request.getParameter("myval");
		int n=Integer.parseInt(name);
		pw.println(n);
		if(n%2==0)
		{
			pw.println("It is an even number..!");
		}
		else
		{
			pw.println("It is an odd number..!");
		}
	}

	
	

}
