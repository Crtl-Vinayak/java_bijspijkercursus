package com.javaBijspijkeren.vinayak.h2.opdracht2;

import java.util.Locale;
import java.util.Scanner;

/**
 * @version v1.0
 * @author vinayak
 * @since 10-01-2020
 */
public class Opdracht2_2 {

	private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
	private static double jaren;
	private static double maanden;
	private static int minuten;
	
	public static void main(String[] args) {
		System.out.println("Hoeveel jaar oud ben je?");
		jaren = sc.nextDouble();
		System.out.println("Hoeveel maanden komen daar nog bij?");
		maanden = sc.nextDouble();
		minuten = (int) ((jaren * 365 * 24 * 60) + (maanden / 12 * 365 * 24 * 60));
		System.out.println("Dan ben je nu ongeveer " + minuten + " minuten oud.");
	}
}