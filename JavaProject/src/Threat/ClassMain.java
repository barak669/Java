package Threat;

public class ClassMain {

	public static void main(String[] args) {
		
		Thread t1 = new Thread( new SecThread ("1"));
		Thread t2 = new Thread( new SecThread ("2"));
		Thread t3 = new Thread( new SecThread ("3"));
	
	t1.start();
	t2.start();
	t3.start();
	
	try {
		t1.join();
		t2.join();
		t3.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	
	SecThread.print();

}
}
