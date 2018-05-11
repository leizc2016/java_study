package reflect;

public class InitTest {
	
	public static int count=1;

	static 
	{
		System.out.println("static was executed!");
	}
	
	InitTest()
	{
		count++;
		System.out.println("count="+count);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Class<InitTest> obj=(Class<InitTest>) Class.forName("reflect.InitTest");
			
		  obj.newInstance();
		  System.out.println(obj.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
