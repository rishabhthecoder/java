package com.cts.math;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class confContextServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		PrintWriter out=res.getWriter();
		out.print("hi this demo is by <br>");
		ServletContext ctx=getServletContext();
		String s=ctx.getInitParameter("name");
		req.setAttribute("s",s);
		RequestDispatcher rq=req.getRequestDispatcher("output.jsp");
		rq.forward(req,res);
		//one way of sending
		//res.sendRedirect("output.jsp?s="+s);
	}
}
