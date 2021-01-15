package aaa;

class Ex3_2 { 
	
	public static void main(String[] args) {
		
	
		Tv t; // Tv인스턴스를 참조하기 위한 변수 t를 선언
		t = new Tv(); // Tv인스턴스를 생성 후 참조변수 t에 저장
		t.channel = 7; // Tv인스턴스의 멤버변수 channel의 값을 7로 변경
		t.channelDown(); // Tv인스턴스의 메서드 channelDown()를 호출
		System.out.println("현제 채널은 " + t.channel + "입니다."); 
		}
}
class Tv{
	int channel = 0;
	void channelDown(){
		channel --;
	}
}