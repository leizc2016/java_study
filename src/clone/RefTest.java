package clone;

public class RefTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p1 = new Person("lzc", 30);
		Person p2 =p1;
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1==p2);
		
		

	}

}
