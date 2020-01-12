package com.javaBijspijkeren.vinayak.h6.opdracht2;

import java.util.Locale;
import java.util.Scanner;

/**
 * @version v1.0
 * @author vinayak
 * @since 11-01-2020
 */
public class Opdracht6_2 {

	private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
	private static String input;
	
	public static void main(String[] args) {
		System.out.println("Welk zinnete moet ik printen?");
		input = sc.nextLine();
		Opdracht6_2.printZinnetje(input);
	}
	
	private static void printZinnetje(String mooieZin) {
		System.out.println(mooieZin);
	}
}
