package com.acc.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CopyOfSessionFilter implements Filter
{
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException
	{
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		boolean isRestrictedResource = checkRestrictedResource(request);

		if (isRestrictedResource)
		{
			HttpSession session = request.getSession();
			boolean sessionExists = checkSessionExistence(session);

			System.out.println("SessionFilter - restricted resource requested");
			System.out.println("SessionFilter - " + session.getId());
			System.out.println("inactive interval - "
					+ session.getMaxInactiveInterval());

			if (sessionExists)
			{
				boolean sessionNotHijacked = checkSessionHijack(
						session, request);

				if (sessionNotHijacked)
				{
					chain.doFilter(request, response);
				}
				else
				{
					request.setAttribute("errorMessage",
							"Session Hijack Attempted");
					RequestDispatcher rd = request
							.getRequestDispatcher("WEB-INF/views/error.jsp");
					rd.forward(request, response);
				}
			}
			else
			{
				response.reset();
				session.invalidate();
				System.out.println("SessionFilter - restricted resource requested without valid session");

				request.setAttribute("errorMessage",
						"restricted resource requested without valid session");
				RequestDispatcher rd = request
						.getRequestDispatcher("WEB-INF/views/error.jsp");
				rd.forward(request, response);
			}
		}
		else
		{
			System.out.println("SessionFilter - Unrestricted resource");
			chain.doFilter(request, response);
		}

	}

	public boolean checkRestrictedResource(HttpServletRequest request)
	{
		boolean isRestricted = true;
		String requestURI = request.getRequestURI();
		System.out.println("SessionFilter - checkRestrictedResource()");

		if ("/painTest/home".equals(requestURI)
				| "/painTest/login".equals(requestURI))
		{
			isRestricted = false;
		}
		return isRestricted;
	}

	public boolean checkSessionExistence(HttpSession session)
	{
		boolean isValidSession = true;
		System.out.println("SessionFilter - checkSessionExistence() "
				+ session.getAttribute("user"));
		if (session.getAttribute("user") == null)
		{
			isValidSession = false;
			System.out.println("hi........");
		}
		return isValidSession;
	}

	public boolean checkSessionHijack(HttpSession session,
			HttpServletRequest request)
	{
		boolean sessionNotHijacked = true;
		System.out.println("SessionFilter - checkSessionHijack() - prev ip"
				+ session.getAttribute("ip"));
		System.out.println("SessionFilter - checkSessionHijack() - remote ip"
				+ request.getRemoteAddr());

		if (!session.getAttribute("ip").equals(request.getRemoteAddr()))
		{
			sessionNotHijacked = false;
		}
		return sessionNotHijacked;
	}

	public void destroy()
	{
	}

	public void init(FilterConfig arg0) throws ServletException
	{
	}
}
