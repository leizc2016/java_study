package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * 
 * @author leizhicheng
 *
 */
public class ThreadState implements Callable<String>{

	@Override
	public String call() throws Exception {
		for (int i = 0; i < 100; i++) {
			System.out.println("current i=" + i);
			Thread.sleep(1000);
		}

	
		return "END";
	}
	
	
	public static void main(String[] args) {
		ThreadState task = new ThreadState();
		 ExecutorService  executors=Executors .newSingleThreadExecutor();
		Future<String> future= executors.submit(task);
		
		try {
			future.get(5, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			System.out.println("InterruptedException");
			e.printStackTrace();
		} catch (ExecutionException e) {
			System.out.println("ExecutionException");
			e.printStackTrace();
		} catch (TimeoutException e) {
			System.out.println("TimeoutException");
			System.out.println(future.isCancelled()+"   "+future.isDone());
			future.cancel(true);
			System.out.println(future.isCancelled()+"   "+future.isDone());
			e.printStackTrace();
		}
		 
		 
		 
	}
}
