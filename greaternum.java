package com.atos.coei4.sqlconnect;

import java.util.Scanner;

public class greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		System.out.println("enter two numbers: ");
		Scanner obj = new Scanner(System.in);
		a = obj.nextInt();
		b = obj.nextInt();
		if(a>b) {
			System.out.println("a is great number ");
		}else
		{
			System.out.println("b is great number ");
		}
	}

}
