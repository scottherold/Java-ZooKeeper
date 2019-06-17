package com.sherold.animals;

public class Mammal {
	// <----- Attributes ----->
	protected int energyLevel;
	
	public Mammal() {
		energyLevel = 100;
	}

	// <----- Getters/Setters ----->
	// Getter
	public int getEnergyLevel() {
		return energyLevel;
	}

	// <----- Methods ----->
	public int displayEnergy() {
		System.out.println(energyLevel);
		return energyLevel;
	}
}
