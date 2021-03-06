package h_javaLang;

public class CloneTest_03 {

	public static void main(String[] args) {
		
		Cirle c = new Cirle(50, new Point(100, 100));

		System.out.println(c);
		
		Cirle cCirle = (Cirle)c.clone();
		System.out.println(cCirle);
		
		c.r = 300;
		c.p.x = 1000;

		System.out.println(c);
		System.out.println(cCirle);
		
	}

}

class Cirle implements Cloneable{
	int r;
	Point p;
	public Cirle(int r, Point p) {
		this.r = r;
		this.p = p;
	}
	@Override
	public String toString() {
		return "Cirle [r=" + r + ", p=" + p + "]";
	}
	
	@Override
	protected Object clone()  {
		Object re=null;
		try{
			
		re = super.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return re;
	}
	
	protected Object deepCopy()  {
		//준제점 : 점을 공유하기 때문에
		Object re = null;
		try{
			re = (Point) super.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		Point newP = new Point(p.x, p.y);
		((Cirle)re).p = newP;//크기를 줄인걸 펴주고 거기서 찾는다.
		return re;
	}

}