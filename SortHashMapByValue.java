import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class SortHashMapByValue{
	public static void main(String[] args){
		Map<String,Integer> map=new HashMap();
		map.put("A",99);
		map.put("B",12);
		map.put("C",34);
		map.put("D",1);
		
		map=sortByValues(map);
		System.out.println(map);	
	}
	
	static Map<String,Integer> sortByValues(Map<String,Integer> map){
		Map<String,Integer> temp=new LinkedHashMap();
		
		Set<Entry<String,Integer>> entry=map.entrySet();
		System.out.println("Entery :"+ entry);
		
		List<Entry<String,Integer>> listEntry=new ArrayList(entry);
		System.out.println("listEntry :"+ listEntry);
		
		listEntry.sort((x,y)->x.getValue().compareTo(y.getValue()));
		
		for(Entry<String,Integer> e:listEntry){
			temp.put(e.getKey(),e.getValue());
		}
		return temp;
	}
}