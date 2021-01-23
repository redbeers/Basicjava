package f_oop;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

import javax.swing.text.GapContent;



public class DrawShape extends Frame{//Frame자체적으로 뭔가를 실행해준다.
	
	public static void main(String[] args) {
		DrawShape ds = new DrawShape();
		
		//ds.paint() <<인자값 지정 호출된다.

	}
	DrawShape(){//기본생성자
		super("생성");//다른 생성자에서 부모클래스 호출시
		setSize(500, 500);
		setBackground(Color.MAGENTA);
		setVisible(true);
		setResizable(false);
		
	}
	public void paint(Graphics g){
		//1.매개변수가 두개인 생성자를 이용하여 원을 만들어라 변수명c
		Point  point = new Point(100,100); 
		Circle c = new Circle(50, point);
		
		//2. g.drawOval()를 이용하여 원을 그려라
		g.drawOval(c.p.x, c.p.y, c.r*2, c.r*2);
		
		//3. 매개변수가 하나인 생성자를 이용하여 삼각형을 만들어라  변수명p
		//좌표명 : 100,100   200,200   100,200
		Point p1 = new Point(100,100);
		Point p2 = new Point(200,200);
		Point p3 = new Point(100,200);
		
		Point[] tp ={p1,p2,p3};
		
		Triangle p = new Triangle(tp);
		
		
		//4. g.drawLine() 3개를 이용하여 삼각형을 그려라
		g.drawLine(p.p[0].x, p.p[0].y, p.p[1].x, p.p[1].y);
		g.drawLine(p.p[1].x, p.p[1].y, p.p[2].x, p.p[2].y);
		g.drawLine(p.p[2].x, p.p[2].y, p.p[0].x, p.p[0].y);
	}
}
class Point{
	int x;
	int y;
	Point(int a, int b){
		this.x = a; 
		this.y = b; 
	}
}
class Circle{
	//1. 반지름(정수)를 저장할 수 있는 변수 r 을 선언해주세요//반지름
	int r;
	//2.중심점을 저장할수 있는 변수 P를 선언해주세요//점저장
	//String p = ".";
	// ? p = 중심점
	// int p = ??;
	//Point타입의 p를 선언
	//생성자는 인스턴스 변수값을 초기화
	// Tv tv = new Tv();
	// Tv tv;
	// tv = new Tv();
	Point p;
	//3.매개변수가 두개인 생성자를 만들어라
	Circle(int r, Point p){
		this.r = r;
		this.p = p;	
	}
	//4.기본생성자를 만들어라
	// 단. 매개변수가 두개인 생성자를 이용하여 100, 100 반지름 50으로 초기화 하라
	Circle(){
		this(50, new Point(100,100));
	}
}

class Triangle{
	//1. 점3개를 저장할 수 있는 변수 p를 선언해주세요
	Point[] p;
	//2. 매개변수가 한개인 생성자를 만들어라
	Triangle(Point[] p){
		this.p = p;
	}
	//3. 매개변수가 세개인 생성자를 만들어라
	Triangle(Point p1, Point p2, Point p3){
		
		p = new Point[]{p1,p2,p3};
		
	}
}	