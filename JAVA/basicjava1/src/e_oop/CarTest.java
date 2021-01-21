package e_oop;

public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car();//인스턴스화여기까지가 생성자->클래스명();
//		c1.color = "black";
//		c1.gearType = "stick";
//		c1.door=4;
		Car c2 = new Car("white","auto",2);//특별한 값을 넣을때
		Car c3 = new Car("auto");
		Car c4 = new Car("red","auto");
		System.out.println(c3.color);
		System.out.println(c3.gearType);
		System.out.println(c3.door);
		
	}

}
class Car{
	String color;
	String gearType;
	int door;
	
	Car(){//기본생성자는 인스턴스화
		color="red";
		gearType="stick";
		door=4;
	}
	
	Car(String color, String gearType, int door){
		this.color = color;//this는 인스턴스 변수다라고 표시
		this.gearType = gearType;
		this.door = door;
		
	}
	
	Car(String gearType){
		this();//생성자 내에서 다른 생성자를 불러올때 사용한다.이건 생성자의 첫줄에만 사용가능하다
		 this.gearType = gearType;
	}
	Car(String color, String gearType){//특별한 메서드
		this();//기본 세팅을 한다.
		this.color = color;
		this.gearType = gearType;
	}
//	Car(String color2){//생성자가 없다면 자동 생성한다.기본생성자 반환타입이 없는 것이 생성자다
//		
//	}
}