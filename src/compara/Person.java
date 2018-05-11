package compara;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Person implements Comparable<Person> {

	private String name;
	
	

	public Person(String name) {
		super();
		this.name = name;
	}


	public int compareTo(Person p) {
		System.out.println("当前名字：" + name + " 与 " + p.name + " 比较");
		return name.compareTo(p.name);
	}
	
	
	public static void main(String[] args) {
		Person p1 = new Person("lzc");
		Person p2 = new Person("ww");
		Person p3 = new Person("zs");
		
		List list =new ArrayList<>();
		list.add(p2);
		list.add(p3);
		list.add(p1);
		Collections.sort(list);
		
		System.out.println(list);
		
		
	}

}
