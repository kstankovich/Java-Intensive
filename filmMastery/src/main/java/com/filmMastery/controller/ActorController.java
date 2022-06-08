package com.filmMastery.controller;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.filmMastery.model.Actor;

@Controller
@RequestMapping({"/","actors"})

public class ActorController {
	
	@Value("${spring.datasource.url}")
	private String url;
	
	@Value("${spring.datasource.username}")
	private String username;
	
	@Value("${spring.datasource.password}")
	private String password;
	
	
	
	
	
	@GetMapping()
	public String getAllActors(Model model) {
		List<Actor> actors = new ArrayList<Actor>();
		
		Connection con;
		try {
			con = DriverManager.getConnection(url, username, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT CONCAT(first_name, ' ', last_name) AS Actor, title AS Film\r\n"
					+"FROM actor\r\n"
					+"JOIN film_actor USING (actor_id)\r\n"
					+"JOIN film USING (film_id)");
			
			
			while(rs.next()) {
				Actor newActor = new Actor();
				
				newActor.setActor(rs.getString("actor"));
				newActor.setFilm(rs.getString("film"));
				
				
				actors.add(newActor);
				
			}
			
			
		}
		catch(SQLException e) {
			e.printStackTrace();
			
			
			
		}
		//code to query databases 
		
		
		//code to add actors to list 
		model.addAttribute("actors", actors);
		
		
		return "actors";
				}
	

}
