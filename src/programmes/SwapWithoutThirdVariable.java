package programmes;

public class SwapWithoutThirdVariable {
	
	public static void main(String[] args) {
	
		int x =10;
		int y = 5;
		
		System.out.println("Before swapping");
		System.out.println("The value of x is :" +x);
		System.out.println("The value of y is :" +y);
		
		System.out.println("========================");
		
//		//1 . with using third variable
//		int t;
//		t=x; //5
//		x=y; //10
//		y=t; //5
		
//		//2. Without using third var : using + opearator
//		x=x+y; //15
//		y=x-y; //5
//		x=x-y; //10
//		
//		//3. Without using third var : using * opearator
//		x=x*y; //50
//		y=x/y; //5
//		x=x/y; //10
//		
		//4. without using third var : using XOP operator
		x=x^y; //15 --> 1111
		y=x^y; //10 --> 1010
		x=x^y; //5  --> 0101
		
		
		System.out.println("After swapping");
		System.out.println("The value of x is :" +x);
		System.out.println("The value of y is :" +y);
		
	}

}
