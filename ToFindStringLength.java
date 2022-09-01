package stringmethods;

public class ToFindStringLength {
	public static void main(String[]args) {
		String word="findstringlength";
		int result=word.length();
		System.out.println(result);
		String[]words=word.split("i");
		int words1=words.length;		
		System.out.println(words1);
	}

}
