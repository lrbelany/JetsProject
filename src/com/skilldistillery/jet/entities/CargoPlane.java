package com.skilldistillery.jet.entities;

public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane() {
	}

	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
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

	@Override
	public void loadCargo() {
		System.out.println("**********");
		System.out.println("Cargo jet: " + this.getModel() + " -- " + this.getSpeed() + " mph speed, " + this. getRange() + " miles range.");
		System.out.println("**********");
	}

}
