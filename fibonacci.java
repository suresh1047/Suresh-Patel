package com.atos.coei4.sqlconnect;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3,i,count;
		double f1=1.5986,f2=1.765,f3;
		System.out.print("enter grater range: ");
		Scanner obj = new Scanner(System.in);
		count = obj.nextInt();
		num1 = 0; num2 = 1;
		System.out.print(num1 + " " + num2);
		for(i=2; i<count; i++)
		{
			num3 = num1 + num2;
			System.out.print(" " + num3);
			num1 = num2;
			num2 = num3;
		}
		
	num3 = add(num1,num2);
	System.out.println("added value is " +num3);
	f3 = add(f1,f2);
	System.out.println("add value is "+f3);
				
	}
	 
	public static int add(int num1, int num2) {
			int total;
			total = num1 + num2;
			return total;
	}
	public static double add(double num1, double num2) {
		double total;
		total = num1 + num2;
		return total;
	}
	

}
