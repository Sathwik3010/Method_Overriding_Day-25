package com.codegnan.Overriding;

import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double speed = sc.nextDouble();
		
		Vehicle v = new Motorcycle(speed);
		System.out.println(v.getSpeed());
		sc.close();
	}

}
