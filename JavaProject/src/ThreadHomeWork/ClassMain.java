package ThreadHomeWork;

public class ClassMain {

	public static void main(String[] args) {
		
		Thread t1 = new Thread( new SecThread ("a"));
		Thread t2 = new Thread( new SecThread ("b"));
		Thread t3 = new Thread( new SecThread ("c"));
		Thread t4 = new Thread( new SecThread ("d"));
		
	
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	
	
	try {
		t1.join();
		t2.join();
		t3.join();
		t4.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	
	SecThread.print();

}
}
