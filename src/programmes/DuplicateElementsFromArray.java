package programmes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementsFromArray {

	public static void main(String[] args) {
		
		String names[] = {"Java","JavaScript","Ruby","C","Python","Java","C"};
		
		//1. Compare each element ---worst solution
		for(int i=0;i<names.length;i++)
		{
			for(int j=i+1;j<names.length;j++)
			{
				if(names[i].equals(names[j]))
				{
					System.out.println("Duplicate element is :: "+names[i]);
				}
			}
		}
		
		System.out.println("********************");
				
		//2. Using HashSet : Part of JavaCollection --> it stores unique values
		Set<String> store = new HashSet<String>();
		for(String name :names)
		{
			if(store.add(name)==false)
			{
				System.out.println("Duplicate element is :: "+name);
			}
		}
		
		System.out.println("********************");
		
		//3. using HashMap
		Map<String,Integer> storeMap = new HashMap<String,Integer>();
		for(String name : names)
		{
			Integer count=storeMap.get(name);
			if(count==null)
			{
				storeMap.put(name, 1);
			}
			else
			{
				storeMap.put(name, ++count);			
			}
		}
		
		//get the values from this HashMap
		Set<Entry<String,Integer>> entrySet = storeMap.entrySet();
		for(Entry<String,Integer> entry : entrySet)
		{
			if(entry.getValue()>1)
			{
				System.out.println("Duplicate element is :: "+entry.getKey());
			}
		}
	}

}
