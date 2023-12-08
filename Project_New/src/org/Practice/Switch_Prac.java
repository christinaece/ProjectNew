package org.Practice;

import java.util.Scanner;

public class Switch_Prac {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Marksheet Program");	
	  System.out.println("Student Name");
	  String Name = sc.next();
	  System.out.println("Student age");
	  int age = sc.nextInt();
	  System.out.println("Student contactnum");
	  long contactnum = sc.nextLong();
	  
	  System.out.println("Student Marks");
	  
	  System.out.println("Enter Tamil Marks");
	  int T1 = sc.nextInt();
	  System.out.println("Enter English Marks");
	  int E1 = sc.nextInt();
	  System.out.println("Enter Maths Marks");
	  int M1 = sc.nextInt();
	  System.out.println("Enter Science Marks");
	  int S1 = sc.nextInt();
	  System.out.println("Enter Social Marks");
	  int S2 = sc.nextInt();
	  
	  int total=T1+E1+M1+S1+S2;
	  int average=total/5;
	  
	  if(average>=80 && average<=100) {
		  System.out.println("Grade A");
		  }
	  else if(average>=60 && average<=79) {
		  System.out.println("Grade B");
	  }
		  else if(average>=40 && average<=59) {
			  System.out.println("Grade C");
		  }
		
		

		 
			
	  }}
		
		
		
	
		
		
	


