package h_javaLang;

public class CloneTest_01 {

	public static void main(String[] args) {
		CloneEx clone = new CloneEx(10, 20);
		
		CloneEx cloneClone  = (CloneEx)clone.clone();
		
		System.out.println(clone);
		System.out.println(cloneClone);
		
		clone.x = 50;
		System.out.println(clone);
		System.out.println(cloneClone);
		
		
		CloneEx clone2 = new CloneEx(20, 30);
		CloneEx clone3 = new CloneEx(40, 50);
		CloneEx clone4 = new CloneEx(50, 60);
		
	}

}

class CloneEx implements Cloneable{
	@Override
	protected Object clone() {//다른패키지에있는 놈이라 아무때나 못부른다.
		Object re = null;
		try{
			re = super.clone();
		}catch (CloneNotSupportedException e){
			e.printStackTrace();
		}
		return re;
	}

	int x;
	int y;
	
	public CloneEx(int x, int y) {
		this.x =x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "CloneEx [x=" + x + ", y=" + y + "]";
	}
	
}