package com.acc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/restricted/csrf")
public class CsrfController extends HttpServlet
{
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException,
			IOException
	{
		String input = (String) request.getParameter("name");
		String timeStamp = (String) request.getParameter("timeStamp");
		System.out.println("user input Get- " + input);
		System.out.println("session creation time - " + timeStamp);

		if (timeStamp == null)
		{
			System.out.println("CSRF detected....");
			request.setAttribute("errorMessage", "CSRF Detected");
		}
		RequestDispatcher rd = request
					.getRequestDispatcher("/WEB-INF/views/csrfResult.jsp");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException,
			IOException
			{
		String input = (String) request.getParameter("name");
		String timeStamp = (String) request.getParameter("timeStamp");
		System.out.println("user input Post - " + input);
		System.out.println("session creation time - " + timeStamp);
		
		if (timeStamp == null)
		{
			System.out.println("CSRF detected...");
			request.setAttribute("errorMessage", "CSRF Detected");
		}
		RequestDispatcher rd = request
				.getRequestDispatcher("/WEB-INF/views/csrfResult.jsp");
		rd.forward(request, response);
			}
}
