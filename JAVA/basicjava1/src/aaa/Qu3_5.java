package aaa;

import java.util.Scanner;

public class Qu3_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String bin = sc.next();
		int y = sc.nextInt();
		
		Calc ca = new Calc();
		if("+".equals(bin)){
			System.out.println(ca.add(x,y));
		}else if("-".equals(bin)){
			System.out.println(ca.substract(x, y));
		}else if("*".equals(bin)){
			System.out.println(ca.multiply(x, y));
		}else if("/".equals(bin)){
			System.out.println(ca.dvide(x, y));
			
		}else{
			System.out.println("연산종료");
		}
			

	}

}
class Calc{
	int add(int x, int y){
		int result = x+y;
		return result;
	}
	int substract(int x, int y){
		int result = x+y;
		return result;
	}
	long multiply(int x, int y){
		long result = (long)x+y;
		return result;
	}
	float dvide(int x, int y){
		float result = (int)(((float)x/y)*10+0.5)/10f;
		return result;
	}
}