package com.logicalprogram;

import java.util.Scanner;
/**
 * 
 * @author Dipali
 *
 */
public class FibonacciSeries {
	void calFib() {
		int first = 0, second = 1, third = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.print(third + " ");
			first = second;
			second = third;
			third = first + second;
		}
	}

	public static void main(String[] args) {
		FibonacciSeries fb = new FibonacciSeries();
		fb.calFib();
	}

}