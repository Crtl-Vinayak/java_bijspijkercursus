package com.javaBijspijkeren.vinayak.h4.opdracht5;

/**
 * @version v1.0
 * @author vinayak
 * @since 10-01-2020
 */
public class Opdracht4_5 {

	private static int randomNum;
	
	public static void main(String[] args) {
		randomNum = (int) (Math.random() * 26 + 97);
		System.out.println("Uw willekeurige letter is de '" + (char) randomNum + "'." /*+ "\t\t " + randomNum*/);
	}
}
