package stringmethods;

public class UseMobile {
	public static void main(String[]args) {
		Mobile mobile1=new Mobile();
		mobile1.brand="sony";
		mobile1.price=5999;
		mobile1.color="black";
		
		System.out.println(mobile1.brand.toUpperCase());
		System.out.println(mobile1.color.charAt(mobile1.color.length()-1));
	}

}
