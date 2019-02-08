package programmes;

public class StringContainsOnlyAlphabetsRex {

	public static void main(String[] args) {
		
		String str="Avinash";
		
		boolean result=str.matches("^[a-zA-Z]*$");
		
		System.out.print(result);
	}
}
