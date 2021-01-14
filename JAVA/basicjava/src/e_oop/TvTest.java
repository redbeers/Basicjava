package e_oop;

public class TvTest {
	public static void main(String[] args) {
		//클래스 변수 : 클래스명,변수명(클래스변수, 클래스메서드)
		System.out.println(Tv.color);
		
		//red로 변경
		Tv.color = "red";
		System.out.println(Tv.color);
		//기본값으로 불러오기
		Tv.changeColor();
		System.out.println(Tv.color);
		
		Tv t = new Tv();//참조형 타입 지역변수(참조변수t) new는 인스턴스화> 인스턴스생성 (Tv클래스의 객체생성)
		//tv타입의 참조변수 지역변수
		//인스턴스 친구들 접근
		//참조변수명.변수명 (출력방법)
		System.out.println(t.power);
		t.power();
		System.out.println(t.power);
		
		//1. Tv의 채널을 15번으로 바꿔주세요
		t.channel = 15;
		//2. Tv의 채널을 하나 증가시켜주세요
		t.changeUP();
		System.out.println(t.channel);
	}
}

class Tv{
	//맴버변수 전역변수 이다. 클래
	//맴버변수에는 클래스변수, 인스턴수변수있다.
	static String color;//색상 맴버변수 (null)기본값 > 클래스변수
	
	boolean power;//전원 (거짓이) 기본값 >인스턴스변수
	
	int channel;//채널 (0)이기본값 >인스턴스변수
	
	//클래스 메서드 static붙으면
	static void changeColor(){
		color = "black";
	}
	//인스턴스 메서드 static않붙으면
	void power(){
		power = !power;
	}
	void changeUP(){
		channel++;
	}
	
}