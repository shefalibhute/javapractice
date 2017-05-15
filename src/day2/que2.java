package day2;

public class que2
{
	private int bookNo;
	private String title;
	private String author;
	private float price;
	public que2(int bookNo, String title, String author, float price) {
		super();
		
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
	@Override
	public String toString() {
		return "que2 [bookNo=" + bookNo + ", title=" + title + ", author="
				+ author + ", price=" + price + "]";
	}
	

}
