package programmes;

public class ReverseInteger {

	public static void main(String[] args) {
		
		//1. Using algorithm
		int num = 12345 ;
		int rev=0;
		
		System.out.println("Integer before reverse ==>" +num);
		
		while(num!=0)
		{
			rev=rev*10 + num % 10;
			num=num/10;
		}
		
		System.out.println("Integer after reverse using algorithm==>" +rev);
		
		//2. Using StringBuffer method
		int num1 = 12345 ;
		System.out.println("Integer after reverse using StringBuffer ==>"+new StringBuffer(String.valueOf(num1)).reverse());

	}

}
