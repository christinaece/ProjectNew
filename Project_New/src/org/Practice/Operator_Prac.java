package org.Practice;

import java.util.Scanner;

public class Operator_Prac {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Leap year");
		int year = sc.nextInt();
		
		if(year%4==0) {
			System.out.println("Leap year");
		}
		else {
			System.out.println("not a leap year");
		}
	
			
		if(year % 100==0 && year % 400==0)	
		{
			System.out.println("Leap year and century year");
		}
		else
		{
			System.out.println("not a leap year and century year");
		}
		
	}
		
	}
	

