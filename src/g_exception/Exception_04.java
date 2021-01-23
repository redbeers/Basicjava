package g_exception;

public class Exception_04 {

	public static void main(String[] args) {

		Exception ee = new Exception("선생님때문이야~~~");
		try{	
			
			throw ee;
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("프로그램 종");

		RuntimeException run = new RuntimeException("😎");
		
		try{
			throw run;			
		}catch(RuntimeException e){
			e.printStackTrace();
		}
		//컴파일러가 예외처리를 강제하지 않는 경우
		//1.에러의 경우 
		//2. RuntimeException클래스들
		//이런 것들을 'unchecked예외' 라고 한다.
	}
}
