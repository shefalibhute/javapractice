package day2;

import java.util.Scanner;

public class testque2 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter bookno");
	int bno=sc.nextInt();
	System.out.println("enter title");
	String t=sc.next();
	System.out.println("enter author");
	String a=sc.next();
	System.out.println("enter price");
	int p=sc.nextInt();
	que2 q=new que2(bno,t,a,p);
	System.out.println(q);
}
}
