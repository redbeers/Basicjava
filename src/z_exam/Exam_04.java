package z_exam;

import java.util.Scanner;

public class Exam_04 {

	public static void main(String[] args) {
		
//		//4-1 다음의 문장들을 조건식으로 표현하라
//		int rendom = (int)(Math.random()*100+1);
//		//1.int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건
//		int x =10;
//		if(x > 10 ? true : x < 20 ? true : false){
//		}
//		//2.char형 변수 ch가 공백이고 탭이 아닐 때 true인 조건식
//		char ch = 9;
//		System.out.println(ch);
//		if(ch == 0 ? false : ch == 9 ? false : true){
//			System.out.println(ch);
//		}
//		//3.char형 변수 ch가 x또는 (대)X일 때 true인 조건식
//		char ch3 = 'X';
//		if(ch3 == 'x'? true : ch3 == 'X' ?  true : false){
//			
//		}
//		
//		//4.char형 변수 ch가 숫자('0'~'9')일 때 true인 조건식 48~57
//		char ch4 = '0';
//		if(ch4 >= '0' && ch4 <= '9'){
//			System.out.println("t");
//		}else{
//			System.out.println("f");
//		}
//		boolean a = ch4 >= '0' && ch4 <= '9';
//		System.out.println(a);
//
//		//5.char형 변수 ch가 영문자(대문자 또는 소문지)일때 true인 조건식
//		char ch5 = 'A';
//		boolean a1 = ch5 >= 'A' && ch5 <= 'Z';
//		boolean a1_1 = ch5 >= 'a' && ch5 <= 'z';
//		if(a1 || a1_1){
//			System.out.println("t");
//		}else{
//			System.out.println("f");
//		}
//		//6.boolean형 변수 powerOn가 false일 때 true인 조건
//		boolean powerOn = false;
//		if(powerOn == false){
//			System.out.println("true");
//		}
//
//		//7.문자열 참조변수 str이 yes일 때 true인 조건식
//		String str = "yes";
//		if(str == "yes"){
//			System.out.println("true");
//		}
//		//4-2 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오
//		// (1:20:1:sum +=?)
//		int sum4=0;
//		
//		for(int a=1; a<21; a++){
//			if(a%2 != 0 && a%3 != 0){
//				sum4 += a;
//			}
//		}
//		System.out.println(sum4);
//
		//홀수와 2의배수랑 뭐가 다른가?
		//홀수 :  	  1,3,5,7,9..
		//짝수(2의배수) : 2,4,6,8,10..
		//4-3다음의 for문을 while문으로 변경하시오
//		for(int dan = 2; dan < 10; dan++){
//			for(int gob = 1; gob < 10; gob++){
//				System.out.println(dan + " * " + gob + " = " + dan * gob);
//			}
//		}
//		// 2:9:1: dan *= ?;
//		// 1:9:1: gob *= ?;
//		int dan = 2;
//		
//		while(dan<10){
//			int gob = 1;
//			while(gob<10){
//			System.out.println(dan + "*"+gob+"="+dan*gob);
//			gob++;
//			}
//			dan++;
//		}
//		
//		//4-4 두 개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 풀력하는 프로그램 작성
//		// 1:6:1:sum
//		int sum = 0;
//		for(int d1 = 1; d1<7; d1++){
//			for(int d2 = 1; d2<7; d2++){
//				if(d1+d2 ==6){
//					System.out.println(d1+","+d2);
//				}
//			}
//		}
//		
//		//4-5 방정식 2x + 4y = 10의 모든 해를 구하시고 단 x와 y는 정수이고 각각의 범위는 0<=x,y<=10
//		//1:10:1: sum +=a+b
//		//1:10:1: sum +=a+b
//
//		for(int a=0; a<11; a++){
//			for(int b=0; b<11; b++){
//				if(2*a + 4*b == 10){
//					System.out.println(a + "," + b);
//				}
//			}
//		}
//		
//		//4-6 사용자로부터 두개의 정수(시작,끝)를 입력받아 시작(포함)에서 끝(포함)까지의 곱을 출력하는 그로그램을 작성
//		Scanner sc = new Scanner(System.in);
//		
//		int a;
//		int b;
//		long sum=1;
//		System.out.println("시작");
//		a = sc.nextInt();
//		System.out.println("끝");
//		b = sc.nextInt();
//		
//		//a:b:1:sum += a*b;
//		for(; a<b+1; a++){
//			sum *= a;
//		}
//		System.out.println(sum);
//		
//		//4-7  1 + (1+2) + (1+2+3).....(1+2+3+....10) 
//		//결과를 계산하시오
//		//1:10:1:System.out.println(?);
//		System.out.println(1);
//		System.out.println(1+2);
//		System.out.println(1+2+3);
//		int sum =0;
//		String b="";
//		//4_8방법1
//		int sum =0;
//		for(int a=1; a<11; a++){
//			for(int con=1; con<a+1; con++){
//				sum += con;
//				System.out.print(con);
//				if(con == a){
//					break;
//				}else{
//					System.out.print("+");	
//				}
//			}
//			System.out.println();
//		}
//		System.out.println(sum);
//		//4_8방법2
//		int sum4_8= 0;
//		int total4_8 = 0;
//		for(int i=1; i<11; i++){
//			sum4_8 +=i;
//			total4_8 +=sum4_8;
//		}
//		System.out.println(total4_8);
//		//4_8방법3 등차수열방식
//		int sum=0;
//		for(int i=1; i<11; i++){
//			sum +=i*(11-1);
//		}
//		
//		
		//4-8 1+(-2)+3(-4)...과 같은 식으로 계속 더해나갔을때 몇까지 더해야 총합이 100이상이 되는 구간을 구하시오 :답199
		//1:sum=100:1:??;
		/*
		 * 1+
		 * 2-
		 * 3+
		 * 4-
		 */
		int sum =0;
		int con =0;
		int ssum=101;
		for(int i=1; i<ssum; i++){
			con++;
			if(con%2 == 0){
				sum -=con;
			}else {
				sum +=con;
			}
			
		}
		System.out.println(con);
//		while(true){
//			con++;
//			if(con%2 == 0){
//				sum -=con;
//			}else {
//				sum +=con;
//			}
//			if(sum >= 100){
//				break;
//			}
//		}
//		System.out.println(con);
//		
		//4-9 사용자로부터 입력받은 정수의 각 자리의 합을 더한 겨과를 출력하는 프로그램을 작성하시오
		//예 사용자가 53263을 입력하였다면 결과는 19가 되어야 한다.
		//1:?:1:sum +=?;
		//
//		System.out.println("입력");
//		Scanner sc=new Scanner(System.in);
//		int num=sc.nextInt();
//		int re = 0;
//		while(num!=0){
//			re +=num%10;
//			num -=num%10;
//			num/=10;
//		}
//		System.out.println(re);
//		
		
//		//4-10 피보나치(Fibonnaci) 수열은 앞을 두 수를 더해서 다음 수를 만들어 나가는 수열이다.
//		//예 앞의 두 수가 1과 1이라면 그 다음 수는 2가 됙 그 다음 수는 1과 2를 더해서 3이 되어서 1,1,2,3,5,8,13,21......과 같은 식으로 ㅅ진행
//		//1과 1부터 시작하는 피보나치수열의 10번째 수는 무엇인지  셰산하는 프로그램 작성
//		//1:10:1:a=c,b=a,c +=a+b
//		
//
////		1+1=2
////		2+1=3
////		3+2=5
////		5+3=8
////		8+5+13
////		13+8=21
////		21+13=34
////		34+21=55
////		55+34=89
////		89+55=144
//		
//		int a=1;
//		int b=1;
//		int c=0;
//		for(int i=1; i<9; i++){
//			c =a+b;
//			b=a;
//			a=c;
//		}
//		System.out.println(c);
//		
//		//4-11 다음은 주어진 문자열(value)이 숫자인지를 판별하는 프로그램이다 (1)에 알맞은 크드를 넣어 프로그램을 완성
//	
//		String value ="12o34";
//		char ch =' ';
//		boolean isNuumber = true;
//		//반복문과 charAt*int i)를 이용해서 문자열의 문자를 
//		//하나씩 읽어서 검사한다.
//		for(int i=0; i<value.length() ; i++){
//			ch = value.charAt(i);
//			if((ch >= '0' && ch >= '9')){
//				isNuumber = false;
//			}else{
//				isNuumber = true;
//			}
//			
//			//(1)알맞은 코드를 넣어 와선
//		
//			if(isNuumber){
//				System.out.println(value+"는 숫자입니다");
//			}else{
//				System.out.println(value+"는 숫자가 아닙니다.");
//			}
//		}
		//4-8추가문제
//		Scanner sc = new Scanner(System.in);
//		//int a =sc.nextInt();
//		int p = 121;//예시로만들어둔거
//		int re=0;
//		int a=0;
//		
//		
//		while(true){
//			re*=10;
//			p=a%10;
//			re+=p;
//			a = a/10;
//			if(a == p){
//				System.out.println("true");
//				break;	
//			}else{
//				System.out.println("fales");
//				break;
//			}
//		}
		
	}
}


