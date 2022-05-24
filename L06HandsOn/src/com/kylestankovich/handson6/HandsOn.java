package com.kylestankovich.handson6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class HandsOn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String songs[] = {"Rock With You", "Smooth Criminal", 
				"Wanna Be Startin' Something", "Thriller", "Beat It"};
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i< songs.length; i++) {
			sb.append(songs[i]);
			if (i< songs.length-1) {
				sb.append(", \n");
			}
			
			
			
		}
		
		System.out.println(sb);
		
		//write to a file
		try {
			FileWriter writer = new FileWriter("songs.txt");
			writer.write(sb.toString());
			writer.close();
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		//print file to console
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("songs.txt"));
			String line;
			while((line = reader.readLine()) !=null) {
				System.out.println(line);
			}
			reader.close();
			
			 
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		

	}

}
