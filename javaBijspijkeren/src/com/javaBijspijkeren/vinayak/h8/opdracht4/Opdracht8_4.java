package com.javaBijspijkeren.vinayak.h8.opdracht4;

import java.util.Locale;
import java.util.Scanner;

/**
 * @version v1.0
 * @author vinayak
 * @since 12-01-2020
 */
public class Opdracht8_4 {
	
	private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
	private static int input;
	
	public static void main(String[] args) {
		Television myFirstTelevision = new Television();
		
		boolean exit = false;
		while(exit == false) {
			input = sc.nextInt();
			
			switch(input) {
				case 1: {
					myFirstTelevision.turnOn();
					break;
				}
				case 2: {
					myFirstTelevision.turnOff();
					break;
				}
				case 3: {
					myFirstTelevision.channelUp();
					break;
				}
				case 4: {
					myFirstTelevision.channelDown();
					break;
				}
				case 5: {
					myFirstTelevision.volumeUp();
					break;
				}
				case 6: {
					myFirstTelevision.volumeDown();
					break;
				}
				case 7: {
					exit = true;
					System.out.println("exit");
					break;
				}
			}
		}
	}
}
