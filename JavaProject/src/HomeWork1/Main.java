package HomeWork1;

public class Main {

	public static void main(String[] args) {
		Store s1 = new BookStore(3000, "stimatzki", 400);
		Store s2 = new BookStore(3000, "tsomet", 400);
		Store s3 = new FlowerStore(2000, "ross", 50);
	
	
	System.out.println(s1.equals(s2));
	
	Mall s = new Mall();
	s.addNewBookStore(s1.getMonthlyRent(), s1.getName(), 400);
	s.addNewBookStore(50000, "tsomet", 600);
	s.addNewFlowerBook(3003, "jhj", 400);
	
	s.printMallStore();

	}
}
	
	


