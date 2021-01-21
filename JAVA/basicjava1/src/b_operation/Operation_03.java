package b_operation;

public class Operation_03 {
	public static void main(String[] arge){
		/*
		 * 1.산술연산자
		 * -사칙연산자(+,-,*,/), 나머지연산자(%), 쉬프트연산자(<<, >>, >>>)
		 * 	피연산자를 두개를 필요로 하기 때문에 이항연산자로 불린다.
		 * 
		 * 2.사칙연산자 (+,-,*,/)
		 * -두 개의 파연산자중 자료형의 표현범위가 큰 쪽에 맞춰서 형변환 후 연산을 수행한다
		 * 	:int + float => float + float => float =>double
		 * -두 개의 피연산자 모두 4byte보다 크기가 작을때는 둘다 4byte인(int)으로 형변환 후 연산을 수행한다.
		 *  :byet + char => int + int => int
		 *  0으로 나누는 것은 금지되어 있다.
		 */
		byte b1 = 80;
		byte b2 = 100;
		long lo1 = 642L;
		long result = lo1 + b1;
		System.out.println(result);
		int result2 = b1 + b2;
		System.out.println(result2);
		byte result3 = (byte)(b1+b2);
		System.out.println(result3);
		long lo2 = (long)60000*80000;
		System.out.println(lo2);
		
		/*
		 * 3.나머지 연산자(%)
		 * -왼쪽의 피연산자를 오른쪽의 피연산자로나누고난 나머지 값을 돌려준다.
		 * -boolean형에는 사용 못 한다.
		 * 
		 */
		int num1= 10;
		int num2= 8;
		
		//몫
		double share = num1 / num2;
		int remain = num1 % num2;
		
		//xx를xx로 나눈 몫은 xx이고 나머지는 xx이다.
		System.out.println(num1 + "를 " + num2 + "로" + "나눈 몫은" + share + "이고 나머지는" + remain + "이다.");
		
		
		/*
		 * 4.쉬프트 연산자(<<, >>, >>>)
		 * -정수형 변수에만 사용할 수 있다.
		 * -연산속도가 매우 빠르기 때문에 사용한다.
		 * x << n : x * 2^n(10<<2는 <<는 00001010일경우 00101000이된다. n*2에 n승
		 * x >> n : x / 2^n(10>>2는 >>는 00001010일경우 00000010이된다. n/2에 n승
		 * byte일경우10<<8이면 10이다.
		 * int일경우 10<<32이면10이다.
		 * 
		 */
		int i4 = 10;
		int result4 = i4 << 4;
		System.out.println("i4<<4 : " + result4);
		System.out.println("i4>>2 : " + (i4 >> 2));
		
		/*
		 * 5.비교연산자
		 * -구 개의 변수 또는 리터럴을 비교하는데 사용된다.
		 * -boolean 주로 조건문과 반복문의 조건식에 사용되며 연산결과는 true, false의 값을 가진다.
		 * -이한 연산자 이다.
		 * 
		 * 6.대소비교연산자(<, >, <=, >=)
		 * -기본형중에서 boolean을 제외한 나머지 지료형에 사용된다.
		 * 
		 * 7.등가비교연산자(==, !=)
		 * -모든 자료형에 사용가능
		 * 
		 * 수식        |  연산결과
		 * x > y  | x가y보다 클때만 true, 그 외에는 false
		 * x < y  | x가y보다 작을때만 true, 그 외에는 false
		 * x >= y | x가y보다 크거나 같을때만 true, 그 외에는 false
		 * x <= y | x가y보다 작거나 같을때만 true, 그 외에는 false
		 * x == y | x가y보다 같을때만 true, 그 외에는 false
		 * x != y | x가y보다 같을때만 true, 그 외에는 false
		 *  
		 */
		
		boolean result6 = 5 < 10;
		System.out.println(result6);
		System.out.println(10 == 10.0f);//int == float > float == float > true
		System.out.println('0' == 0);
		System.out.println(0.1 == 0.1f); //double과 float은 표현하는 방법이다르다 
		System.out.println(0.5 == 0.5f); // 2^n 
		
		/*
		 * 8.비트연산자(&, | ^)
		 * -이진 비트연산을 수형
		 * -실수형을 제위한 모든 기본형에 사용할수 있다.
		 * 
		 * | (OR연산) : 한쪽만 1이면 1이다 (이진수로 변환후 계산)
		 * & (AND연산) : 둘다 1이여야 1이다 (이진수로 변환후 계산)
		 * ^ (XOR연산) : 둘이 다르면 1이다 (이진수로 변환후 계산)
		 * 
		 * 3 ->   00000011
		 * 5 ->   00000101
		 *  
		 * 3|5 -> 00000111
		 * 3&5 -> 00000001
		 * 3^5 -> 00000110
		 * 
		 */
		
		/*
		 * 9.논리연산자(&&, ||)
		 * -피연산자로 boolean형 값 또는 boolean형을 결과로 하는 조건식을 허용한다.
		 * -||연산이 &&보다  연산우선순위가 낮다.
		 * 
		 * || (RO결합) :한쪽만 true 면 true의 결과
		 * && (AND결합) : 양쪽모두 true면 true의 결과
		 * 
		 */
		
		int input = 17;
		
		boolean result1 = 3 < input && input <=15;
		System.out.println(result1);
		
		//1.변수 ch01을 선언하고 원하는 문자로 포기화 하여라
		char ch01 = 'A';
		//2.변수 ch01의 값이 영어 대문자이 때 True 인 조건식을 작성 하여라
		boolean t1 = ch01 <= 'A' && ch01 <= 'Z';
		//3.변수 ch01의 값이 영어 소문자일 때 true인 조건식을 작성 하여라
		boolean t2 = ch01 <= 'a' && ch01 <= 'z';
		//4.변수 ch01의 값이 영문자일 때 true인 조건식을 작성 하여라
		boolean t3 = ch01 <= 'A' && ch01 <= 'Z'|| ch01 <= 'a' && ch01 <= 'z';
		//5.변수 ch01의 값이 ASCLL값 숫자 때 true인 조건식을 작성 하여라
		boolean t4 = ch01 <= '0' && ch01 <= '9';
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		
		//6변수ch01의 값이 영문자 또는 숫자일때 true조건식을 작성하여라
		//대소문자 || 소문자 || 숫자
		boolean t5 =t3 = ch01 <= 'A' && ch01 <= 'Z'|| ch01 <= 'a' && ch01 <= 'z'|| ch01 <= '0' && ch01 <= '9';
		System.out.println(t5);
	}
}
