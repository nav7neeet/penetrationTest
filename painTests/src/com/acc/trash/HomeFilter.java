package com.acc.trash;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HomeFilter implements Filter
{
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException
	{
		System.out.println("HomeFilter - entry");
		chain.doFilter(req, res);
		System.out.println("HomeFilter - exit");
	}

	public void destroy()
	{
	}

	public void init(FilterConfig arg0) throws ServletException
	{
	}
}
