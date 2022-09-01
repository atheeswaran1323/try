package stringmethods;

public class Test3 {
	public static void main(String[]args) {
		String word="Welcome to my little world";
	String[] spliting=word.split(" ");
	String caps=spliting[0].toUpperCase();
	char[] result=spliting[1].toCharArray();
	String result1=spliting[3].concat(spliting[4]);
	String result2=word.substring(15,19);
	int result3=result1.length();
	char result4=word.charAt(12);
	
	
	
	
	
	
	System.out.println(caps);
	System.out.println(result[0]);
	System.out.println(result[1]);
	System.out.println(result1);
	System.out.println(result2);
	System.out.println(result3);
	System.out.println(result4);
	
	
	

	
		
				
		
	}

}
