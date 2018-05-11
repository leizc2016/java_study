package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 * @author leizhicheng
 *
 */
public class ThreadJoin {

	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB(threadA);
		threadA.start();
		threadB.start();
		
		/*ExecutorService executor = Executors.newFixedThreadPool(3);
		executor.execute(threadA);
		executor.execute(threadB);

		executor.shutdown();
		while (!executor.isTerminated()) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
	}

}

class ThreadA extends Thread {

	@Override
	public void run() {
		System.out.println(this.getPriority());
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
	}
}

class ThreadB extends Thread {

	private ThreadA threadA;

	public ThreadB(ThreadA threadA) {
		super();
		this.threadA = threadA;
	}

	@Override
	public void run() {
		System.out.println(this.getPriority());
		for (int i = 0; i < 10; i++) {
			System.out.println("[" + this.getClass().getSimpleName()
					+ "] current i=" + i);
			try {
				Thread.sleep(1000);
				if (i == 5) {
					//threadA.join();// ��A�߳�������Ҽ���(�̳߳ز���Ч)
					this.yield();;// A�߳�����B�߳����꣨�����һ����ֻ�Ǹ����ᣩ
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
