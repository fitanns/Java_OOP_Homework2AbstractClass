package com.gmail.fitanns;

public class Triangle extends Shape {

	private Point sideOne;
	private Point sideTwo;
	private Point sideThree;

	public Triangle(Point sideOne, Point sideTwo, Point sideThree) {
		super();
		this.sideOne = sideOne;
		this.sideTwo = sideTwo;
		this.sideThree = sideThree;
	}

	public Triangle() {
		super();
	}

	public Point getSideOne() {
		return sideOne;
	}

	public void setSideOne(Point sideOne) {
		this.sideOne = sideOne;
	}

	public Point getSideTwo() {
		return sideTwo;
	}

	public void setSideTwo(Point sideTwo) {
		this.sideTwo = sideTwo;
	}

	public Point getSideThree() {
		return sideThree;
	}

	public void setSideThree(Point sideThree) {
		this.sideThree = sideThree;
	}

	@Override
	double getPerimetr() {
		double p = sideOne.getX() + sideTwo.getY() + sideThree.getX();
		return p;
	}

	@Override
	double getArea() {
		double polP = 0.5 * (sideOne.getX() + sideTwo.getY() + sideThree.getX());
		double s = Math.sqrt(polP * (polP - sideOne.getX()) * (polP - sideTwo.getY()) * (polP - sideThree.getX()));
		return s;
	}

	@Override
	public String toString() {
		return "Triangle [sideOne=" + sideOne + ", sideTwo=" + sideTwo + ", sideThree=" + sideThree + ", getPerimetr()="
				+ getPerimetr() + ", getArea()=" + getArea() + "]";
	}

}
