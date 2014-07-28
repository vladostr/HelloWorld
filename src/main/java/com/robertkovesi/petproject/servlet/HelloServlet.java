package com.robertkovesi.petproject.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain");
		response.setStatus(200);
		
		PrintWriter writer = response.getWriter();
		
		writer.println("Hello World!");
	    Enumeration<String> parameterNames =  request.getParameterNames();
	    while (parameterNames.hasMoreElements()) {
           String paramName = parameterNames.nextElement();
           writer.print(paramName + ":");
           String[] paramValues = request.getParameterValues(paramName);
           for (int i = 0; i < paramValues.length; i++) {
               String paramValue = paramValues[i];

               if(i!=0)
            	   writer.print(","); 
               writer.print(" " + paramValue);
           }	                   
           writer.println("");
	    }
		writer.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
