package generic;

public class SwitchTest {
	
	public static void router(int a)
	{
		switch(a)
		{
		case 1: 
			System.out.println("1");
			
		default :
			System.out.println("default");
			
		case 2: 
			System.out.println("2");
			
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwitchTest.router(2);
	}

}
