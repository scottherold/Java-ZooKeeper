package com.sherold.animals;

public class Bat extends Mammal{
	// <----- Constructors ----->
	
	public Bat() {
		energyLevel = 300;
	}
	
	public void fly() {
		System.out.println("The bat flaps its wings...");
		energyLevel -= 50;
	}
	
	public void eatHumans() {
		energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("The bat attacks a town, and the town is... on... FIRE!!!");
		energyLevel -= 100;
	}
}
