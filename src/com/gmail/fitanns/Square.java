package com.gmail.fitanns;

public class Square extends Shape {

	private Point a;

	public Square(Point a) {
		super();
		this.a = a;
	}

	public Square() {
		super();
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	@Override
	double getPerimetr() {
		double p = 4 * a.getX();
		return p;

	}

	@Override
	double getArea() {
		double s = a.getX() * a.getX();
		return s;
	}

	@Override
	public String toString() {
		return "Square [a=" + a + ", getPerimetr()=" + getPerimetr() + ", getArea()=" + getArea() + "]";
	}

}
