package programmes;

public class ReplaceCharAtOddIndex {

	public static void main(String[] args) {
		
		//1. Replace odd numbers
	      String a = "prowareness";

	      for (int i=0; i < a.length()+1; i++){
	        if (i % 2 != 0){
	          a = a.substring(0,i-1) + "&" + a.substring(i, a.length());
	        }
	      }
      System.out.println("String after replacing odd characters --> " +a);
	      
      
	      //2. Replace Even numbers
	      String b = "prowareness";

	      for (int i=2; i < b.length(); i++){
	        if (i % 2 == 0){
	          b = b.substring(0,i-1) + "&" + b.substring(i, b.length());
	        }
	      }
	      System.out.println("String after replacing even characters --> " +b);
	      
	}
	
	
}
