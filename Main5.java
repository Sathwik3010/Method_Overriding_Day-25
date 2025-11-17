package com.codegnan.Overriding;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		
		Shape s = new Circle(radius);
		double area = s.getArea();
		System.out.printf("Area of Circle: %.2f", area);
		sc.close();
	}

}
