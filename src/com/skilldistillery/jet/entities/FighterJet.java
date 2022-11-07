package com.skilldistillery.jet.entities;

public class FighterJet extends Jet implements CombatReady {


	public FighterJet() {
	}

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	
	@Override
	public void fight() {
		System.out.println("**********");
		System.out.println("Fighter jet " + this.getModel() + " is now engaging in a dogfight.");
		System.out.println("**********");
	}
	
	@Override
	public void fly() {
		System.out.println("Jet Details: " + this.getModel() + " -- " + this.getSpeed() + " mph speed, " + this. getRange() + " miles range.");
		System.out.println("Max flight time of " + this.getModel() + " is " + this.getRange() / this.getSpeed() + " hours.");
	}

	@Override
	public double getSpeedInMach() {
		return 0;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

}
