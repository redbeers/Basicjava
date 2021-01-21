package f_oop2;

public class OverTest {
	public static void main(String[] args) {
		OverGo og = new OverGo();//내가 만든 객체에 밖에 접근 할 수 있다
		String result = og.upMethod();//객체의 주인 자식것이 우선! 오버라이드가 되면 부모건 거의 사용 안한다
		System.out.println(result);
		
		//오버업메서드가 출력되게 만들어라 og.뭐를 해서든 자식것이 아니라 부모것이 찍히게 만들어라 
		String result1 = og.upMethod01();
		System.out.println(result1);
		
		
	}

}

class OverUp{
	
	String upMethod(){
		return "OverUpMethod";
	}
	
	
}

class OverGo extends OverUp{
	
	String upMethod01(){
		return super.upMethod();
	}
	
	@Override
	String upMethod(){
		return "OverGoMethod";
	}
	
	String upMethod(int a){
		return a+"OverGo";
	}
	
	
}