package classloader;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLClassLoader;

public class URLClassLoaderTest {
	
	

	public static void main(String[] args) {
		String path = "file:P:/workspace_study/java_study/bin/";

		try {
			URLClassLoader myClassLoader = new URLClassLoader(
					new URL[] { new URL(path) });
			System.out.println(myClassLoader.getParent().getClass().getClassLoader());
			Class<?> clazz = myClassLoader.loadClass("classloader.ClassA");
			Constructor constructs = clazz.getConstructor(String.class);
			Object obj = constructs.newInstance("clazzA");
			Field[] fields=clazz.getDeclaredFields();
			for(Field field:fields)
			{
				Annotation[] annotations=field.getAnnotations();
				for(Annotation annotation:annotations)
				System.out.println(field.getName()+" "+annotation.toString());
				field.setAccessible(true);
				field.set(obj, "lzc");
			}
			
			System.out.println(obj.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
