package programmes;

public class ReverseString {

	public static void main(String[] args) {
		
		//Reverse a String
		//diff bw String and StringBuffer ==> 1. String is immutable and StringBuffer is non immutable 2.String doesnot contain reverse function but StringBuffer has
		//do we have reverse function in String ? Answer is "No"
		String s = "Selenium";
		
		System.out.println("String before reverse ==>" +s);
		
		//1. using for loop
		int len=s.length(); //lenth is 8
		String rev = "";
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		System.out.println("String after reverse using for loop ==>" +rev);
		
		//2. using StringBuffer class
		StringBuffer sf = new StringBuffer(s);
		System.out.println("String after reverse using StringBuffer reverse method ==>" +sf.reverse());

	}

}
