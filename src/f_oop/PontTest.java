package f_oop;

public class PontTest {

	public static void main(String[] args) {
		
		
	}

}


class Point2{
	int x=0;
	int y=0;
	
	Point2(int x, int y){
		this.x=x;
		this.y=y;
	}
}

class Point3D extends Point2{
	
	int z;
	Point3D(int x, int y, int z){
		super(x,y);//부모클래스에있는 것을 가지고온다.
		this.z=z;
	}
	
}