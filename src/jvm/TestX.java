package jvm;

class SingTon {
	private static SingTon singleTon = new SingTon();
	public static int count1;
	public static int count2 = 0;

	static 
	{
		System.out.println("static:"+count1+","+count2);
	}
	
	private SingTon() {
		count1++;
		count2++;
		System.out.println("xx");
		
	}

	
	public static SingTon getInstance() {
		System.out.println(count1+","+count2);
		return singleTon;
	}
}

class TestX {
	public static void main(String[] args) {
	/*	try {
			Class.forName("jvm.SingTon");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		SingTon singleTon = SingTon.getInstance();
		System.out.println("count1=" + singleTon.count1);
		System.out.println("count2=" + singleTon.count2);
	}
}
