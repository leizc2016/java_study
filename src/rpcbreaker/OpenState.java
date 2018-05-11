package rpcbreaker;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 熔断器启动状态
 * 
 * @author LeiZhicheng
 * 
 * @date：2018-3-29
 */
public class OpenState extends State {

	public BreakerManager manager;

	OpenState() {
		final Timer timer = new Timer();
		timer.schedule(new TimerTask() {

			@Override
			public void run() {
				moveToHalfState();
				timer.cancel();
			}
		}, 5 * 1000);
	}

	@Override
	public void beforeCall() throws Exception {
		throw new Exception("breaker is open");
	}

	public void moveToHalfState() {
		manager.moveToHalfState();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
