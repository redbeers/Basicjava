package f_oop;

public class InstanseofTest_01 {

	public static void main(String[] args) {
		
		FireCar fc = new FireCar();
		
		if(fc instanceof FireCar){
			System.err.println("fc는 FireCar의 인스턴스를 포함한다.");
		
			FireCar ff = fc;
			
		}

		if(fc instanceof Car){
			System.out.println("fc는 Car의 인스턴스이다.");
			Car c = fc;
		}
		
		if(fc instanceof Object){
			System.out.println("fc 는 Object는 인스턴스이다.");
			
			
		}
		
		Car c = new Car();
		
		if(c instanceof FireCar){
			System.out.println("c는 FireCar의 인스턴스이다.");
			FireCar ff = (FireCar)c;//문법적으로는 문제없지만 형변환이 불가능하다.
		}
		
		Car cc = new FireCar();
		System.out.println(cc.a);
		System.out.println(cc.b);
		cc.stop();
		cc.drive();
	}

}
class Car{
	static int a =20;
	int b=30;
	static void stop(){
		System.out.println("끼익");
	}
	
	
	void drive(){
		System.out.println("부욱!!!!");
	}
}
class FireCar extends Car{
	static int a =50;
	int b=70;

	static void stop(){
		System.out.println("소방차끼익");
	}
	
	@Override
	void drive(){
		System.out.println("소방차부욱!!!!");
	}
	
}