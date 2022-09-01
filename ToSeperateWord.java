package stringmethods;

public class ToSeperateWord {
	public static void main(String[]args) {
		String word="apple,orange,banana";
		String[]words=word.split(",");
		System.out.println(words[0]);
		System.out.println(words[1]);
		System.out.println(words[2]);
	}
	

}
