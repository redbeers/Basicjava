package h_javaLang;
import static java.lang.Math.*;


public class MathTest_01 {

	public static void main(String[] args) {
		// Math
		double d = 3.14159246535;
		
		//반올림
		
		System.out.println(round(d));
		
		//올립
		System.out.println(ceil(d));
		
		//버림
		System.out.println(floor(d));
		
		//제곱
		System.out.println(pow(3, 3));
		
		//루트
		System.out.println(sqrt(3));
		
		//최대값
		System.out.println(max(30, 50));
		
		Point2 p1 =new Point2(10, 10);
		Point2 p2 =new Point2(20, 20);
		
		p2.getDistanxe(p1);
		
	}

}
//Point2클래스의 getDistance메서드를 호출하여 두점사이의 거리를 구해주세요
class Point2{
	int x;
	int y;
	public Point2(int x, int y) {
		this.x=x;
		this.y=y;
		
	}
	@Override
	public String toString() {
		return "Point2 [x=" + x + ", y=" + y + "]";
	}
	
	public void getDistanxe(Point2 p2){
		double result = sqrt(sqrt(pow((x-p2.x),2)+pow((y-p2.y),2)));
		
	}
	
	
}
