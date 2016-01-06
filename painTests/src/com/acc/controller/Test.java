package com.acc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/authTest")
public class Test extends HttpServlet
{
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException,
			IOException
	{
		HttpSession session = request.getSession();

		System.out.println("authTest - " + session.getId());
		System.out.println("is new"+session.isNew());
	}

	public void init()
	{
		System.out.println("servlet initialisation");
	}

	public void destroy()
	{
		System.out.println("destroying servlet");
	}
}
