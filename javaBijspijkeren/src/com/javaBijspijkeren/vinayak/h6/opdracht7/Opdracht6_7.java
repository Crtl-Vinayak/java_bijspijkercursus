package com.javaBijspijkeren.vinayak.h6.opdracht7;

import java.util.Locale;
import java.util.Scanner;

/**
 * @version v1.0
 * @author vinayak
 * @since 11-01-2020
 */
public class Opdracht6_7 {

	private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
	private static int input;

	private static boolean check = true;

	public static void main(String[] args) {
		System.out.println("Van welk getal wil je weten of het een priemgetal is?");
		input = sc.nextInt();
		if (isPriemgetal(input) == true) {
			System.out.println("Het getal " + input + " is inderdaad een priemgetal");
		} else {
			System.out.println("Het getal " + input + " is niet een priemgetal");
		}
	}

	private static boolean isPriemgetal(int getal) {
		
		if (input < 2) {
			check = false;
		}
		
		for (int i = 2; i < input; i++) {
//			System.out.println(input + " % " + i + " = " + (input % i));
			if (input % i == 0) {
				check = false;
			}
		}

		return check;
	}
}
