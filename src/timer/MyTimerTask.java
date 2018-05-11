package timer;

import java.util.Timer;
import java.util.TimerTask;

public class MyTimerTask extends TimerTask {

	public Timer timer = new Timer();

	public void start() {
		timer.schedule(this, 3*1000,2*1000);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyTimerTask myTimerTask = new MyTimerTask();
		
		myTimerTask.start();
		
	}

	@Override
	public void run() {
		System.out.println("MyTimerTask run Called");
		//timer.cancel();
		try {
			Thread.sleep(200*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
