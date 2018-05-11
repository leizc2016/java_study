package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class NullMap {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(null, null);
		
		//hashrable key 和 value 都不能为空
		Hashtable table =new Hashtable();
		table.put(null, null);

	}

}
