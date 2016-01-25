package com.acc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/restricted/nonEvilWebsite")
public class NonEvilWebsiteController extends HttpServlet
{
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException,
			IOException
	{
		System.out.println("Non evil website receives the click...");
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
