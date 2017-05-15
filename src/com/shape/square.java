package com.shape;

import java.util.Scanner;

public class square implements Polygon
{
private float side;
Scanner sc=new Scanner(System.in);
@Override
public void calcArea() 
{	System.out.println("enter value for side");
	side=sc.nextFloat();
	float as=side*side;
	System.out.println("area of square is "+as);
}

@Override
public void calcPeri() {
	side=sc.nextFloat();
	float peri=4*side;
	System.out.println("perimeter of square is "+peri);
	
}
}
