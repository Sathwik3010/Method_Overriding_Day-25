package com.codegnan.Overriding;

class Vehicle {
	public double getSpeed() {
		return 0.0;
	}
}

class Motorcycle extends Vehicle{
	double speed;

	public Motorcycle(double speed) {
		this.speed = speed;
	}
	
	@Override
	public double getSpeed() {
		return speed;
	}
}