package com.webhook.test;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloWorldServlet extends HttpServlet {
	Logger logger = Logger.getLogger(HelloWorldServlet.class.getName());
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, this is a testing servlet. \n\n");
		
		logger.fine("requeasted");
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		logger.fine("Hello, this is a testing servlet. \n\n " + req.getParameterNames());
		
	}

}