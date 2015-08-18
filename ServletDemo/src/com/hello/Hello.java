package com.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */

public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Hello() {
    	
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		//sc = getServletContext();	
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}
 ServletContext sc;
 RequestDispatcher rd;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		sc = request.getServletContext();
		rd = sc.getRequestDispatcher("/sec");
		PrintWriter pw;
		pw = response.getWriter();
		String name = request.getParameter("myval");
		pw.println(""+name);
		if(name.equals("verizon")){
			rd.forward(request, response);
			pw.println("You are valid.. :");
		}
		else{
		pw.println("You are not valid.. SORRY!!");
		}
		
		
		
		
	}

}
