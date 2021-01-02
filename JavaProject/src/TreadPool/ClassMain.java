package TreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClassMain {

	public static void main(String[] args) {
		
		ExecutorService executeor = Executors.newFixedThreadPool(5);
		
		for(int i=0; i<20; i++)
		{
			Runnable worker = new ThreadSec(i+"");
			executeor.execute(worker);
		}
		
		executeor.shutdown();
		while(!executeor.isTerminated());
		
		ThreadSec.print();

	}

}
