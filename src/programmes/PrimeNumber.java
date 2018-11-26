package programmes;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int givenNumber=545;
		boolean flag=false;
		for(int i=2;i<=(givenNumber/2);i++)
		{
			if((givenNumber%i)==0)
			{
				flag=true;
				break;
			}
		}
		
		if(flag==true)
		{
			System.out.println("Given Number is not a prime number");
		}
		else
		{
			System.out.println("Given Number is a prime number");
		}

	}

}
