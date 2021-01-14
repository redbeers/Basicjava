package b_operation;

import java.util.Scanner;

public class Operation_04 {
	public static void main(String[] args){
		
		/*
		 * 1. 삼항연산자
		 * -세 개의 피연산자를 필요로 하기 때문에 삼항 연산자 하고 한다.
		 * -삼항연산자의 조건식에는 연산결과가 true 또는 false인 식이 사용어야 한다.
		 * -기본구조
		 * (조건식)? 식1 : 식2
		 */
		
		int x = 10;
		int absx= x > 0 ? x : -x;
		//1. 변수 k를 선언하고 50의 값으로 초기화 하여라
		int k = 50;
		//2. 변수 k의 값이 0보다 크면 "양수", 0보다 작으면 "음수", 0이면 "0"의 결과를 re에 저장해주세요
		String re = k > 0 ? "양수" : k < 0 ? "음수" : "0";
		System.out.println(re);
		
		/*
		 * 2.대입연산자 (=, op=)
		 * -변수에 값 또는 수식의 연산결과를 정장하는데 사용한다.
		 * -연산우선 순위가 가장 낮다.
		 * 
		 */
		int i =0;
		i +=3;
		System.out.println(i);
		
		char c = 'A';
		//c = (char)(c + 3);
		c += 3;//op= op연산자
		System.out.println(c);
		
		//1.반올림 
		// d = (int)(평균*자릿수)/처음자릴수;반올림 안하면
		// d = (int)(평균*자릿수+0.5)/처음자릴수;반올림할때
		
		float  f = 3.1415f;
		float  r = (int)(f*1000+0.5)/1000f;
		System.out.println(r);
		// (int)(n*100+0.5)/100 소숫점 2째자리까지 반올립하는 식
		//1.f * 1000 > 3141.5
		//2.+0.5	 > 3142.0...
		//3.(int)    > 3142
		//4./1000f   > 3.142
		//소숫점 자리를 반올림하고자하는 단위까지 내리기위해 자릿수만큼 곱을한후 반올림을위해 0.5를 더해준 후 다시 처음 소숫점자리를 곱한 자릿수를 위해 나누어준다
		
		//2.Math.random()
		// 형식 > 변수타입 변수명 = (리터럴타입)(Math.random()*포함하는범위+시작하는수);
		// 포함범위 구하기 = 시작범위-끝나는범위
		//주사위 1~6
		int dice = (int)(Math.random()*6+1);
		System.out.println(dice);
		//1~24사이의 임의의 정수값
		int dclass = (int)(Math.random()*25+1);
		System.out.println(dclass);
		int xrandom = (int)(Math.random()*232+43);
		boolean xb = xrandom < 100 ? true : false;
		System.out.println(xb);
		
		
		
		//3.사용자로부터 입력받기
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("첫번째 문자 입력해");
//		String input = sc.next();
//		System.out.println("두번때 문자입력해");
//		String input2 = sc.next();
//		System.out.println(input + input2);
		System.out.println("첫번째 숫자 입력해주세요 : ");
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자 입력해주세요 : ");
		int num2 = sc.nextInt();
		
		System.out.println("두수의 합계는 " +(num1+num2));
		
		
	}
}
