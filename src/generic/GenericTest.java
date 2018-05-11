package generic;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

	public static <T>  void testGenericMethodDefine4(List<T> list1, List<T> list2){
	    System.out.println("***");
	 }
	public static void main(String[] args) {
		List<Son> sons =new ArrayList<Son>();
		List<Parent> parent =new ArrayList<Parent>();
		List<? super Parent> s= parent;
		testGenericMethodDefine4(null, null);
	}

}
