package c_sentence;

import java.util.Scanner;

public class Sentence_02 {
	public static void main(String[] args){
		/*
		 * 1.반복문(for, while, do-while)
		 * -어떤작업을 반복적으로 수행되도록 할때 사용
		 * -반복문은 주어진 조건을 만족하는 동안 주어진 문장을 반복적으로 수행함으로 조건식을 포함한다.
		 * -for문은 반복횟수를 알때 ,while문은 반복횟수를 모를때
		 * 
		 * 2.for문
		 * -기본구조
		 * 	for( 초기화; 조건식; 증감식){ 시작부분 끝나는 부분 증가부분
		 * 		조건식이 만족할때 수핼될 문장
		 * 	}
		 * 	초기화 -> (조건식 -> 수행 -> 증감식) 조건이 만족하지 않으면 나간다
		 * 찾야야한다
		 * 시작: 끝: 증감:
		 * 반복구문:
		 * 
		 */
		
		//시작 :0 끝 10 증가랑 1
		//수행문장 System.out.println
//		for(int count=0; count < 11; count++){
//			System.out.println(count);
//		}
//		//5~17까지
//		int sum =0;
//		sum +=5;
//		sum +=6;
//		sum +=7;
//		sum +=8;
//		sum +=9;
//		sum +=10;
//		sum +=11;
//		sum +=12;
//		sum +=13;
//		sum +=14;
//		sum +=15;
//		sum +=16;
//		sum +=17;
//		System.out.println("1 :"+sum);
//		//시작5  끝17  증감 1
//		//수행문자 (sum += ??)`
//		int sum1 =0;
//		for(int a=5; a < 18; a++){
//			sum1 +=a;
//			
//		}
//		System.out.println("2 :"+sum1);
//		
		//2-19
		//1. 0이상 5이하에서 정수를 결과와 같이 출력
		//시작0  끝 5 증감 1
		//수행문 
		//System.out.println(0+" ");
		//System.out.println(1+" ");
		//System.out.println(2+" ");
		//System.out.println(3+" ");
		//System.out.println(4+" ");
		//System.out.println(5+" ");
//		for(int cot=0; cot < 6; cot++){
//			System.out.print(cot + "	");
//			
//		}
//		
//		
		//2. 0이상 5이하에서 정수를 결과와 같이 출력
		//시작5  끝 0 증감 -1
		//반복구문 
		//System.out.println(5+" ");
		//System.out.println(4+" ");
		//System.out.println(3+" ");
		//System.out.println(2+" ");
		//System.out.println(1+" ");
		//System.out.println(0+" ");
//		for(int cot=5; cot > -1; cot--){
//			System.out.print(cot + " ");
//			
//		}
//		
//		//3. 2이상 10이하에서 정수를 합계 구하기 >54
//		//시작2  끝 10 증감 1
//		//반복구문 sum +=??;
//		//int sum = 0;
//		//sum +=2;
//		//sum +=3;
//		//sum +=4;
//		//sum +=5;
//		//sum +=6;
//		//sum +=7;
//		//sum +=8;
//		//sum +=9;
//		//sum +=10;
//		int sum =0;
//		for(int con=2; con < 11; con++){
//			sum +=con;
//		}
//		System.out.println("2:" + sum);
//		
//		//4. 5이상 15미만에서 정수의 곱을 구하라 (overflow를 고려하라 >3632428800
//		//시작:5 끝:15 증감1
//		//반복구문:lo4 *= ?? ;
//		long lo4 = 1;//곱하기할 초기값
//		lo4 *= 5;
//		lo4 *= 6;
//		lo4 *= 7;
//		lo4 *= 8;
//		lo4 *= 9;
//		lo4 *= 10;
//		lo4 *= 11;
//		lo4 *= 12;
//		lo4 *= 13;
//		lo4 *= 13;
//		lo4 *= 14;
//		lo4 *= 15;
//		long lo4 = 1;
//		for(int a=5; a<15; a++){
//			lo4 *=a;
//		}
//		System.out.println(lo4);
//		
//		//5. 3이상 4462이하에서 짝수인 정수의 합을 구하라 > 4979590
//		//시작:3 끝:4462 증감1
//		//반복구문:sum += ?? ;
//		int sum =0;
//		for(int a=3; a < 4463; a++){
//			if(a%2 == 0){
//			sum += a;
//			}
//		}
//		System.out.println(sum);
//		//6. 7초과 57미만에서 2또는 3의 배수인 정수의 합을 구하라 > 1040
//		//시작:8 끝:56 증가:1
//		//반복구문:sum += ?;
//		int sum =0;
//		for(int a=8; a<57; a++){
//			if(a%2 == 0 || a%3 == 0){
//			sum += a ;
//			}
//		}
//		System.out.println(sum);
//		//구구단 출력
//		System.out.println( 2+"*"+ 1 + "=" + 2*1 );
//		System.out.println( 2+"*"+ 2 + "=" + 2*2 );
//		System.out.println( 2+"*"+ 3 + "=" + 2*3 );
//		System.out.println( 2+"*"+ 4 + "=" + 2*4 );
//		System.out.println( 2+"*"+ 5 + "=" + 2*5 );
//		System.out.println( 2+"*"+ 6 + "=" + 2*6 );
//		System.out.println( 2+"*"+ 7 + "=" + 2*7 );
//		System.out.println( 2+"*"+ 8 + "=" + 2*8 );
//		System.out.println( 2+"*"+ 9 + "=" + 2*9 );
//		//구구단 2
//		//시작:1 끝:9 증감:1
//		//반복구문:System.out.println( 2+"*"+ ? + "=" + 2*? );
//		for(int a=1; a<10; a++){
//			System.out.println( 2+"*"+ a + "=" + 2*a );
//		}.............9까지 해야하기 때문에 이중 반복문으로 한다.
//
//		//2~9단
//		//시작: 2 끝: 9 증가:1
//		//for(int a=1; a<10; a++){
//		//		System.out.println( ?+"*"+ a + "=" + ?*a );
//		//	}
//		int a1=0;
//		for(int dan = 2; dan < 10; dan++){
//			for(int a=1; a<10; a++){
//				if(dan%2==0 && a%2==1){//작수 dan에 홀수 a일때만
//				System.out.println( dan+"*"+ a + "=" + dan*a );
//				}
//			}
//			
//		}
//		/* 3. while 문
//		 * -조건식과
//		 * -기본구조
//		 * while(조건식){
//		 * 		조건식이
//		 * 
//		 */
//		//1. 0~10까지 출력
//		for(int count = 0; count < 11; count++){
//			System.out.println(count);
//		}
//		
//		int count = 0;//초기화
//		while(count<11){//초기화
//			System.out.println(count);//수행문장
//			count++;//증감식
//		}
//		
//		//1. 5~15까지의 합을 구하라
//		//시작:5 끝:15 증감:1
//		//반복:
//		int sum = 0;
//		sum +=5;
//		sum +=6;
//		sum +=7;
//		sum +=8;
//		sum +=9;
//		sum +=10;
//		sum +=11;
//		sum +=12;
//		sum +=13;
//		sum +=14;
//		sum +=15;
//		int sum2 =0;
//		for(int count2 = 5; count2 < 16; count2++){
//			sum2 +=count2;
//		}
//		System.out.println(sum2);
//		int sum=0;
//		int a=5;
//		while(a < 16){
//			sum +=a;
//			a++;
//		}
//		System.out.println(sum);
//		//2.구구단 while문으로만
//		//시작:1 끝:9 증감:1
//		//반복:
//
//		
//		int b = 2;
//		while(b<10){
//			int a = 1;
//			while(a<10){
//				System.out.println(b + "*" + a + "=" + b*a);
//				a++;	
//			}
//			b++;
//		}
//		//1.7~?합이 200이상이 될때 ? 의 값을 구하여라 >21
//		//시작:7 끝:~(200일때까지) 증감:1
//		//반복: sum +=  ;
//		int sum =0;//합계저장
//		int a = 6;//증가 변식
//	
//		while(sum<200){
//			a++;
//			sum +=a;
//		}
//		System.out.println(a);
//		
//		int hap2 =0;
//		int num2 =7;
//		while(true){
//			hap2 += num2;
//			if(hap2>=200){
//				break;
//			}
//			num2++;
//		}
//		System.out.println(num2);
		
		/*
		 * 4.do-while
		 * -최초 1회는 반복문을 수행한다.
		 * -구조
		 * do{
		 * 		실행문장
		 * }while(조건문);
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		//1.사용자로부터 문자를 입력받느낟.
		String input = null;
		do{
			System.out.println("문자를 입력해주세요 단 exit이면 종료");
			input = sc.next();
			//2.입력받은 문자를 출력한다.
			System.out.println(input);			
		}while(!"exit".equals(input));
		//3.단 입력받은 문자가 exit이면 반복을 멈춘다.
	
	
	
		for(int i=1; i<100; i++){
			if(i%2==0){
				System.out.println(i);
			}
		}

		for(int i=1; i<100; i++){
			if(i%2!=0){
				continue;
			}
			System.out.println(i);
		}
	
	}
	

}
