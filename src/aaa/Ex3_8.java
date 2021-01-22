package aaa;

public class Ex3_8 {

	public static void main(String[] args) {
		MyAdd.add(10);
		
		MyAdd ma = new MyAdd();
		ma.add(10, 10);
		ma.add(10, 10L);
		System.out.println(ma.add('a', 10f));
		

	}

}
class MyAdd{
	static int a = 20;
	int b = 15;
	
	static int add(int x){
		int result = a+x;
		return result;
	}
	
	int add(int x, int y){
		int result = x+y;
		return result;
	}
	long add(int x, long y){
		long result = (long)x+y;
		return result;
	}
	float add(char x, float y){
		float result = (float)x+y;
		return result;
	}
	
}