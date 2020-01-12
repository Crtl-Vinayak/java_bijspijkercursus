package com.javaBijspijkeren.vinayak.h4.opdracht2;

import java.util.Locale;
import java.util.Scanner;

/**
 * @version v1.0
 * @author vinayak
 * @since 10-01-2020
 */
public class Opdracht4_2 {

	private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
	private static char input;
	private static boolean isLetter;
	
	public static void main(String[] args) {
		System.out.println("Van welk karakter wil je weten of het een getal of letter is?");
		
		input = sc.nextLine().charAt(0);
		isLetter = Character.isLetter(input);
		
		if (isLetter == true) {
			System.out.println("De " + input + " is een " + "letter");
		} else {
			System.out.println("De " + input + " is een " + "getal");
		}
	}
}
