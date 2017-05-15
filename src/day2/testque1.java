package day2;

import java.util.Scanner;

public class testque1
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	que1 q=new que1();
	System.out.println("enter bookno");
	q.setBookNo(sc.nextInt());
	System.out.println("enter title");
	q.setTitle(sc.next());
	System.out.println("enter author");
	q.setAuthor(sc.next());
	System.out.println("enter price");
	q.setPrice(sc.nextInt());
	
	System.out.println("bookno is "+q.getBookNo());
	System.out.println("title is "+q.getTitle());
	System.out.println("author is "+q.getAuthor());
	System.out.println("price is "+q.getPrice());
	
	
}
}
