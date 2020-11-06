package HomeWork1;

public class BookStore extends Store {
	private int bookSold;
	
	public BookStore(int monthlyRent, String name, int bookSold) {
		super(name, monthlyRent);
		this.bookSold = bookSold;
	}

	public int getBookSold() {
		return bookSold;
	}

	public void setBookSold(int bookSold) {
		this.bookSold = bookSold;
	}

	@Override
	public String toString() {
		return "BookStore [bookSold=" + bookSold + ", getName()=" + getName() + ", getMonthlyRent()=" + getMonthlyRent()
				+ "]";
	}
	
}
