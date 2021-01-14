package aaa;

public class Qu3_3 {

	public static void main(String[] args) {
		MethodTest.add01();
		MethodTest.add02(10);
		MethodTest tm = new MethodTest();
		tm.add03(10);
		tm.add04();

	}

}
class MethodTest {
	static int a = 10;
	static int b = 10;
	int c = 50;
	
	static void add01(){
		int result = a+b;
		System.out.println(result);
	}
	
	static int add02(int c){
		int result = a + b + c;
		return result;
	}
	int add03(int c){
		int result = this.c + c;
		return result;
	}
	
	void add04(){
		int result = c+(int)(Math.random()*100);
		System.out.println(result);
	}
	

}