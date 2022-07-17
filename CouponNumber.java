package com.bridgelabz.java.LogicalPrograms;

public class CouponNumber {
	public static void main(String[] args) {
		char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
		int max = 100000000;
		int random = (int) (Math.random() * max);
		StringBuffer sb = new StringBuffer();
		System.out.println("randomValue " + random);

		while (random > 0) {
			System.out.println("character length " + random % chars.length);
			sb.append(chars[random % chars.length]);
			random /= chars.length;
			System.out.println("randomValue " + random);
		}

		String couponCode = sb.toString();
		System.out.println("Coupon Code: " + couponCode);
	}

}
