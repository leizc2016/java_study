package io;

import java.io.UnsupportedEncodingException;

public class IOTest {

	public static void main(String[] args) {
		System.out.println(subString("ÄãºÃAB", 4));
	}

	public static String subString(String s, int count) {
		byte[] b=null;
		try {
			b = s.getBytes("GBK");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int num = 0;
		for (int i = 0; i < b.length; i++) {
			if (num >= count) {
				break;
			}
			byte c = b[i];
			
			num++;
			if (c < 0) {
				num++;
				i=i+1;
			}
			
			
		}
		System.out.println(num);
		byte[] copy =new byte[num];
		for(int i=0;i<num;i++)
		{
			copy[i] = b[i];
		}
		try {
			return new String(copy,"GBK");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
