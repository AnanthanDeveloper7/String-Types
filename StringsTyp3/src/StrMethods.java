public class StrMethods {
	public static void main(String[] args) {
		String s1="Hello world";
		System.out.println(s1.concat(" wow "));
		System.out.println(s1.equals("Hello world"));
		System.out.println(s1.substring(0,11));
		System.out.println(s1.indexOf(4));
		System.out.println(s1.charAt(4));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.trim());
		System.out.println(s1.isEmpty());
		System.out.println(s1.equalsIgnoreCase(s1));
		System.out.println(s1.lastIndexOf(0));
		System.out.println(s1.length());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.split(s1));
	}

}
