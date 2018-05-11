package rpcbreaker;

public abstract class State {
	
	public BreakerManager manager;

	public void beforeCall()  throws Exception {

	}

	public void callException() {

	}

	public void afterCall() {
	}

}
