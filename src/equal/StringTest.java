package equal;

public class StringTest implements Runnable{
	
	public String a1="abc";
	public String a2="abc";
	public final Integer a=6;
	int b=6;
	
	public void test()
	{
		String a3="abc";
		int c=6;
		/*System.out.println(a1==a3);
		System.out.println(a==c);*/
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String a3="abc";
		StringTest stringTest = new StringTest();
		//System.out.println(stringTest.a1==stringTest.a2);
		stringTest.test();
		new Thread(stringTest).start();

	}

	@Override
	public void run() {
		Integer d=6;
		System.out.println(a==d);
		
	}

}
