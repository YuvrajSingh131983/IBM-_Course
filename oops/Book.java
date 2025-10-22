package oops;

public class Book {
	private String title;
	private String Aurthor;
	private double price;
	public void discountprice(double percentage)
	{
		double num=(price*percentage)/100;
		System.out.println("Discounted Price= "+num);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAurthor() {
		return Aurthor;
	}
	public void setAurthor(String aurthor) {
		Aurthor = aurthor;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", Aurthor=" + Aurthor + ", price=" + price + "]";
	}
	public Book(String title, String aurthor, double price) {
		super();
		this.title = title;
		Aurthor = aurthor;
		this.price = price;
	}
	public Book() {
		super();
	}
	
	

}
