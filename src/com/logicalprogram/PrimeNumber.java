package com.logicalprogram;

import java.util.Scanner;
/**
 * 
 * @author Dipali
 *
 */
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		int prime = 0;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				prime++;
			}
		}

		if (prime == 0)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");

	}

}