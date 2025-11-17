package com.codegnan.Overriding;

import java.util.Scanner;

public class Cuboid extends Shape{
	@Override
	public void calculateVolume() {
		super.calculateVolume();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Length of the cuboid");
		double length = sc.nextDouble();
		
		System.out.println("Width of the cuboid");
		double width = sc.nextDouble();
		
		System.out.println("Height of the cuboid");
		double height = sc.nextDouble();
		
		double volume = length * width * height;
		
		System.out.printf("Volume of Cuboid: %.2f%n", volume);
	}
}
