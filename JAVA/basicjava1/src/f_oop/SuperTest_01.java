package f_oop;

public class SuperTest_01 {

	public static void main(String[] args) {
		Child2 cc = new Child2();
		System.out.println(cc.getAdd());
	}

}


class Parent2{
	int x = 10;
	int y = 20;
	
	int getAdd(){
		return x+y;
	}
}

class Child2 extends Parent2{
	int x=30;
	int z=40;
	
	@Override
	int getAdd(){
		
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
		
		
		return super.getAdd();
	}
}