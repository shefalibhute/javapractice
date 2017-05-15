package day1;

import java.util.Scanner;

public class que2
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int sum=0;
		float avg=0;
		System.out.println("enter the 5 values in array");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		avg=sum/5;
		System.out.println("sum is "+sum);
		System.out.println("average is "+avg);
		for(int i=0;i<5;i++)
		{
			if (a[i]<avg)
			System.out.println(a[i]);
		}
	}
}
