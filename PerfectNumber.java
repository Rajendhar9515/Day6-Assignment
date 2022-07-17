package com.bridgelabz.java.LogicalPrograms;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		int n, sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int n1 = input.nextInt();
		int i = 1;

		while (i <= n1 / 2) {

			if (n1 % i == 0) {
				sum = sum + i;
			}
			i++;
		}
		if (sum == n1) {
			System.out.println(n1 + "is a perfect number");
		} else {
			System.out.println(n1 + "is a not perfect number");
		}

	}

}
