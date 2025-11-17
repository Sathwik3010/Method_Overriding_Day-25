package com.codegnan.Overriding;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Figure f = new Figure(10,10);
//		System.out.println(f.area());
		
		Rectangle r = new Rectangle(10,5);
		System.out.println(r.area());
//		
		Triangle t = new Triangle(10,3);
		System.out.println(t.area());
//		
		Figure figref;
		figref = r;
		System.out.println(figref.area());
//		figref = t;
//		System.out.println(figref.area());

	}

}
