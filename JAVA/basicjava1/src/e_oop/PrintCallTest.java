package e_oop;

public class PrintCallTest {

	public static void main(String[] args) {
		//7. 3번의 add메서드를 호출하여라.
		int result1 = MyAdd.add(10);
		System.out.println(result1);
		//8. 4번의 add메서드를 호출하여라.
		MyAdd ma = new MyAdd();
		int result2 = ma.add(12, 10);//인자값을 타입별로 써주어야한다.
		System.out.println(result2);
		//9. 5번의 add메서드를 호출하여라.
		long result3 = ma.add(1, 1L);//오버로딩의 조건은 매개변수의 타입또는 개수가 달라야하는데 2번add에 이미 동일한 메서드가 존제한다.
		System.out.println(result3);
		//오버로딩 저건
		//-조건`
		// 	메서드이름 동일
		// 	메개변수의 개수또는 타입이 달라야 한다.
		// 	반환타입은 상관없다.
		//10. 6번의 add메서드를 호출하여라
		float result4 = ma.add('a', 2f);
		System.out.println(result4);

	}

}
class MyAdd { 
	//1. 클래스변수 a를 선언하고 20의 값으로 초기화 하여라.
	 static int a = 20;
	//2. 인스턴스변수 b를 선언하고 15의 값으로 초기화 하여라.
	 int b = 15;
	//3. int타입의 매개변수가 하나이며 변수 a와 합을 반환하는 클래스메서드를 add를 작성	
	// 하여라.
	static int add(int a1){
		int result = a + a1;
		return result;
	}
	//4. int타입의 매개변수가 두개이고 매개변수의 합을 반환하는 인스턴스메서드를 add를
	// 작성 하여라.
	int add(int x, int y){
		int result = x+y;
		return result;
	}
	//5. int타입, long타입 각 한 개의 매개변수, 매개변수의 합을 반환하는 인스턴스
	// 메서드 add를 작성 하여라.
	long add(int x, long y){
		long result = x + (long)y;
		return result;
	}
	//6 char타입, float타입 각 한 개의 매개변수, 매개변수의 합을 반환하는 인스턴스
	// 메서드 add를 작성 하여라.
	float add(char x, float y){
		float result = x + y;//char와float은 타입이 달라서 더큰 타입으로 넣어준다.
		return result;
	}
	
	//추가문제
	//7. int타입의 매개변수가 두개이고 매개변수의 합을 반환하는 반환 타입이 long인
	//인스턴스메서드를 add를 작성
	//오버로딩 저건
	//-조건
	// 	메서드이름 동일
	// 	메개변수의 개수또는 타입이 달라야 한다.
	// 	반환타입은 상관없다.
//	long add(int x, int y){//메개변수의 개수 또는 타입이 달라야한다
//		int result = x+y;//하지만 메개변수의 개수와 타입이 동일한 메개변수가 존재한다.
//		return result;
//	}
	//8. int, long, float타입 각 한개의 매개변수, 매개변수의 합을 반환하는
	//클래스메서드 add를 작성
	float add(int x,long y,float z){//타입중 가장 큰 타입으로 저장해준다.
		float result = x + y + z;//오버로딩을 하기위해서 클래스 메서드가 아닌 인스턴스 메서드로 사용한다.
		return result;
	}
}
