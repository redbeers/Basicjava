package h_javaLang;

import java.util.Arrays;

public class GetClassTest_01 {

	public static void main(String[] args) throws ClassNotFoundException {
		
		//클래스 객체로 부터얻는 벙법
		Class ca1 = new Point(100, 100).getClass();
		System.out.println(ca1.getName());
		System.out.println(Arrays.toString(ca1.getInterfaces()));
		
		//클래스 리터럴 로부터 얻는 방법
		Class ca2  = Point.class;
		System.out.println(ca1.getName());
		System.out.println(Arrays.toString(ca1.getInterfaces()));
		
		//클레스의 이름으로 부터 얻는 방법
		Class ca3 = Class.forName("h_javaLang.Point");//클래스 이름을 정확하게 써야한다.
		System.out.println(ca1.getName());
		System.out.println(Arrays.toString(ca1.getInterfaces()));
	}

}
