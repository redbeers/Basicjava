package e_oop;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Init it = new Init(50);
		//명시적 초기화 => 인스턴스 초기화블럭=> 생성자를 지용하 초기화
		
		System.out.println(Init.action);//명시적 초기화 > 클래스 초기화블럭
	}

}
class Init{
	static int action;
	int action2=11; //명시적 초기화라한다.
	
	static{
		action = 60;
	}
	{
		action2=90;
	}
	
	Init(int action2){
		this.action2 = action2;
	}
}