package aaa;

class Init { 
	static int action; 
	int action2 = 5;
	
	static {// 클래스 초기화 블럭
		action = 4; 
	}

	{ // 인스턴스 초기화 블럭
	action2 = 4; 
	}
	
	Init(){ 
		action2 = 7; 
	}
	
	Init(int action2){ 
		this(); 
		this.action2 = action2; 
	}
}

public class Ex3_11 {

	public static void main(String[] args) {
		
		Init init = new Init(9);
		System.out.println(init.action2);

	}

}
