package com.logicalprogram;

import java.util.Scanner;
/**
 * 
 * @author Dipali
 *
 */
public class TemperaturConversion {

	public static void main(String[] args) {
		double f, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose type of conversion \n 1.Fahrenheit to celsius");
		System.out.println("Choose type of conversion \n 2.Celsius to Fahrenheit");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			System.out.println("Enter Fahrenheit temp");
			f = sc.nextDouble();
			c = (f - 32) * 5 / 9;
			System.out.println("Celsius temp is = " + c);
			break;
		case 2:
			System.out.println("Enter celsius temp");
			c = sc.nextDouble();
			f = (c * 9 / 5) + 32;
			System.out.println("Fahrenheit temp is = " + f);
			break;
		default:
			System.out.println("Please choose valid choice");
		}

	}
}
