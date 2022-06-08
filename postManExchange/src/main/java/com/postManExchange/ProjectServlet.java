package com.postManExchange;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/projectServlet")
public class ProjectServlet extends HttpServlet {

	private static final long serialVersionUID = 6788651782056866257L;
	
	//resource management 
	//throw a servletExeption
	public void init() throws ServletException {
		super.init();
			
	}
	
	//resource destruction management 
	public void destroy() {
		super.destroy();
		
	}
	
	// Create
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws 
    ServletException, IOException 
    {
        System.out.println("POST was called.");
        
		String testHeaderId = request.getHeader("Payload-Data");
		String testHeaderResponse;
		
		if(testHeaderId != null && !testHeaderId.isEmpty()) {
			testHeaderResponse = testHeaderId;
		}else {
			testHeaderResponse = "nothing to see here.";
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}
		
		String responseText = "Data can be created using this method(POST)." + testHeaderResponse;
		
		response.getWriter().append(responseText);
    }
    
	
	//servlet read
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
	ServletException, IOException
	{
		System.out.println("GET was called");
		
		String testHeaderId = request.getHeader("Payload-Data");
		String testHeaderResponse;
		
		if(testHeaderId != null && !testHeaderId.isEmpty()) {
			testHeaderResponse = testHeaderId;
		}else {
			testHeaderResponse = "nothing to see here.";
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}
		
		String responseText = "GET is used to read information." + testHeaderResponse;
		
		response.getWriter().append(responseText);
		
	}
	
	// Update
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws 
    ServletException, IOException 
    {
        System.out.println("PUT was called.");
        
		String testHeaderId = request.getHeader("Payload-Data");
		String testHeaderResponse;
		
		if(testHeaderId != null && !testHeaderId.isEmpty()) {
			testHeaderResponse = testHeaderId;
		}else {
			testHeaderResponse = "nothing to see here.";
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}
		
		String responseText = "Use this (PUT) to update information." + testHeaderResponse;
		
		response.getWriter().append(responseText);
    }
	
    // Delete
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws 
    ServletException, IOException 
    {
        System.out.println("DELETE was called.");
        
		String testHeaderId = request.getHeader("Payload-Data");
		String testHeaderResponse;
		
		if(testHeaderId != null && !testHeaderId.isEmpty()) {
			testHeaderResponse = testHeaderId;
		}else {
			testHeaderResponse = "nothing to see here.";
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}
		
		String responseText = "Only use DELETE to remove the specified target." + testHeaderResponse;
		
		response.getWriter().append(responseText);
    }

}
