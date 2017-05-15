package day2;

import java.util.Scanner;

public class testque4
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	que4 arr[]=new que4[3];
	
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=new que4();
		System.out.println("enter book details");
		System.out.println("enter bookno");
		arr[i].setBookNo(sc.nextInt());
		System.out.println("enter title");
		arr[i].setTitle(sc.next());
		System.out.println("enter author");
		arr[i].setAuthor(sc.next());
		System.out.println("enter price");
		arr[i].setPrice(sc.nextInt());
		
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i].getBookNo());
		System.out.println(arr[i].getTitle());
		System.out.println(arr[i].getAuthor());
		System.out.println(arr[i].getPrice());
	}
	
	System.out.println("enter bno to be searched");
	int b=sc.nextInt();
	for(int i=0;i<arr.length;i++)
	{
		if(b==arr[i].getBookNo())
		{
			System.out.println("book found");
			System.out.println(arr[i].getBookNo());
			System.out.println(arr[i].getTitle());
			System.out.println(arr[i].getAuthor());
			System.out.println(arr[i].getPrice());
	}
	}
}
}
