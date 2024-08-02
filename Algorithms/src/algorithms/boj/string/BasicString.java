package algorithms.boj.string;

public class BasicString {

	public void saveVariablesMethod() {
		// Variables written by Literal are saved on Java Constant String pool
		// If you wrote variables with constructor, it has it's own space on memory and pointers of thoes are saved in variable
		String str1 = "TestString";
		String str2 = "TestString";

		String str3 = new String("TestString");
		String str4 = new String("TestString");
		
		System.out.println("str1 == str2 : " + (str1 == str2));	// true
		System.out.println("str2 == str3 : " + (str2 == str3)); // false
		System.out.println("str3 == str4 : " + (str3 == str4)); // false
		
		System.out.println("str1.equals(str2) : " + (str1.equals(str2))); // true
		System.out.println("str2.equals(str3) : " + (str2.equals(str3))); // true
		System.out.println("str3.equals(str4) : " + (str3.equals(str4))); // true
	}
	

	public static void stringMethod() {
		String str1 = "Hello!";
		System.out.println("charAt(0) of str1 : " + str1.charAt(0));
		// str1.charAt(0) = 'T'; you cannot do this because 'charAt' Method doesn't provied a setter
		
		System.out.println("Length of str1 : " + str1.length());
		System.out.println("If it's same with \"Hallo!\" : " + str1.equals("Hallo!"));
		System.out.println("compareTo \"hello!\" : " + str1.compareTo("hello!"));
		// unicode of H is 72, unicode of h is 104. 72 - 104 = -32
		
		char[] str2 = str1.toCharArray();
		for(int i=0; i<str2.length; i++) {
			System.out.println(str2[i]);
		}
		
		String str3 = "programmer";
		System.out.println("str3.toUpperCase() : " + str3.toUpperCase());
		String str4 = "YES THAT'S IT!";
		System.out.println("str4.toLowerCase() : " + str4.toLowerCase());
		
		String str5 = "abcdefg";
		System.out.println("If str5 has 'h' : " + str5.contains("h"));
		System.out.println("If str5 has 'a' : " + str5.contains("a"));
		System.out.println("If str5 has 'A' : " + str5.contains("A"));
		
		String str6 = "abcdE";
		System.out.println("replace a to b : " + str6.replace('a', 'b'));
		System.out.println("replace b to c : " + str6.replace('b', 'c'));
		// String is immutable type. so It just retruns String, not change original String data
		
		String str7 = "Hi ! I am a~";
		System.out.println("split str7 by '!' before : " + str7.split("!")[0]);
		System.out.println("split str7 by '!' after : " + str7.split("!")[1]);
		
		String str8 = "AbCdEfGhIjKlMnOp";
		System.out.println("str8.substring(0) : " + str8.substring(0));
		System.out.println("str8.substring(1) : " + str8.substring(1));
		System.out.println("str8.substring(5) : " + str8.substring(5));
		System.out.println("str8.substring(3, 5) : " + str8.substring(3, 5));
		
		System.out.println("str8.indexOf(h, 3) : " + str8.indexOf("h", 3)); // return 7 not 4
		
		String str9 = "abcddddeeee";
		System.out.println("str9.indexOf(\"d\", 4) : " + str9.indexOf("d", 4)); // after first "d", next 'd''s index number is 4
		System.out.println(str9.indexOf("cd"));
	}
}
