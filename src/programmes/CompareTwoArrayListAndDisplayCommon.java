package programmes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CompareTwoArrayListAndDisplayCommon {

	public static void main(String[] args) {
		
		//1. First Solution
		List<String> lista = new ArrayList<String>();
		List<String> listb = new ArrayList<String>();
		
		lista.add("A");
		lista.add("B");
		lista.add("C");
		
		listb.add("D");
		listb.add("E");
		listb.add("C");
		
		// Create an lista+listb list which will contain both list (lista and listb) in which common element will occure twice
		List<String> listaPluslistb = new ArrayList<String>(lista);
		listaPluslistb.addAll(listb);
		
		//Create an listaUnionlistb set which will contain both list (lista and listb) in which common element will occure once
		Set<String> listaUnionlistb = new HashSet<String>(lista);
		listaUnionlistb.addAll(listb);
			
		for(String s:listaUnionlistb)
		{
			listaPluslistb.remove(s);
		}
		
		System.out.println("Common elements are : ");
		System.out.println(listaPluslistb);
		
		//2. Second Solution
		List<String> commons = new ArrayList<String>();
		for(String value:lista)
		{
			if(listb.contains(value))
			{
				commons.add(value);
			}
		}
		System.out.println("Common elements are : ");
		for(String common:commons)
		{
			System.out.print(" "+common);
		}
		

	}

}
