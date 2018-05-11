package classloader;

public class ClassA {

	@Autowired
	private String name;

	public ClassA(String alias) {
		System.out.println("ClassA alias is:" + alias);
	}

	@Override
	public String toString() {
		return "ClassA [name=" + name + "]";
	}

}
