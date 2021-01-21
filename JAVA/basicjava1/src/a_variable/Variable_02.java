package a_variable;

public class Variable_02 {
	public static void main(String[] args) {
		
		/*
		변수의 타입
		-크게 두개 기본형 참조형
		
		1. 기본형 타입(primitive type)
		-글자 숫자 논리형 저장가능
		-boolean, char, byte, short, int, long, float, double
		
		2. 참조형 타입(reference type)
		-주소를 저장한다.
		-물건에 대한 정보 묶어서 가지고 있다
		
		3. 기본형 변수의 종류
		-어떤 값을 저장하냐에 따라 나눈다
		-논리형 : 참 거짓, t/f --> boolean
		-문자형 : char(한글자만)
		-정수형 : byte short  int(정수형의 대표) long   
		-실수형 : float double(실수형의 대표)
		
		
		4. 기본형 변수의 크기
		-1byte : boolean, byte 
		-2byte : char, short
		-4byte : int, float
		-8byte : long, double
		
		5. 논리형 - boolean : 기본값 false
		- boolean형 변수에는 true 또는 false값만을 저장할 수 있다.
		- boolean형 변수는 대답(yes/no), 스위치 (ON/OFF) 등의 논리구조에 주로 사용된다.
		
		6. 문자형 - char
		-문자 하나를 저장하는 용도로 사용한다.(강조-하나)
		-java는 unicode문자 체계를 이용한다.(16진수)
		-char 표시할 때는 세가지 방법이 있다
		
		7. 정수형 - byte, short, int, long
		-범위를 알고있어야 선택해서 사용 가능
		-기본자료형은 int이다
		-저장하려는 정수값의 크기에 따라 4개의 정수형 중 하나를 선택하면 된다.
		
		8. 실수형(소수점이 있는거)- float, double
		- 기본자료형은 double이다.
		- 자료형을 선택할 때 크기도 중요하지만 정밀도가 더 중요하다.
		- 자바에서는 float이 더 편함
		- float -> 1:8:23
		- double -> 1:11:52
		- 차이점 하나 더 있는데 그건 연산자 할때 한다.
		
		9. String
		=> 문자열을 다루기 위해 만들어진 클래스이다.
		- 캐릭터는 하나였으니까 걔 대신 사용
		- 클래스이지만 기본형처럼 사용
		- 참조형 타입 주소
		- null이면 집이 없는거 ""이거면 집은 있는데 안사는거 
		- 주소가 없으면 참조형들은 null 주소는 있는데 나중에 판단할거면 ""		
		
		
		10. overflow  
		- 내가 저장할수 있는 값을 넘어섰을 때 다른 최소값으로 넘어간다
		- ex)127 넘어가면 128로 가는게 아니라 -128로 간다
		- 변수가 자신이 저장할 수 있는 범위를 넘었을 때 최솟값부터 다시 표현하는 현상
		
		11. 캐스팅(casting)
		- 변수 또는 리터럴의 타입을 다른 타입으로 변환하는 것이다.
		- 작성방법
			(타입)피연산자
		- 변수 리터럴 합쳐서 피연산자라고 부른다
		- 캐스트 연산자->(int)
		- 안전하게 오버플로우 발생할 현상 없으면 캐스트연산자 생략이 가능하다
		
		
		*/
		
		//1. 변수 power를 선언하고 true의 값으로 초기화 하여라.(어떤 값을 저장하냐에 따라 맨 앞 변수타입을 결정하는 것)
		
		boolean power = true;
		
		
		//2. 자신의 성을 변수 sung에 저장해주세요
		char sung = 'A';
		char sung1 = 65;
		
		char sung2 = '\u0041';
		
		System.out.println(sung);
		
		//3. 변수 b2에 50의 값을 저장해주세요
		
		byte b2 = 50;
		
		//4. 변수 s2에 32000의 값을 저장해주세요
		
		short s2 = 32000;
		
		//5. 변수 i2에 40만의 값을 저장해주세요
		
		int i2 = 400000;
				
		//6. 변수 l2에 100억의 값을 저장해주세요
		
		long l2 = 100000000000L;
		
		
		//1. float타입형 변수 f1에 3.139273928703의 값을 저장해주세요
		float f1 = 3.139273928703F;
		//기본이 더블이라 안된다고 오류남 그러니까 뒤에 대문자 F 붙이기
		
		//2. double타입형 변수 d1에 3.139273928703의 값을 저장해주세요
		double d1 = 3.139273928703;
				
		System.out.println(f1); 
		System.out.println(d1);
		
		
		//9.
		String name = null;
		
		System.out.println(name);
		
		int i3 = 20;
		String str = "3";
		
		//기본형과 참조형 더하기
		
		String result = i3 + str;//int + String =>무조건 큰 범위 가진것으로 바뀐다 String은 범위가 무제한 =>String + String => String
		//오른쪽 결과에 따라서 왼쪽 타입이 결정된다
		//20 + "3"   => "20" + "3"=>"203"
		
		System.out.println(i3 + str);
		
		//10.
		
		byte b3 = 126;
		
		System.out.println(b3);
		
		
		b3++;
		System.out.println(b3);
		//b3의 값을 하나 늘린다(?)
		
		b3++;
		System.out.println(b3);
		
		//11.
		char c ='a';
		int ii = (int)c;
		
		
		System.out.println(ii);
		
		byte bb = (byte)ii;
		
	
	
		
	}		
}
