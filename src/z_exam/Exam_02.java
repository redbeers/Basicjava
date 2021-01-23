package z_exam;

public class Exam_02 {
	public static void main(String[] args) {
	
		
	/*
	2-1. 다음 표의 빈 칸에 8개의 기본형을 알맞은 자리에 넣으시오
	
		논리형-boolean(1byte)
		문자형-char(2byte)
		정수형-byte(1byte) short(2byte) int(4byte) long(8byte)
		실수형-float(4byte) double(8byte)
	
	2-2. 다음의 문장에서 리터럴, 변수 상수, 키워드를 적으시오
	
		리터럴 : 100, 100, 3.14
		변수 : i, l
		키워드 : int, long, final, float
		상수 : PI
		
	
	2-3. 다음 중 기본형이 아닌 것은?
	
		2.Byte(대소문자를 구분하기 때문에 byte로 되어야 한다)
		
	2-4. 다음 문장들의 출력결과를 적으세요. 오류가 있는 문장의 경우
		System.out.println("1"+"2"); // String + String => String "12"
		System.out.println(true + "");
		System.out.println('A'+'B'); //char +char =>int +int->int 
									// 'A'+'B' => 65 +66->131
		System.out.println('1'+2); //'1'은 int로 49 
		System.out.println('1'+'2'); // '2'는 int로 50
		System.out.println(4+24.3715F);
		System.out.println('A'+ 3.14);
		System.out.println('J' + "ava");
		System.out.println(true + null);
		
		
	
	2-5. 다음 중 키워드가 아닌 것은?(모두 고르시오)
		키워드->이클립스에서 보라색으로 표시되는 문자
		
		답 : True, NULL, Class, System
	
	2-6. 다음 중 변수의 이름으로 사용할 수 있는 것은?(모두 고르시오)
	
		1. $ystem
		5. 자바
		6. new
		7. $MAX_NUM
	
	2-7. 참조형 변수와 같은 크기의 기본형은?(모두 고르시오)
	
		1. int 4. float
		
	2-8. 다음 중 형변환을 생략할 수 있는 것은?
	
		답 : 2. 4.
		
		1. i는 int int가 더 크니까 byte 써야함
		2. b는 byte byte가 더 작으니까 생략가능
		3. ch는 char short와 크기는 같지만 short는 부호 한칸이 있기 때문에 자동형변환 불가 short 써야함
		4. long은 정수형 float은 실수형이므로 무조건 크기때문에 생략가능
		5. char는 int보다 작기때문에 생략가능
		
	2-9. char타입 변수에 저장될 수 있는 정수 값의 범위는?
		
		0~2의 15제곱 -1(65,535)
		
	2-10. 다음 중 변수를 잘못 초기화 한 것은?(모두)
	
		답 : 1. 2. 3. 4.
		
		1. 바이트는 -128~127까지
		2. 문자리터럴은 싱글쿼터안에 반드시 하나의 문자 있어야한다
		3. char변수 타입은 문자 하나만 가능
		4. float은 실수 기본형이 아니므로 뒤에 F가 나와야 하고 세미콜론도 필요하다
		5. 가능
	
	*/
		
		System.out.println("1"+"2"); 
		System.out.println(true + "");
		System.out.println('A'+'B'); 
		System.out.println('1'+2);
		System.out.println('1'+'2');
		System.out.println(4+24.3715F);
		System.out.println('A'+ 3.14);
		System.out.println('J' + "ava");
		//System.out.println(true + null);
		
		
	}
}
