package d_array;

import java.util.Scanner;

public class Calc_계산기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int ain;
		
		String bin;
		
		int cin;
		
		Ccc ccc = new Ccc();
		
		int sum =0;
		int bagi =0;
		long gohp =0;
		float nana =0;

		while(true){
			if(sum==bagi && gohp==nana){
				System.out.println("정수입력");
				ain = sc.nextInt();
				System.out.println("부호입력");
				bin = sc.next();
				System.out.println("정수입력");
				cin = sc.nextInt();
				
				if(!(bin.equals("+")||bin.equals("-")||bin.equals("*")||bin.equals("/"))){
					System.out.println("종료");
					break;
				}else if(bin.equals("C")){
					continue;
				}
				
				if(bin.equals("+")){
					sum = ccc.add(ain, cin);
					System.out.println(ain+" "+bin+" "+cin+" = "+sum);
				}else if(bin.equals("-")){
					bagi = ccc.bdd(ain, cin);
					System.out.println(ain+" "+bin+" "+cin+" = "+bagi);
				}else if(bin.equals("*")){
					gohp = ccc.cdd(ain, cin);
					System.out.println(ain+" "+bin+" "+cin+" = "+gohp);
				}else if(bin.equals("/")){
					nana = ccc.ddd(ain, cin);
					System.out.println(ain+" "+bin+" "+cin+" = "+nana);
				}	
			}else if(sum > 0){
				
				bagi=0;
				gohp=0;
				nana=0;
				int a=sum;
				System.out.println("부호입력");
				bin = sc.next();
				System.out.println("정수입력");
				cin = sc.nextInt();
				if(!(bin.equals("+")||bin.equals("-")||bin.equals("*")||bin.equals("/"))){
					System.out.println("종료");
					break;
				}else if(bin.equals("C")){
					continue;
				}
				if(bin.equals("+")){
					sum = ccc.add(a, cin);
					System.out.println(a+" "+bin+" "+cin+" = "+sum);
				}else if(bin.equals("-")){
					bagi = ccc.bdd(a, cin);
					System.out.println(a+" "+bin+" "+cin+" = "+bagi);
				}else if(bin.equals("*")){
					gohp = ccc.cdd(a, cin);
					System.out.println(a+" "+bin+" "+cin+" = "+gohp);
				}else if(bin.equals("/")){
					nana = ccc.ddd(a, cin);
					System.out.println(a+" "+bin+" "+cin+" = "+nana);
				}	
				
			}else if( bagi> 0){
				
				sum=0;
				gohp=0;
				nana=0;
				int a=bagi;
				System.out.println("부호입력");
				bin = sc.next();
				System.out.println("정수입력");
				cin = sc.nextInt();
				if(!(bin.equals("+")||bin.equals("-")||bin.equals("*")||bin.equals("/"))){
					System.out.println("종료");
					break;
				}else if(bin.equals("C")){
					continue;
				}
				if(bin.equals("+")){
					sum = ccc.add(a, cin);
					System.out.println(a+" "+bin+" "+cin+" = "+sum);
				}else if(bin.equals("-")){
					bagi = ccc.bdd(a, cin);
					System.out.println(a+" "+bin+" "+cin+" = "+bagi);
				}else if(bin.equals("*")){
					gohp = ccc.cdd(a, cin);
					System.out.println(a+" "+bin+" "+cin+" = "+gohp);
				}else if(bin.equals("/")){
					nana = ccc.ddd(a, cin);
					System.out.println(a+" "+bin+" "+cin+" = "+nana);
				}	
				
			}else if(gohp > 0){
				
				sum=0;
				bagi=0;
				nana=0;
				int a=(int) gohp;
				System.out.println("부호입력");
				bin = sc.next();
				System.out.println("정수입력");
				cin = sc.nextInt();
				if(!(bin.equals("+")||bin.equals("-")||bin.equals("*")||bin.equals("/"))){
					System.out.println("종료");
					break;
				}else if(bin.equals("C")){
					continue;
				}
				if(bin.equals("+")){
					sum = ccc.add(a, cin);
					System.out.println(a+" "+bin+" "+cin+" = "+sum);
				}else if(bin.equals("-")){
					bagi = ccc.bdd(a, cin);
					System.out.println(a+" "+bin+" "+cin+" = "+bagi);
				}else if(bin.equals("*")){
					gohp = ccc.cdd(a, cin);
					System.out.println(a+" "+bin+" "+cin+" = "+gohp);
				}else if(bin.equals("/")){
					nana = ccc.ddd(a, cin);
					System.out.println(a+" "+bin+" "+cin+" = "+nana);
				}	
				
			}else if( nana> 0){
				
				sum=0;
				bagi=0;
				gohp=0;
				int a=(int) nana;
				System.out.println("부호입력");
				bin = sc.next();
				System.out.println("정수입력");
				cin = sc.nextInt();
				if(!(bin.equals("+")||bin.equals("-")||bin.equals("*")||bin.equals("/"))){
					System.out.println("종료");
					break;
				}else if(bin.equals("C")){
					continue;
				}
				if(bin.equals("+")){
					sum = ccc.add(a, cin);
					System.out.println(a+" "+bin+" "+cin+" = "+sum);
				}else if(bin.equals("-")){
					bagi = ccc.bdd(a, cin);
					System.out.println(a+" "+bin+" "+cin+" = "+bagi);
				}else if(bin.equals("*")){
					gohp = ccc.cdd(a, cin);
					System.out.println(a+" "+bin+" "+cin+" = "+gohp);
				}else if(bin.equals("/")){
					nana = ccc.ddd(a, cin);
					System.out.println(a+" "+bin+" "+cin+" = "+nana);
				}	
				
			}
		
			
		}
		
	}
}
class Ccc{
	int add(int a, int b){
		int result1 = a+b;
		return result1;
	}
	int bdd(int a, int b){
		int result2 = a-b;
		return result2;
	}
	long cdd(int a, int b){
		long result1 = a*b;
		return result1;
	}
	float ddd(int a, int b){
		float result1 = (int)(((float)a+b)*10+0.5)/10f;
		return result1;
	}
}
