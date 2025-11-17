package com.codegnan.Overriding;

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int lifespan = sc.nextInt();
		
		Animal animal = new Elephant(lifespan);
		
		System.out.println(animal.getLifeSpan());
		sc.close();
	}

}
