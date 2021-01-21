package aaa;

class Car { 
	String color; // 색상
	String gearType; // 변속종류
	int door; // 문의 개수

Car() {
	//color = "black";
	//gearType = "stick";
	//door =4; 
	this("black", "stick",4); // this()이 이용하여 위의 3줄을 한줄로 변경 가능
}
Car(String color){ 
	this(); 
	this.color = color; 
	}

Car(String color, String gearType, int door) {
	 this.color = color; 
	 this.gearType = gearType; 
	 this.door =door; 
	 } 
}
public class Ex_10 {

	public static void main(String[] args) {
		Car c1 = new Car(); // 기본차량
		Car c2 = new Car("red"); // 색상을 red로 변경한 차량
		Car c3 = new Car("blue","auto",2); // 색상을 blue, 기어를 auto, 문은 2개인 차량
		System.out.println("기본차량");
		System.out.println("\t차량색상 : " + c1.color + ", 기어타입 : " + c1. gearType + ", 문의 개수 : " + c1.door); 
		System.out.println("색상변경 차량");
		System.out.println("\t차량색상 : " + c2.color + ", 기어타입 : " + c2. gearType + ", 문의 개수 : " + c2.door);
		System.out.println("풀옵션 차량");
		System.out.println("\t차량색상 : " + c3.color + ", 기어타입 : " + c3. gearType + ", 문의 개수 : " + c3.door);

	}

}
