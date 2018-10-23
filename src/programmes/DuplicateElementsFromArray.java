package programmes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementsFromArray {

	public static void main(String[] args) {
		
		String str = "This is java and java is powerfull language and java is open source tool";
		
		String names[] = str.split(" ");
		
		//String names[] = {"Java","JavaScript","Ruby","C","Python","Java","C"};
		
		//1. Compare each element ---worst solution
		ArrayList<String> result = new ArrayList<String>();
		for(int i=0;i<names.length;i++)
		{
			int count=1;
			if(!result.contains(names[i]))
		  {
			for(int j=i+1;j<names.length;j++)
			{
				if(names[i].equals(names[j]))
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println("Duplicate element is :: "+names[i]+":: Number of Instances-->"+count);
				result.add(names[i]);
			}
		  }
		}
		
		System.out.println("********************");
			
		//2. Using HashSet : Part of JavaCollection --> it stores unique values
		Set<String> store = new HashSet<String>();
		ArrayList<String> result1 = new ArrayList<String>();
		for(String name :names)
		{
			if(store.add(name)==false)
			{
				if(!result1.contains(name))
				{
				System.out.println("Duplicate element is :: "+name);
				result1.add(name);
				}
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
				System.out.println("Duplicate element is :: "+entry.getKey()+":: Number of Instances -->"+entry.getValue());
			}
		}
	}

}
