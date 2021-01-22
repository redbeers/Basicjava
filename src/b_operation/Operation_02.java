package b_operation;

public class Operation_02 {
	public static void main(String[] args){
		/* 
		 * 1. 증감연산자( ++, --)
		 * -증감연산자(++) : 피연산자의 값을 1 증가시킨다.
		 * -감소연산자(--) : 피연산자의 값을 1 감소시킨다.
		 * 
		 */
		int i = 3;
		i++;
		System.out.println(i);
		i++;
		System.out.println(i);
		
		//1. 변수 c 에 'A'를 저장해주세요
		
		char c = 'A';
		c++; 
		System.out.println(c);
		
		int i1 =5;
		int i2 = 10;
		
		int i3 = ++i1 + 12;
		System.out.println("i3 : "+i3);
		System.out.println("i1 : "+i1);
		
		//문제 2-6
		int number = 30;
		char ch = 'C';
		int resut = number++ + 3 + ++ch + ++number;
		System.out.println("number :" + number);
		System.out.println("ch : " + ch);
		System.out.println("resut :" + resut);
		
		/*
		 * 2.부호연산자 (-,+)
		 * -boolean과 char 형에는 사용할 수 없다.
		 * 
		 * 3.비트전환 연산자(~)
		 * -boolean형과 실수형에는 사용할 수 없다.
		 * -컴퓨터가 알아듣는 음수에 가장많이 사용
		 * -피연산자를 2진수로 표현하였을때 (0은 1로 1은 0으로 바꾼다).
		 * 10 : 0 0 0 0 1 0 1 0
		 * ~10 : 11110101(-11, 10의 1의 보수)
		 * ~10+1 : 11110110(-10, 10의 2의 보수) 
		 * ~를 사용하면 int형식으로 변한다.
		 */
		int i4 = 10;
		System.out.println(~i4+1);
		
		/*
		 * 4.논리부정 연산자(!)
		 * -boolean형에만 사용 가능하다
		 * -true > false, fals > true
		 *  
		 */
		//1. 변수 power를 false의 값으로 초기화 하여라
		boolean power = false; 
		//2.power의 값을 부정하여 power에 저장하여라.
		power = !power;
		System.out.println(!!!power);
		
		
		
		
		
		
		
		
		
		
		
	}
}
