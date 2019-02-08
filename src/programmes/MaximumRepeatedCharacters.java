package programmes;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MaximumRepeatedCharacters {

	public static void main(String[] args) {
	
		String str1="abcdaabc";
		
		char[] arrays=str1.toCharArray();
		
		Map<Character,Integer> storeMap = new HashMap<Character,Integer>();
		for(char array : arrays)
		{
			Integer count=storeMap.get(array);
			if(count==null)
			{
				storeMap.put(array, 1);
			}
			else
			{
				storeMap.put(array, ++count);			
			}
		}
		
		//get the values from this HashMap
		Set<Entry<Character,Integer>> entrySet = storeMap.entrySet();
		for(Entry<Character,Integer> entry : entrySet)
		{
			if(entry.getValue()>1)
			{
				System.out.println("Duplicate element is :: "+entry.getKey()+":: Number of Instances -->"+entry.getValue());
			}
		}
	}
}
