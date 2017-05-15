package com.shape;

import java.util.Scanner;

public class Rectangle implements Polygon {
	Scanner sc=new Scanner(System.in);
	private float length;
	private float breadth;
	@Override
	public void calcArea() {
		System.out.println("enter length");
		length=sc.nextFloat();
		System.out.println("enter breadth");
		breadth=sc.nextFloat();
		float ar=length*breadth;
		System.out.println("area of rectangle is "+ar);

	}

	@Override
	public void calcPeri() {
		float pr=((2*length)+(2*breadth));
		System.out.println("perimeter of rectangle is "+pr);

	}

}
