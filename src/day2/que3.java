package day2;

public class que3
{
	private int bookNo;
	private String title;
	private String author;
	private float price;
	private static  int bookCount;
	static 
	{
		bookCount=0;
	}
	public que3(int bookNo, String title, String author, float price) {
		super();
		bookCount++;
		this.bookNo = bookNo;
		if(title.length()>=4)
		{
		this.title = title;
		}
		else
			System.out.println("invalid title");
		this.author = author;
		if(price>1&&price<=5000)
		{
		this.price = price;
		}
		else
			System.out.println("invalid price");
	}
	public static void getBookCount( )
	{
		System.out.println("number of books"+bookCount);
	}
	@Override
	public String toString() {
		return "que2 [bookNo=" + bookNo + ", title=" + title + ", author="
				+ author + ", price=" + price + "]";
	}
	

}
