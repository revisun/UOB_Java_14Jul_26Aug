package com.cts.oopd.model;

public class Rectangle {
	
	private int length;
	private int breadth;
	
	public Rectangle() {
		this(5);
	}
	
	public Rectangle(int side) {
		this(side,side);
	}
	
	public Rectangle(int length,int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	
	public Rectangle(Rectangle a) {
		this(a.length,a.breadth);
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public int getArea() {
		return length*breadth;
	}

	public int perimeter() {
		return 2*(length+breadth);
	}
	
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + ", Area=" + getArea() + 
				", Perimeter="
				+ perimeter() + "]";
	}
	
	
}
