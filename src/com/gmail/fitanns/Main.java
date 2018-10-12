package com.gmail.fitanns;

public class Main {

	public static void main(String[] args) {

		Point pt = new Point(4, 6);

		Circle ce = new Circle(pt);
		Triangle te = new Triangle(pt, pt, pt);
		Square se = new Square(pt);

		System.out.println(ce + " - Parameters,Perimetr and Area of Circle");
		System.out.println(te + " - Parameters,Perimetr and Area of Triangle");
		System.out.println(se + " - Parameters,Perimetr and Area of Square");

	}
}
