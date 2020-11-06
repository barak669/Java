package HomeWork1;

import java.util.ArrayList;

public class Mall {

	private ArrayList<Store> arr;
	
	public Mall() {
		arr = new ArrayList<Store>();
	}
	
	public void addNewFlowerBook(int monthlyRent, String name, int monthlyOrderNumber) {
		
		arr.add(new FlowerStore(monthlyRent, name, monthlyOrderNumber));
	}
	
	public void addNewBookStore(int monthlyRent, String name, int bookSold) {
		
		arr.add(new BookStore(monthlyRent, name, bookSold));
	}
	
	public void printMallStore() {
		int sum = 0;
		int sumOfBookStore = 0;
		for (Store s : arr) {
			sum += s.getMonthlyRent();
			if (s instanceof BookStore)
				sumOfBookStore+=1;
		}
		
		System.out.println("the sum amount fo monthly rent from all store is " 
		+ sum + "\nthe number of book store in the mall is " + sumOfBookStore);

	}
	
	
	
	



}




