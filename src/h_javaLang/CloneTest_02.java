package h_javaLang;

import java.awt.SecondaryLoop;
import java.io.Serializable;
import java.util.Arrays;

import com.sun.org.apache.xml.internal.serialize.Serializer;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class CloneTest_02 {

	public static void main(String[] args) {
		
		Point p1 = new Point(100, 100);
		Point p2 = new Point(200, 200);
		Point p3 = new Point(100, 200);
		
		Point[] a = {p1,p2,p3};
//		Point[] a = null;
//		a[0] = p1;
//		a[1] = p2;
//		a[3] = p3;
		
		Point[] aCopy = a.clone();
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(aCopy));
	
		a[0].x = 10;
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(aCopy));

	
	}

}

class Point implements Serializable{
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}