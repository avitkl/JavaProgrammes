package programmes;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int givenNum=9;
		int previousNum=0;
		int currentNum=1;
		System.out.print(currentNum +" ");
		for(int i=2;i<=givenNum;i++)
		{
			int fibNum=currentNum+previousNum;
			System.out.print(fibNum +" ");
			previousNum=currentNum;
			currentNum=fibNum;
		}

	}

}
