package f_oop2;

public class PointTest {
	public static void main(String[] args) {
			
	}

}


class Point2{
	int x;
	int y;
	
	Point2(int x, int y){
		this.x = x;
		this.y = y;
	}
}


class Point3D extends Point2{							//Circle은 점 외에 다른 것도 필요, 그런데 얘는 점이라는 의미는 똑같다, 얘 자체가 점!!!
	//기본생성자를 정의해야만 한다!
	//숨겨져 있는 곳에서 어디선가 기본생성자를 부르고 있다!
	
	//Point3D(){
	//	super();
	//} 모든 생성자는 기본적으로 부모 생성자 호출하게 만들어져 있다!!! 숨어있다 그런데 Point2 는 매개변수 받는 생성자로 만들었으니까 화냄
	//this() 메서드 가면 또 기본생성자내에 super()이렇게 들어있음
	
	int z;
	
	Point3D(int x, int y, int z){
		super(x,y);//이걸 안쓰면 컴파일러가 자동으로 super()이거를 만들어주는데 그럼 바로 오류가 생긴다 
						//왜? 우리 super()생성자는 매개 변수 2개 받으니까!! 생성자내에서 숨겨져 있는 super()생성자 찾아야 한다!!!
		this.z = z;
	}
}




