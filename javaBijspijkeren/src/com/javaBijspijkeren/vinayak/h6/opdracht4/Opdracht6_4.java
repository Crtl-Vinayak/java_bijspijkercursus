package com.javaBijspijkeren.vinayak.h6.opdracht4;

import java.util.Locale;
import java.util.Scanner;

/**
 * @version v1.0
 * @author vinayak
 * @since 11-01-2020
 */
public class Opdracht6_4 {

	private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
	private static int num1, num2;
	
	public static void main(String[] args) {
		System.out.println("We gaan twee getallen vermenigvuldigen.");
		System.out.println("Wat is het eerste getal?");
		num1 = sc.nextInt();
		System.out.println("Wat is het tweede getal?");
		num2 = sc.nextInt();
		System.out.println("Het product van " + num1 + " en " + num2 + " is " + berekenProduct(num1, num2));
	}

	private static int berekenProduct(int getal1, int getal2) {
		return getal1 * getal2;
	}
}
