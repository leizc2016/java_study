package thread;

/**
 * �ػ��߳�
 * ��ֹ ��̨�Ѿ������Ϸ�Ӽ�������
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
