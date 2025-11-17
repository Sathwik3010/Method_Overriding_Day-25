package com.codegnan.Overriding;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s;
		
		s = new Cube();
		s.calculateVolume();
		
		s = new Cuboid();
		s.calculateVolume();
		
	}

}
