package maps;
// Write a Java program to associate the specified value with the specified key in a HashMap. 

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Qno_1 {
	public static void main (String []args) {
		Map<String,String> hm=new HashMap<>();
		Map<String,String> hhm=new HashMap<>();
		
		hm.put("1","Sasi" );
		hm.put("2","raju");
		hm.put("3","john");
		hm.put("4","mick");
		Set<String> key=hm.keySet();
		System.out.println("using while loop");
	Iterator<Entry<String, String>> itr= hm.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("using for loop");
		for(String j:key) {
			System.out.println("key="+j+" "+"value"+hm.get(j));
		}
		hm.size();
		System.out.println("size of keys"+hm.size());
		 hhm .putAll(hm);
		 System.out.println ( " copy all of the mappings from the specified map(hm) to another map(hhm):"+hhm) ;
		
		hm.clear();
		 System.out.println("here we using clear to clear hm ():"+hm);
		boolean k= hm.isEmpty();
	   System.out.println("here we using emepty() to check :"+k);
		 
		 System.out.println("if a map contains a mapping for the specified value:"+hhm.get("1"));
		
		  Map<String,String> hm1=new HashMap<>(hhm);
		  hm1.put("6", "hello");
		  hm1.put("5", "hi");
		  hm1.put("1", "sasi");
		  System.out.println("doing shallow copy:"+hm1);
		 boolean d= hm1.containsValue("sasi");
		  System.out.println("map contains a mapping for the specified key:"+d);
		  Set h=hm1.keySet();
		  System.out.println("create a set view of the mappings contained in a map"
		  		+ h);
		  System.out.println("Write a Java program to get a collection view of the values contained in this map"+hm1.values());
		  System.out.println("get the value of a specified key in a map:"+hm1.get(4) );
		  System.out.println("");
	List <Entry<String,String>> list=
	}
	

}
