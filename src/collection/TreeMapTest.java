package collection;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		      // creating maps 
		      TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
		      SortedMap<Integer, String> treemapincl = new TreeMap<Integer, String>();
		            
		      // populating tree map
		      treemap.put(2, "two");
		      treemap.put(1, "one");
		      treemap.put(3, "three");
		      treemap.put(6, "six");
		      treemap.put(5, "five");      
		      
		      System.out.println("Getting tail map");
		      treemapincl=treemap.tailMap(4);
		      int key=0;
		      if(treemapincl.isEmpty()) {   
		            key = treemap.firstKey();   
		        } else {   
		            key = treemapincl.firstKey();   
		        } 
		      System.out.println(key);
		      
		      System.out.println("Tail map values: "+treemapincl);
	}

}
