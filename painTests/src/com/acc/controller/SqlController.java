package com.acc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.acc.dao.FetchDetails;

@WebServlet("/restricted/sql")
public class SqlController extends HttpServlet
{
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException,
			IOException
	{
		String input = request.getParameter("name");
		System.out.println("user input - " + input);

		List list;
		try
		{
			list = new FetchDetails().displayDetails(input);
			if (list.isEmpty())
			{
				request.getRequestDispatcher(
						"/WEB-INF/views/noResults.jsp").forward(
						request, response);
			}

			else
			{
				request.setAttribute("details", list);
				request.getRequestDispatcher(
						"/WEB-INF/views/userDetails.jsp").forward(
						request, response);
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}