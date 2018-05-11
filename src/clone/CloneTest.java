package clone;

public class CloneTest {
	
	private static String s2="lzc";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i=0;
		String s="lzc";
		System.out.println(s==s2);
		Person p1 = new Person(s, 30);
		Person p3 = new Person(s, 30);
		int a=1+i;
		int b=1;
		System.out.println(p1.getName()== p3.getName());
		Person p2 = null;
		try {
			p2 = (Person) p1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(p1);
		System.out.println(p2.name);
		System.out.println(p1 == p2);

	}

}
