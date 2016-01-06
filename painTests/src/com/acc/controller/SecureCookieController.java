package com.acc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/restricted/secureCookie")
public class SecureCookieController extends HttpServlet
{
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException,
			IOException
	{
		Cookie cookie = new Cookie("test", "India");

		cookie.setComment("just for testing dude");
		//cookie.setHttpOnly(true);
		response.addCookie(cookie);
		request.getRequestDispatcher("/WEB-INF/views/stealCookies.jsp")
				.forward(request, response);
	}
}
