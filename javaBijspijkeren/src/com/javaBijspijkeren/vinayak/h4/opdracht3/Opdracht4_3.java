package com.javaBijspijkeren.vinayak.h4.opdracht3;

import java.util.Locale;
import java.util.Scanner;

/**
 * @version v1.0
 * @author vinayak
 * @since 10-01-2020
 */
public class Opdracht4_3 {

	private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
	private static char input;

	public static void main(String[] args) {
		System.out.println("Van welke letter wil je weten of het een klinker is?");
		input = sc.nextLine().charAt(0);

		if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u' || input == 'y') {
			System.out.println("De " + input + " is een " + "klinker");
		} else {
			System.out.println("De " + input + " is een " + "medeklinker");
		}
	}
}