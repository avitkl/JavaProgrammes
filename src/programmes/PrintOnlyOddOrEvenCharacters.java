package programmes;

public class PrintOnlyOddOrEvenCharacters {

	public static void main(String[] args) {
		
		String s1 = "This is Java Programe";
		
		String s = s1.replaceAll("[^a-zA-Z0-9]", "");
		String odd = "";
		String even = "";
		
		for(int i=0;i<s.length();i++)
		{
			if(i%2==0)
			{
				even +=s.charAt(i);
			}
			else
			{
				odd +=s.charAt(i);
			}
		}
		
		System.out.println("Odd characters are -->" +odd);
		System.out.println("Even characters are -->" +even);
		
		
	}
	
	
}
