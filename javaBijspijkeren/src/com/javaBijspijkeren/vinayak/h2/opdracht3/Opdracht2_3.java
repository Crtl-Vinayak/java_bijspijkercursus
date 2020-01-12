package com.javaBijspijkeren.vinayak.h2.opdracht3;

import java.util.Locale;
import java.util.Scanner;

/**
 * @version v1.0
 * @author vinayak
 * @since 10-01-2020
 */
public class Opdracht2_3 {

	private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
	private static double startBedrag;
	private static double rentePercentage;
	private static double totaalBedrag;
	
	public static void main(String[] args) {
		System.out.println("Typ het startbedrag:");
		startBedrag = sc.nextDouble();
		System.out.println("Typ het rentepercentage: ");
		rentePercentage = sc.nextDouble() / 10;
		totaalBedrag = startBedrag + rentePercentage;
		System.out.println("De rente is " + rentePercentage + " en het "
				+ "totaalbedrag is " + totaalBedrag);
	}
}