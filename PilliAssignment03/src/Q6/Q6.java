package Q6;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		str.concat(" world");
		System.out.println(str);  // prints "Hello"

		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" world");
		System.out.println(sb.toString());  // prints "Hello world"

	}

}
