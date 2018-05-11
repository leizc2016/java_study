package thread;

public class Syn extends Thread {

	@Override
	public void run() {
		output();
	}
	
	public static synchronized void output()
	{
		for (int i = 0; i < 10; i++) {
			System.out.println(" current i=" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		Syn syn1 = new Syn();
		Syn syn2 = new Syn();
		
		syn1.start();
		syn2.start();
		
	}

}
