package programmes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Practice {

	public static void main(String[] args) {
		
		//1. Display duplicate words
		//String s = "This is java programe and java is very powerfull language";
		//String words[] = s.split(" ");
		int numbers[]= {0,1,5,1,4,8,4};
	
		Map<Integer,Integer> storemap=new HashMap<Integer,Integer>();
		
		for(int num:numbers)
		{
			Integer count = storemap.get(num);
			if(count==null)
			{
				storemap.put(num,1);
			}
			else
			{
				storemap.put(num, ++count);
			}
		}
		
		Set<Entry<Integer,Integer>> entrySet = storemap.entrySet();
		for(Entry<Integer,Integer> entry : entrySet)
		{
			if(entry.getValue() < 2)
			{
				System.out.println("Non Duplicate word is -->"+entry.getKey() + " and number of occurances -->" + entry.getValue());
			}
		}
		
//		//2. Print only odd or even characters
//		String s = "Avinash";
//		for(int i=0;i<s.length();i++)
//		{
//			if(i%2==0)
//			{
//				System.out.println("Even character is --> "+s.charAt(i));
//			}
//			else
//			{
//				System.out.println("Odd character is --> "+s.charAt(i));
//			}
//		}
		
//		//3. Replace character at odd or even index
//		String s= "powerschool";
//        for(int i=2;i<s.length()+1;i++)
//        {
//        	if(i%2==0)
//        	{
//        		s=s.substring(0, i-1)+"&"+s.substring(i,s.length());
//        	}
//        }
//        System.out.println(s);
//        
//        String s1 = "powerschool";
//        for(int i=0;i<s1.length()+1;i++)
//        {
//        	if(i%2 !=0)
//        	{
//        		s1=s1.substring(0, i-1)+"&"+s1.substring(i,s1.length());
//        	}
//        }
//        System.out.println(s1);
		
//		//4. Remove junk character
//		String s = "华语／華語 xyz latin string 012356465450";
//		
//		s=s.replaceAll("[^a-zA-Z0-9]", "");
//		System.out.println(s);
		
//		//5. Remove characters other than a-z
//		String s= "Test@gmail.com";
//		s=s.replaceAll("[^a-z]", "");
//		System.out.println(s);
		
//		//6. Reverse Integer		
//		int num=12345;
//		int rev=0;
//		while(num != 0)
//		{
//			rev = rev*10 + num%10;
//			num=num/10;		
//		}
//		
//		System.out.println(rev);
		
//		//7. String reverse
//		String s="Avinash";
//		String rev="";
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			rev=rev+s.charAt(i);
//		}
//		System.out.println(rev);
		
//		//8. String swap
//		String a = "Hello";
//		String b = "World";
//		
//		a=a+b;
//		b=a.substring(0,a.length()-b.length());
//		a=a.substring(b.length());
//		
//		System.out.println(a);
//		System.out.println(b);
		
//		//9. Smallest and largest number
//		int numbers[] = {-20,-105,20,500,0,5612,-200};
//		int largest = numbers[0];
//		int smallest = numbers[0];
//		
//		for(int i=0;i<numbers.length;i++)
//		{
//			if(numbers[i] > largest)
//			{
//				largest=numbers[i];
//			}
//			else if (numbers[i] < smallest)
//			{
//				smallest = numbers[i];
//			}
//		}
//		System.out.println("Largest --> "+largest);
//		System.out.println("Smallest --> "+smallest);
		
//		//10. Missing number in an array
//		
//		int a[] = {-2,-1,0,1,3,5,4};
//		
//		Arrays.sort(a);
//		
//		int sum=0;
//		int sum1=0;
//		for(int i=0;i<a.length;i++)
//		{
//			sum=sum+a[i];
//		}
//		
//		for(int j=-2;j<=5;j++)
//		{
//			sum1=sum1+j;
//		}
//		
//		System.out.println("Missing number is -->" + (sum1-sum));
	}

}
