package f_oop;

public class OverTest {

	public static void main(String[] args) {
		OverGo ov = new OverGo();
		String resutl=ov.upMethod();

		System.out.println(resutl);
		
		
		
		
		//부모에있는 OverUpMethod가 나오게해라
		String result2 = ov.upMethod1();
		System.out.println(result2);

	}

}

class OverUP{
	
	
	String upMethod(){
		return "OverUpMethod";
	}
	
	
}

class OverGo extends OverUP{
	
	String upMethod1(){
		return super.upMethod();
	}
	@Override
	String upMethod(){
		
		return "OverGoMeethod";
	}
	String upMethod(int a){
		return a+"OverGo";
	}
}