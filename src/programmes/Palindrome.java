package programmes;

public class Palindrome {

	public static void main(String[] args) {
		
//		//1. String palindrome
//		String givenString="malayalam";
//		String reversedString="";
//		
//		for(int i=givenString.length()-1;i>=0;i--)
//		{
//			reversedString+=givenString.charAt(i);
//		}
//
//		if(givenString.equals(reversedString))
//		{
//			System.out.println("Given String is palindrome");
//		}
//		else
//		{
//			System.out.println("Given String is not a palindrome");
//		}
		
		//2. integer palindrome
		int givenInteger=523325;
		int temp=givenInteger;
		int reversedInteger=0;
		
		while(temp!=0)
		{
			reversedInteger=reversedInteger*10 + temp%10;
			temp=temp/10;
		}
		
		if(givenInteger==reversedInteger)
		{
			System.out.println("Given integer is palindrome");
		}
		else
		{
			System.out.println("Given integer is not a palindrome");
		}
	}

}
