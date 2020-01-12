package com.javaBijspijkeren.vinayak.h4.opdracht1;

import java.util.Locale;
import java.util.Scanner;

/**
 * @version v1.0
 * @author vinayak
 * @since 10-01-2020
 */
public class Opdracht4_1 {

	private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
	private static char input;
	private static int asciiValue;
	
	public static void main(String[] args) {
		System.out.println("Van welk karakter wil je de ASCII waarde weten?");
		
		input = sc.nextLine().charAt(0);
		asciiValue = input;
		
		System.out.println("De ASCII waarde van het karakter " + input + " is " + asciiValue);
	}
}
