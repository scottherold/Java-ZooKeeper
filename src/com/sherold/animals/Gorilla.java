package com.sherold.animals;

public class Gorilla extends Mammal {
	// <----- Methods ----->
	public void throwSomething() {
		System.out.println("The Gorilla has thrown something...");
		energyLevel -= 5;
	}
	
	public void eatBananas() {
		System.out.println("The Gorilla has eaten a banana and looks happy...");
		energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("The Gorilla climbs a tree...");
		energyLevel -= 10;
	}
}
