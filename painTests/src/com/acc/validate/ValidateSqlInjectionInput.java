package com.acc.validate;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ValidateSqlInjectionInput implements Filter
{
	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException
	{
		String input = request.getParameter("name");
		System.out.println("user input - " + input);

		if (validate(input))
		{
			chain.doFilter(request, response);
		}
		else
		{
			PrintWriter out = response.getWriter();
			out.print("Sql Injection Detected. Sorry Dude...u can't go in!!");
		}
	}

	public boolean validate(String userInput)
	{
		boolean isValid = false;

		if (userInput.matches(".*[^a-zA-Z].*"))
		{
			System.out.println("SQL injection detected, stop further processing.");
		}
		else
		{
			System.out.println("valid input");
			isValid = true;
		}
		return isValid;
	}

	@Override
	public void destroy()
	{
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException
	{
	}
}
