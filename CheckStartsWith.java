package stringmethods;

public class CheckStartsWith {
	public static void main(String[]args) {
		String word1="technology";
		boolean result1=word1.startsWith("t");
		System.out.println(result1);
		String word2="technology";
		boolean result2=word2.startsWith("T");
		System.out.println(result2);
	}

}
