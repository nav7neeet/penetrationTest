package com.acc.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class XssFilter implements Filter
{
	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException
	{
		String input = request.getParameter("name");
		System.out.println("user input - " + input);

		String sanitizedInput = sanitizeInput(input);
		request.setAttribute("name", sanitizedInput);

		chain.doFilter(request, response);
	}

	public String sanitizeInput(String input)
	{
		String sanitizedInput = input;

		sanitizedInput = sanitizedInput.replaceAll("<", "&lt;");
		sanitizedInput = sanitizedInput.replaceAll(">", "&gt;");
		sanitizedInput = sanitizedInput.replaceAll("'", "&apos;");
		sanitizedInput = sanitizedInput.replaceAll("\"", "&quot;");
		sanitizedInput = sanitizedInput.replaceAll("&", "&amp;");

		sanitizedInput = sanitizedInput.replaceAll(" ", "&nbsp;");// escaping space is required for unquoted attribs.

		//		sanitizedInput = sanitizedInput.replaceAll("[(]", "\\\\x28;");
		//		sanitizedInput = sanitizedInput.replaceAll("b", "\\\\x65");

		System.out.println("sanitized input - " + sanitizedInput);

		return sanitizedInput;
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
