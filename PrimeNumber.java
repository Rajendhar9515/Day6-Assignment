package com.bridgelabz.java.LogicalPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = in.nextInt();
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				System.out.println(num + "is not prime number");
				break;
			} else {
				System.out.println(num + "is prime number");
				break;
			}
		}

	}

}
