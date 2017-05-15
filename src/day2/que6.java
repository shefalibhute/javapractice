package day2;

import java.util.Scanner;

public class que6 extends que1
{
	private String category ;

	
	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public static void main(String[] args) 
	{
		que6 q=new que6();
		Scanner sc=new Scanner(System.in);
		q.setBookNo(sc.nextInt());
		q.setTitle(sc.next());
		q.setAuthor(sc.next());
		q.setPrice(sc.nextFloat());
		q.setCategory(sc.next());
		
		System.out.println("bookno "+q.getBookNo());
		System.out.println("title is "+q.getTitle());
		System.out.println("author is "+q.getAuthor());
		System.out.println("price is "+q.getPrice());
		System.out.println("category is "+q.getCategory());
	}
}
