package com.atos.coei4.sqlconnect;

import java.util.Scanner;

public class adding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int num1,num2,num3,total;
	System.out.println("enter frist number:");
	Scanner obj = new Scanner(System.in);
	num1 = obj.nextInt();
	System.out.println("enter second number:");
	num2 = obj.nextInt();
	System.out.println("enter third number:");
	num3 = obj.nextInt();
	/*if (num1>100)
	{
		System.out.println("please enter frist value less then 100");
		num1 = obj.nextInt();
	}
	else if (num2>100)
	{
		System.out.println("please enter second value less then 100");
		num2 = obj.nextInt();
	}
	else if (num3>100)
	{
		System.out.println("please enter third value less then 100");
		num3 = obj.nextInt();
	}*/
	while (num1>100)
	{
		System.out.println("please enter frist value less then 100");
		num1 = obj.nextInt();
	}
	while (num2>100)
	{
		System.out.println("please enter second value less then 100");
		num2 = obj.nextInt();
	}
	while (num3>100)
	{
		System.out.println("please enter third value less then 100");
		num3 = obj.nextInt();
	}
	total = num1 + num2 + num3;
	System.out.println("totel number is:" +total); 
	}

}

