package reflect;

import java.lang.reflect.Field;


public class Modify {

	public static void main(String[] args) {
		Stu stu = new Stu();
		stu.setName("lzc");
		System.out.println(stu.toString());
		try {
			Field[] f=Stu.class.getFields();
			f[0].set(stu, "lzc01");
			System.out.println(stu.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
