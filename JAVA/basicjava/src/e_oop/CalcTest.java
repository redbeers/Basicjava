package e_oop;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		
		//계산기 만들기
		//히든 > a값 부호 b값 = ab값 , 부호 ab값, c를 쓰면 초기화, a값 부호 b값 = ab값 
		
		//5 사용자로부터 정수를 입력 받아 변수 firstNum에 저장
		Scanner sc = new Scanner(System.in);
		int firstNum;
		//6 사용자로부터 부호를 입력 받아 변수 buho에저장
		String buho;
		//7 사용자로부터 정수를 입력 받아 변수 secondNum에 저장
		int secondNum;
		//8 buho에 저장된 값이 +이면 add메서드 -이면substract메서드
		// *이면multiply메서드 /이면divide메서드를 호출하고 결과를 출력하여라
		// 단 buho의 저장된 값이 위의 4가지 경우가 아니면 연산종료를 출력
		Calc ca = new Calc();
		
		while(true){
			
			System.out.print("정수입력");
			firstNum=sc.nextInt();
			while(true){
				System.out.print("부호입력");
				buho=sc.next();
				System.out.print("정수입력");
				secondNum=sc.nextInt();
				if(buho.equals("+")){
					int result = ca.add(firstNum, secondNum);
					System.out.println(firstNum + " " + buho + " " + secondNum);
					firstNum = result;
					System.out.println(result);
				}else if(buho.equals("-")){
					int result = ca.substract(firstNum, secondNum);
					System.out.println(firstNum + " " + buho + " " + secondNum);
					firstNum = result;
					System.out.println(result);
				}else if(buho.equals("*")){
					long result = ca.multiply(firstNum, secondNum);
					System.out.println(firstNum + " " + buho + " " + secondNum);
					firstNum = (int)result;
					System.out.println(result);
				}else if(buho.equals("/")){
					float result = ca.divide(firstNum, secondNum);
					System.out.println(firstNum + " " + buho + " " + secondNum);
					firstNum = (int)result;
					System.out.println(result);
				}else{
					System.out.println("연산종료");
					break;
				
				}
				
			}
			
		}
		
	}

}

class Calc{
	//1 두 개의 int타입 입력받아 두 인자의 합의 결과를 반화하는 인스턴스메서드 add를 구현
	int add(int a, int b){
		int result1 = a+b;
		return result1;
	}
	//2 두 개의 int타입 입력받아 앞의 인자에서 뒤의 인자를 뺀결과를 반환하는 인스턴스메서드 substract를 구현
	int substract(int a, int b){
		int result2 = a - b;
		return result2;
	}
	//3 두 개의 int타입 입력받아 두 인자의 곱의 결과를 반환하는 인스턴스메서드 multiply를 구현
	long multiply(int a, int b){
		long temp = (long)a * b;
		if (temp < Integer.MIN_VALUE || Integer.MAX_VALUE < temp){
			System.out.println("범위 초과");
			System.exit(0);
		}
		int result3 = a*b;
		return result3;
	}
	//4 두 개의 int타입 입력받아 앞의 안자를 뒤의 인자로 뒤의 인자로 나누기한 결과를 반화하는 인스턴스메서드divide를 구현 하여라
	//단 결과는 소수점 두 번째 자리에서 반올립하여 첫 번째 자리까지 표현 
	float divide(int a, int b){
		float result4 = (int)((float)a/b*10+0.5)/10f;
		return result4;
	}
}