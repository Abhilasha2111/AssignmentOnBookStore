package com.bookutil;
import com.book.*;

import java.util.*;
public class BookUtil 
{
      public static void main(String[] args) throws InvalidBookException 
		{
			
    	  int operation;
  		  char   more ='y';
  		  
  		Scanner scan = new Scanner(System.in);
  		
  		System.out.println("\t###   WelCome To My Book Store  ###");
  		System.out.print("\n\t\tDefault Adding a Book \n\n");
  		BookStore obj1 = new BookStore();
  		
  	    while(more == 'y'||more == 'Y')
  		{
  			System.out.println("1. Add New Book ");
  			System.out.println("2. Search By Title");
  			System.out.println("3. Search By Author");
  			System.out.println("4. Display All Book");
  			
  			System.out.print("Choose the Operation : ");
  			operation = scan.nextInt();
  			
  			
  			switch(operation) 
  			{
  			
  			case 1 :
  				new BookStore();
  				 obj1.add();
  			
  				break;
  				
  			case 2 : 
  				obj1.searchbytitle();
  				
  				break;
  				
  			case 3 : 
  				
  				obj1.searchbyauthor();
  				
  				break;
  				
  			case 4 : 
  				obj1.displayall();
  				
  				break;
  				
  			default : 
  				System.out.print("Invalid Operation...");
  				break;			
  			}
  			System.out.print("\n\n If you want to go to Menu please enter yes : ");
  			more = scan.next().charAt(0);
  		}while(more=='y'||more=='Y');
  			System.out.print("Exit.......");
  			scan.close();
  		}
  		
  	}
