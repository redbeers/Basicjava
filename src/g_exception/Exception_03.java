package g_exception;

public class Exception_03 {

	public static void main(String[] args) {
		int a=3;
		int b=0;
		
		System.out.println(a);
		try{
			System.out.println(a/b);//문제가 생기는 부분만 try catch에 넣어준다.
			System.out.println(b);
		}catch(ArithmeticException e){
//			e.printStackTrace();//에러 전부를 알려준다.
			 System.out.println(e.getMessage());//에러 이유만 나온다.
		}catch (Exception e) {
			
		}
		System.out.println("완료");

	}

}
