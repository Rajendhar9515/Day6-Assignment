package com.bridgelabz.java.LogicalPrograms;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		int reversed = 0;
		Scanner reverse = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = reverse.nextInt();

		for (; num != 0; num /= 10) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
		}
		System.out.print("Reversed number is:" + reversed);
	}
}
