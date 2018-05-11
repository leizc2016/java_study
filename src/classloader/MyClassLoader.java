package classloader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

public class MyClassLoader extends ClassLoader {

	private String baseDir = "P:/workspace_study/java_study/bin/";

	public Class<?> loadMyClass(String name) {
		Class<?> clazz = null;
		try {
			clazz = super.findLoadedClass(name);
			if (clazz == null) {
				clazz = findClass(name);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return clazz;
	}

	protected Class<?> findClass(String name) throws ClassNotFoundException {
		byte[] bytes = loadClassBytes(name);
		Class<?> theClass = defineClass(name, bytes, 0, bytes.length);// A
		if (theClass == null)
			throw new ClassFormatError();
		return theClass;
	}

	private byte[] loadClassBytes(String className) {
		try {
			String classFile = getClassFile(className);
			FileInputStream fis = new FileInputStream(classFile);
			FileChannel fileC = fis.getChannel();
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			WritableByteChannel outC = Channels.newChannel(baos);
			ByteBuffer buffer = ByteBuffer.allocateDirect(1024);
			while (true) {
				int i = fileC.read(buffer);
				if (i == 0 || i == -1) {
					break;
				}
				buffer.flip();
				outC.write(buffer);
				buffer.clear();
			}
			fis.close();
			return baos.toByteArray();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	private String getClassFile(String name) {
		StringBuffer sb = new StringBuffer(baseDir);
		name = name.replace('.', File.separatorChar) + ".class";
		sb.append(File.separator + name);
		return sb.toString();
	}

	public static void main(String[] args) {
		MyClassLoader myClassLoader = new MyClassLoader();
		Class<?> clazz = myClassLoader.loadMyClass("classloader.ClassA");
		try {
			Constructor constructs = clazz.getConstructor(String.class);
			Object obj = constructs.newInstance("clazzA");
			Field[] fields = clazz.getDeclaredFields();
			for (Field field : fields) {
				Annotation[] annotations = field.getAnnotations();
				for (Annotation annotation : annotations)
					System.out.println(field.getName() + " "
							+ annotation.toString());
				field.setAccessible(true);
				field.set(obj, "lzc");
			}

			System.out.println(obj.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
