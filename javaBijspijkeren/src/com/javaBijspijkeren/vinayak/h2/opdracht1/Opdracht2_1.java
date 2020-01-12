package com.javaBijspijkeren.vinayak.h2.opdracht1;

import java.util.Locale;
import java.util.Scanner;

/**
 * @version v1.0
 * @author vinayak
 * @since 10-01-2020
 */
public class Opdracht2_1 {

	private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
	private static double mijl;
	private static double km;
	
	public static void main(String[] args) {
		System.out.println("vul een nummer voor mijl erin.");
		mijl = sc.nextDouble();
		km = mijl * 1.6;
		System.out.println(mijl + " mijlen is " + km + " kilometer.");
	}
}