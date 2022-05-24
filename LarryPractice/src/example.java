

import java.util.*;
 


//Creates a public class called example and begins the main method
public class example {
    public static void main(String[] args) {
    	
//establishes that we will have an array of 5 different numbers
        int arr[] = new int[5];
         
          
          arr[0] = 140;
          arr[1] = 20;
          arr[2] = 260;
          arr[3] = 281;
          arr[4] = 53;
           
//this sections will print out the array using for loop 
          System.out.println("Using for-loop:");
//for this range of numbers print the assigned variables
          for(int i=0; i < arr.length; i++) {
             System.out.println(arr[i]);
          }
           
//this section prints out the array using for each loop         
          System.out.println("Using for-each loop:");
//this just says for the object print the array
          for(int obj: arr){
              System.out.println(obj);
              
          }
//------------------------------------------------------------------------------        
          int sum = 0;
          for(int i = 1; i <= 10; i++) {
        	  sum = sum + i;
        	  }
          System.out.println("Sum of first 10 numbers is : " + sum);   
          
//--------------------------------------------------------------------------------          
          for(int i = 1; i <= 10; i++) {
        	  System.out.println(i);
        	  }
           
    } 
     
}