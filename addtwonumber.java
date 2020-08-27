package com.atos.coei4.sqlconnect;

import java.util.Scanner;

public class addnum {

	public static void main(String[] args) {
	int a,b,t;
	System.out.println("enter the value of a:");
	Scanner obj = new Scanner(System.in);
	a = obj.nextInt();
	System.out.println("enter the value of b:");
	//Scanner obj Scanner (System.in);
	b = obj.nextInt();
	if	(a>100) 
	{
		System.out.println("a value is not valid" +a);
	}
	else if (b>100)
	{
		System.out.println("b value is not valid" +b);
	}
	t = a + b;
	{
	System.out.println("totel value is: " +t);
	}
	}

}
