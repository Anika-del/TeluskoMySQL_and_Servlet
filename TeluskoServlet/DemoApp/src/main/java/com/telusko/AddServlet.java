package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{

	//public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
				 
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		//System.out.println("result is "+ k); //for console printing output
		//we use for browser print res object of HTTP getWriter Object of PrintWriter
		PrintWriter out = res.getWriter(); //throws IOException
		out.println("result is " + k);
	}
}