package thread;

/**
 * 守护线程
 * 防止 舞台已经拆除，戏子继续表演
 * 
 * @author leizhicheng
 *
 */
public class Damon implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("current i=" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		Damon damaon = new Damon();
		Thread thread = new Thread(damaon);
		thread.setDaemon(true);
		thread.start();
		
	
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("end");
	}

}
