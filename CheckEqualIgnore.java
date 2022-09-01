package stringmethods;

public class CheckEqualIgnore {
	public static void main(String[]args) {
		String word1="TECHNOLOGY";
		boolean result1=word1.equalsIgnoreCase("Technology");
		System.out.println(result1);
		String word2="Technology";
		boolean result2=word2.equalsIgnoreCase("Techlogy");
		System.out.println(result2);
		}

}
