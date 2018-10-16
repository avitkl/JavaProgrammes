package programmes;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		int a[] = {-1,0,1,2,3,4,5,7};
		
		//1+2+3+4+5+7 =22
		//1+2+3+4+5+6+7 =28
		//28-22 =6
		
		int sum =0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println("Sum of given array integers sum ==>" +sum);
		
		int sum1 =0;
		for(int j=-1;j<=7;j++)
		{
			sum1=sum1+j;
		}
		
		System.out.println("Sum of all the integers sum including missing number ==>" +sum1);
		
		System.out.println("Missing number is ==>" +(sum1-sum));

	}

}
