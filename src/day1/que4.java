package day1;



public class que4
{
public static void main(String[] args)
{
	
	int n1=Integer.parseInt(args[0]);
	int a[]=new int[5];
	a[0]=5;
	a[1]=10;
	a[1]=15;
	a[1]=20;
	a[1]=25;
	System.out.println("enter 5 values for array");
	
	
	if (n1>1&&n1<=50)
	{
		for(int i=0;i<5;i++)
		{
			if (n1==a[i])
			{
				System.out.println("BINGO");
			}
			
		}
	}
			
}
}
