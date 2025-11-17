package com.codegnan.Overriding;

import java.util.Scanner;

public class Cube extends Shape{
	
	@Override
	public void calculateVolume() {
		super.calculateVolume();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Side of the cube: ");
		double side = sc.nextDouble();
		
		int volume = (int) Math.pow(side, 3);
		
		System.out.printf("Volume of Cube: %d\n", volume);
	}
}
