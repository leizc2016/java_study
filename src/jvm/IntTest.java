package jvm;

public class IntTest {
	
	int a =3;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IntTest intTest1 = new IntTest();
		IntTest intTest2 = new IntTest();
		System.out.println(intTest1.a == intTest2.a);

	}

}
