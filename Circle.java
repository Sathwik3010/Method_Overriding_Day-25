package com.codegnan.Overriding;

class Circle extends Shape{
	double radius;

	 Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {		
		return Math.PI * radius * radius;
	}
}
