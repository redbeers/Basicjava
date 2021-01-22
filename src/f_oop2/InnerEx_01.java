package f_oop2;

public class InnerEx_01 {
	public static void main(String[] args) {
		
		
		System.out.println(InnerEx_01.StaticInner.cv);
		
		InnerEx_01.StaticInner sc = new InnerEx_01.StaticInner();
		
		InnerEx_01 ie = new InnerEx_01();
		
		InnerEx_01.InstanceInner ii = ie.new InstanceInner();
		int i = ii.iv;
		System.out.println(i);
		
	}

	
	static class StaticInner{//static클래스
		//밖에 클래스 . 해야 여기로 올 수 있다
		int iv = 200;
		static int cv = 300;
		
		
	}
	
	class InstanceInner{//인스턴스클래스
		int iv = 50;
		//static int cv = 50;
		//클래스 멤버 사용 불가  하지만 상수는 쓸 수 있다
	}
	
	void method(){
		class LocalInner{
			//static int iv = 60; 사용불가
		}
	}
	
	
	
	
	
	
	
	
}
