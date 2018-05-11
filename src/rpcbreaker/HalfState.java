package rpcbreaker;

public class HalfState extends State {
	
	public BreakerManager manager;

	@Override
	public void callException() {
		manager.resetSuccessCount();
		manager.moveToOpenState();
	}
	
	
	public void afterCall()
	{
		if(manager.successCount>10)
		{
			
		}
	}
	


}
