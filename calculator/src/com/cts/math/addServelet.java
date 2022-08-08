package com.cts.math;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("emo.view")
@SuppressWarnings("serial")
// @WebServlet("/add")
public class addServelet extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("t1"));
		int j = Integer.parseInt(req.getParameter("t2"));
		String m = req.getParameter("opt");
		int k=0;
		
		PrintWriter out = res.getWriter();
		//out.print(m.getClass().getSimpleName());
		// if(j!=0) {
		if (m.compareTo("add")==0)
		k = i + j;
		else if (m.compareTo("sub")==0)
			k = i - j;
		else if (m.compareTo("mul")==0)
			k = i * j;
		else if (m.equalsIgnoreCase("div"))
			k = i / j;
		 else if (m.equalsIgnoreCase("compunding"))
		 {			 
//		 RequestDispatcher rd = req.getRequestDispatcher("sq");
//		 rd.forward(req, res);
		 }
		
		 //using redirect we have to give the the parameter in url
	//	res.sendRedirect("square?k="+k);
		//out.print(k);
		
		//sending data using session concept
		
//		HttpSession s=req.getSession();
//		s.setAttribute("k",k);
//		res.sendRedirect("square");
//		
		
		//sending data using cookies
		
		Cookie c=new Cookie("k",k+"");
		res.addCookie(c);
		//res.sendRedirect("square");
		res.sendRedirect("Context");
		
		
		 
		// req.setAttribute("k", k);

	}
}
