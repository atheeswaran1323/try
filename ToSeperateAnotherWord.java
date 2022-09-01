package stringmethods;

public class ToSeperateAnotherWord {
	public static void main(String[]args) {
		String word="HelloWorld";
		String[]words=word.split("o");
		System.out.println(words[0]+"\n"+words[1]+"\n"+words[2]);
				}

}
