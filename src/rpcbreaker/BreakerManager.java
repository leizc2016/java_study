package rpcbreaker;

public class BreakerManager {

	public static int successCount;

	public static int failCount;

	public State state;

	public void resetSuccessCount() {
		successCount = 0;
	}

	public void moveToOpenState() {
		state = new OpenState();
	}
	
	public void moveToHalfState() {
		state = new HalfState();
	}
	
	public void moveToClosedState() {
		state = new HalfState();
	}

}
