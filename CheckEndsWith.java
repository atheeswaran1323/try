package stringmethods;

public class CheckEndsWith {
	public static void main(String[]args) {
		String word1="technology";
		boolean result1=word1.endsWith("y");
		System.out.println(result1);
		String word2="technology";
		boolean result2=word2.endsWith("Y");
		System.out.println(result2);
	}
}
