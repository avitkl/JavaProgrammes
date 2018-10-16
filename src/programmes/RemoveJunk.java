package programmes;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String s = "华语／華語 xyz latin string 012356465450";
		
		System.out.println("String with junk characters ==>" +s);
		
		//Regular Expression : [^(a-z A-Z 0-9)]
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println("String without junk characters ==>" +s);

	}

}
