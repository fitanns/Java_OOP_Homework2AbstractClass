package com.gmail.fitanns;

public class Circle extends Shape {

	private Point l;

	public Circle(Point l) {
		super();
		this.l = l;
	}

	public Circle() {
		super();
	}

	public Point getL() {
		return l;
	}

	public void setL(Point l) {
		this.l = l;
	}

	@Override
	double getPerimetr() {
		double r = (l.getY() / (2 * Math.PI));
		double p = 2 * Math.PI * r;
		return p;
	}

	@Override
	double getArea() {
		double r = (l.getY() / (2 * Math.PI));
		double s = Math.PI * r * r;
		return s;
	}

	@Override
	public String toString() {
		return "Circle [l=" + l + ", getPerimetr()=" + getPerimetr() + ", getArea()=" + getArea() + "]";
	}

}
