package com.javaBijspijkeren.vinayak.h5.opdracht4;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 * @version v1.0
 * @author vinayak
 * @since 10-01-2020
 */
public class Opdracht5_4 {

	private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
	private static int[] input = new int[5];
	
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			input[i] = sc.nextInt();
		}
		Arrays.sort(input);
		System.out.println(input[0]);
	}
}
