package h_javaLang;

public class StringTest_01 {

	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = "abc";
		System.out.println(str1==str2);//같은 주소를 가지고있다.
		System.out.println(str1.equals(str2));

		String str3 = new String("abc");
		String str4 = new String("abc");
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));//오버라이드되어있다.
		System.out.println(str1.equals(str3));
	}

}
