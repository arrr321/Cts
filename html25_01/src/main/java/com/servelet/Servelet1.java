package com.servelet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servelet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<League> listLeague =  null;
	
	@Override 
	public void init() throws ServletException{
		 
		 listLeague = new ArrayList<>();
		 super.init();
		 
	 }
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	processRequest(request, response);
	
	}
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			listLeague.add(new League(UUID.randomUUID().toString(), "cricket", "2020", "summer"));
			listLeague.add(new League(UUID.randomUUID().toString(), "crick", "2020", "summer"));
			listLeague.add(new League(UUID.randomUUID().toString(), "cricet", "2020", "summer"));
			listLeague.add(new League(UUID.randomUUID().toString(), "ccket", "2020", "summer"));
		
		out.println("<html><head><title>League List</title></head><body>");
		out.println("<table border = '1'><tr><td>leagueId</td><td>leagueName</td><td>leagueYear</td><td>LeagueSeason</td></tr>");
		listLeague.forEach(league->{
			out.println("<tr><td>"+league.getLeagueId()+"</td><td>"+league.getLeagueName()
			+"</td><td>"+league.getLeagueSeason()+"</td><td>"+league.getLeagueYear()+"</td></tr>");
		});
				
		
		out.println("</table>"
				+ "</body></html>");
		
		
		
		
		
		
		
		
		
		
	}

}
