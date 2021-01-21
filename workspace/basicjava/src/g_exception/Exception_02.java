package g_exception;

public class Exception_02 {

	public static void main(String[] args) {
		int mumber = 100;
		int result = 0;
		
		for (int i = 0; i < 10; i++) {
			try{
			result = mumber/(int)(Math.random()*5);
			System.out.println(result);
			}catch(ArithmeticException e){
				System.out.println("0으로 나누지마라");
			}
		}

	}

}
