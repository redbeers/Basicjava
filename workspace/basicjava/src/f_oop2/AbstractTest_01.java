package f_oop2;

public class AbstractTest_01 {
	public static void main(String[] args) {
	
		
		
		
		
		
		
		
	}
}

abstract class Unit{
	
	int x;
	int y;
	
	
	abstract void move(int x, int y);
	
//	void move(int x, int y){//모든 유닛은 move라는 기능을 가지고 있어야 하지만 하지만 방식이 다름 어떤애는 뛰고 날고 하니까
// 사용하는 방식이 다 다름
//		this.x = x;
//		this.y = y;
//	}
//	
	
	void stop(){
		
	}
	
	
	
}







class Marine extends Unit{

	void stimPack(){
		
	}
	
	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}
}




class Tank extends Unit{
	
	void changeMode(){
		
	}	
	
	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}//부모 꺼있긴하지만 자식께 우선이고 자식꺼에서 move라는 메서드 구현해놨으니까 추상클래스일 필요가 없는것
}

abstract class DropShip extends Unit{
	
	void load(){
		
	}
	
	void unload(){
		
	}
	
	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}
	
}








