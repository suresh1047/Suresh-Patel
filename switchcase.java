package com.atos.coei4.sqlconnect;

import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day;
		System.out.println("please enter any number)between one to seven ") ;
		Scanner obj = new Scanner(System.in);
		do {
			day = obj.nextInt();
		switch (day)
		{
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("you enter invalid value.");
			break;
		}
		}
		while (day>7 || day<1);
	
	}
		

}
