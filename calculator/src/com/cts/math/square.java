package com.cts.math;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class square extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		// recieving data using redirect transfer and data through url

		// int i = Integer.parseInt(req.getParameter("k"));
		PrintWriter out = res.getWriter();
		// int k=i*i;
		// out.print(k);

		// recieving data using session concept
		// HttpSession session=req.getSession();
		// int k=(int)session.getAttribute("k");
		// out.print("the square is "+k*k);
		// session.removeAttribute("k");
		// out.print(k);

		// recieving data using cookies
		int k=0;
		Cookie co[] = req.getCookies();
		for (Cookie c : co) {
			if (c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
				break;
			}
		}
		
		//res.setContentType("text");
		out.print("hi this demo is by <br>");
		ServletConfig cf=getServletConfig();
		String s=cf.getInitParameter("name");

		out.print(k*k+" "+s);

		// using dispatcher fuction
		
		
		// req.setAttribute("k",k);
		// RequestDispatcher rd = req.getRequestDispatcher("output.jsp");
		// rd.forward(req, res);

	}
}
