package e_oop;

public class MyMathtest {
	
	public static void main(String[] args) {
		//8
		MethodTest.add01();
		//9
//		
		int  result = MethodTest.add02(10);
		
		//10
		MethodTest mt = new MethodTest();
		mt.add03(11);//11은 인자값
		//11
		mt.add04();
	}

}
class MethodTest{
	static int a = 10;//1
	static int b = 20;//2
	int c = 50;//3
	
//	반환타입 메서드명(입력받는값 변수타입 변수명....){=>매개변수
//	  		//처리
//	  		//retrun 값;
//	}
//	4 클래스변수a와 b의 합을 출력하는 클래스메서드 add01를 구현하여라
	static void add01(){
		int sum = a + b;
		System.out.println(sum);
	}
//	5
	static int add02(int c){
		int sum=a + b + c;
		return sum;
	}
//	6  인스턴스 변수일때 this.변수 를한다.
	int add03(int c){
		int sum = this.c + c;
		return sum;
	}
	
//	7 
	void add04(){
		int sum = this.c + (int)(Math.random()*100);
		System.out.println(sum);
	}
	
	
}