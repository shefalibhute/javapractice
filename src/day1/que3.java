package day1;

public class que3 
{
public static void main(String[] args)
{
	int n1=Integer.parseInt(args[0]);
	int n2=Integer.parseInt(args[1]);
	char c=args[2].charAt(0);
	switch(c)
	{
	case '+':
		System.out.println(n1+n2);
		
		break;
		
	case '-':
		System.out.println(n1-n2);
		break;

	case '*':
		System.out.println(n1*n2);
		break;
		
	case '/':
		System.out.println(n1/n2);
		break;
	}
}
}
