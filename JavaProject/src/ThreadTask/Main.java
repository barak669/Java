package ThreadTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class Main {

public static void main(String[] args) {
		
		ExecutorService executeor = Executors.newFixedThreadPool(5);
		
		for(int i=0; i<20; i++)
		{
			Runnable worker = new EventsHall(i+"");
			executeor.execute(worker);
		}
		
		executeor.shutdown();
		while(!executeor.isTerminated());
		
		EventsHall.print();

	}

}

}
