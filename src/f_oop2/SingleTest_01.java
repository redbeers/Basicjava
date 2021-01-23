package f_oop2;

public class SingleTest_01 {
	public static void main(String[] args) {
		Singleton st1 = Singleton.getInstance();
		Singleton st2 = Singleton.getInstance();
		
		System.out.println(st1);
		System.out.println(st2);
		//객체를 얻어오고 싶은데 만들 수는 없다
		
	}

}



class Singleton{
	static Singleton st;
	
	private Singleton() {
	
	}
	/**
	얘 객체를 넘겨주는 메서드 SingleTon의 객체를 반환하기 위한 메서드
	@return Singleton의 객체
	@since 2021.01.14
	@author min
	**/
	
	
	
	
	static Singleton getInstance(){
		if(st == null){
			st = new Singleton();
		}
		
		st = new Singleton();
		return st;
	}
}