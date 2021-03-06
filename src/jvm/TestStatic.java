package jvm;

public class TestStatic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.count1);
		System.out.println(singleton.count2);

	}

}

class Singleton {
	private static Singleton singleton = new Singleton();
	public static int count1;
	public static int count2 = 0;

	private Singleton() {
		count1++;
		System.out.println(count1);
		count2++;
		System.out.println(count2);
	}

	public static Singleton getInstance() {
		return singleton;
	}
}
