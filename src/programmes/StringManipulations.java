package programmes;

public class StringManipulations {
	
	public static void main(String[] args) {

	String str = "The rains have started selenium here";
	String str1 = "The rains have started selenium here";
	
	System.out.println("\n String length is :" + str.length());
	
	System.out.println("\n Character at index 5 :" + str.charAt(5));
	
	System.out.println("\n Index of first Char 's' :" + str.indexOf('s')); // first occurrence of 's'
	
	System.out.println("\n Index of second Char 's' :" + str.indexOf('s',str.indexOf('s')+1)); // second occurrence of 's'
	
	System.out.println("\n Index of third Char 's' :" + str.indexOf('s',str.indexOf('s',str.indexOf('s')+1)+1)); // third occurrence of 's'
	
	System.out.println("\n Index of 'have' :" + str.indexOf("have"));
	
	System.out.println("\n Index of 'hello' :" + str.indexOf("hello")); //return -1 if string is not available
	
	//string comparison
	System.out.println("\n " + str.equals(str1));
	
	System.out.println("\n " + str.equalsIgnoreCase(str1));
	
	//substring
	System.out.println("\n " + str.substring(0,9));
	
	//trim:
	String s = "  Hello World   ";
	System.out.println("\n " + s.trim());
	
	System.out.println("\n " + s.replace(" ",""));
	
	//split:
	String s1 = "Hello_World_Test_Selenium";
	String[] s1Values = s1.split("_");
	System.out.println("\n Splitted Values");
	for(int i=0;i<s1Values.length;i++)
	{
		System.out.println("\n " + s1Values[i]);
	}
	
	//Concatinate String with integer values
	String x = "Hello";
	String y = "World";
	int a= 100;
	int b= 200;
	
	System.out.println(x+y+a+b); // return value as "HelloWorld100200"
	
	System.out.println(a+b+x+y); // return value as "300HelloWorld"
	
	}
}
