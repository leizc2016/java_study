package jvm;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Test {
	
	//private static ByteBuffer bf =ByteBuffer.allocate(2048*10000000);

	public static void main(String[] args) {
		System.out.println(System.getProperty("java.class.path"));
		ByteBuffer bf =ByteBuffer.allocate(2048*1000000);
		String s = "aaa";
		String str1 = "aaa" + "bbb";
		String str2 = "aaabbb";
		String str3 = s + "bbb";//堆中?
		String str4 = s + "bbb";//堆中?
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);//false
		System.out.println(str3 == str4);//false
		List<String> set =new ArrayList<>();
		/*for(int i=0;;i++)
		{
			String mystr =s;
			set.add(mystr);
		}*/
		Long photoId=1l;
		String fieldOne="fieldOne";
		String syncTableName ="syncTableName";
		String opType="I";
		
		// 彭飞提供的接口
				String msg = "{\"pkValue\":\"" + Long.valueOf(photoId)
						+ "\",\"fieldOne\":\""+fieldOne+"\",\"userName\":\"VIRTUAL\",\"tableName\":\""+syncTableName+"\",\"dataSourceId\":\"superDataSource\",\"status\":\"INIT\",\"triggerType\":\""
						+ opType + "\"}";

				System.out.println(msg);
	}

}
