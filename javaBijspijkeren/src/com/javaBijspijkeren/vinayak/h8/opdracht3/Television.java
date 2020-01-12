package com.javaBijspijkeren.vinayak.h8.opdracht3;

/**
 * @version v1.0
 * @author vinayak
 * @since 12-01-2020
 */
public class Television {

	private int channel = 1;
	private int volumeLevel = 1;
	@SuppressWarnings("unused")
	private boolean on = false;
	
	public void turnOn() {
		on = true;
		System.out.println("Television is on");
	}
	
	public void turnOff() {
		on = false;
		System.out.println("Television is off");
	}
	
	public void setChannel(int newChannel) {
		channel = newChannel;
		channelInReach();
		System.out.println("Television is on channel " + channel);
	}
	
	public void setVolume(int newVolumeLevel) {
		volumeLevel = newVolumeLevel;
		volumeInReach();
		System.out.println("Television volume level is on " + volumeLevel);
	}
	
	public void channelUp() {
		channel++;
		channelInReach();
		System.out.println("Television is on channel " + channel);
	}
	
	public void channelDown() {
		channel--;
		channelInReach();
		System.out.println("Television is on channel " + channel);
	}
	
	public void volumeUp() {
		volumeLevel++;
		volumeInReach();
		System.out.println("Television volume level is on " + volumeLevel);
	}
	
	public void volumeDown() {
		volumeLevel--;
		volumeInReach();
		System.out.println("Television volume level is on " + volumeLevel);
	}
	
	/**
	 * this method checks if the channel is between 1 and 10.
	 * if channel goes lower than 1, the channel is going to set to 1.
	 * if channel goes higher than 10, the channel is going to set to 10.
	 */
	private void channelInReach() {
		if (channel < 1) {
			channel = 1;
		} 
		if (channel > 10) {
			channel = 10;
		}
	}
	
	/**
	 * this method checks if the volume level is between 0 and 20.
	 * if volume level goes lower than 0, the volume level is going to set to 0.
	 * if volume level goes higher than 20, the volume level is going to set to 20.
	 */
	private void volumeInReach() {
		if (volumeLevel < 0) {
			volumeLevel = 0;
		} 
		if (volumeLevel > 20) {
			volumeLevel = 20;
		}
	}
}
