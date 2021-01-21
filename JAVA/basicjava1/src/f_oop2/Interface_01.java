package f_oop2;

public class Interface_01 {
	public static void main(String[] args) {
		
		Fight f = new Fight();
		
		System.out.println(f instanceof Fight);
		System.out.println(f instanceof Unit);
		System.out.println(f instanceof Object);

		System.out.println(f instanceof Fightable);//얘도 true 
		//f는 Fightable 의 구현체이다!!!
		
		System.out.println(f instanceof Movable);//f는 Movable 의 구현테이다
		
		Fightable ff = f;//업캐스팅처럼 생김
		
		Movable mv = f;
		
	}
}
class Fight extends Unit implements Fightable{

	@Override
	public void attack(Unit u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}
	
}

interface Fightable extends Movable, Attackable{
	
}

interface Movable{
	void move(int x, int y);//public abstract 생략되어 있는 것 그래서 위에서 public으로 만들어줘야 한다
}

interface Attackable{
	void attack(Unit u);
}



