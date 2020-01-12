package com.javaBijspijkeren.vinayak.h6.opdracht3;

/**
 * @version v1.0
 * @author vinayak
 * @since 11-01-2020
 */
public class Opdracht6_3 {

	private static int random1, random2;
	
	public static void main(String[] args) {
		random1 = (int) (Math.random() * 10 + 1);
		random2 = (int) (Math.random() * 10 + 1);
		System.out.println("Het product van " + random1 + " en " + random2 + " is " + berekenProduct(random1, random2));
	}

	private static int berekenProduct(int getal1, int getal2) {
		return getal1 * getal2;
	}
}
