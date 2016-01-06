package com.acc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/restricted/xss")
public class XssController extends HttpServlet
{
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException,
			IOException
	{
		//		String input = (String) request.getParameter("name");
		String input = (String) request.getAttribute("name");
		System.out.println("user input - " + input);

		Cookie cookie = new Cookie("test", "India");

		cookie.setComment("insecure cookie, can be stolen by rooks");
		//cookie.setHttpOnly(true);
		response.addCookie(cookie);

		request.setAttribute("userInput", input);
		request.getRequestDispatcher("/WEB-INF/views/xss2.jsp").forward(
				request, response);
	}
}
