package com.atos.coei4.sqlconnect;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a,b,flag=0;
		System.out.println("enter number: "); 
		Scanner obj = new Scanner(System.in);
		a = obj.nextInt();
		for(int i = 2; i <= a/2; i++){
			//System.out.println("inside loop");
			if(a%i == 0) 
			{
				flag++;
				//System.out.println("inside loop and if");
				break;
		
			}
		
		}
			if (flag == 0) 
			{
				System.out.println("you number is prime");
			}else 
			{
					System.out.println("you number is not prime");
			}
			
	}

}
