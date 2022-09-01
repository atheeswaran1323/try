package stringmethods;

public class Test1 {
public static void main(String[]args) {
	String firstName="Raja";
	String lastName="Raman";
	String join=firstName.concat(lastName);
	String result=join.toUpperCase();
	int result1=join.length();
	System.out.println(result);
	System.out.println(result1);
}
}
