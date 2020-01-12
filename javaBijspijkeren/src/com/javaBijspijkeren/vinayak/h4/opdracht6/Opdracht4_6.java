package com.javaBijspijkeren.vinayak.h4.opdracht6;

import java.util.Locale;
import java.util.Scanner;

/**
 * @version v1.0
 * @author vinayak
 * @since 10-01-2020
 */
public class Opdracht4_6 {

	private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
	private static String input;
	
	public static void main(String[] args) {
		System.out.println("Typ een String:");
		input = sc.nextLine();
		
		System.out.println("De lengte van de String is " + input.length());
		System.out.println("Het eerste karakter is " + input.charAt(0));
		System.out.println("Het laatste karakter is " + input.charAt(input.length() - 1));
	}
}
