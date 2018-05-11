package thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CountDown extends Thread {

	private CountDownLatch latch;
	
	
	public CountDown(CountDownLatch latch) {
		super();
		this.latch = latch;
	}


	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("[" + this.getClass().getSimpleName()
					+ "] current i=" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		latch.countDown();
	}
	
	
	public static void main(String[] args) {
		CountDownLatch latch = new CountDownLatch(2);
		CountDown countDown1 = new CountDown(latch);
		CountDown countDown2 = new CountDown(latch);
		countDown1.start();
		countDown2.start();
		try {
			latch.await(8,TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("end!");
		
		
	}
}
