package com.javaBijspijkeren.vinayak.h2.opdracht4;

import java.util.Locale;
import java.util.Scanner;

/**
 * @version v1.0
 * @author vinayak
 * @since 10-01-2020
 */
public class Opdracht2_4 {

	private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
	private static double userInput;
	
	public static void main(String[] args) {
		userInput = sc.nextDouble();
		for(int i = 2; i > -3; i--) {
			System.out.println(userInput - i);
		}
	}
}