package c_sentence;

public class Sentence_01 {
	public static void main(String[] args){
		/*
		 * 
		 * 1.조건문
		 * 	-if, switch, case
		 * 	-조건식과 문장을 포함하는 블럭{}으로 구성되었다.
		 * 	-조건식의 결과에 따라 프로그램의 실행흐름을 변경할수 있다.
		 * 
		 * 2.if
		 * 	-구조
		 * 		(1) 기본
		 * 			if(조건문){
		 * 				조건문의 결과가 true일때 수행
		 * 			}
		 * 
		 * 	int num = -10;
		 *	if(num>0){
		 *	System.out.println("양수이다");
		 *	}
		 * 
		 * 		(2) 1단변형
		 * 			if(조건문){
		 * 				조건문의 결과가 true일때 수행
		 * 			}else { 
		 * 				조건문이 false일때 수행
		 * 			}
		 * 
		 * 		(3) 2단변형
		 * 			if(조건문){
		 * 				조건문의 결과가 true일때 수행
		 * 			}else if(조건식2){
		 * 				조건문이 결과가 false일때 수행
		 * 			}else {
		 * 				조건식1과 조건식2가 모두 false일때 수행
		 * 			}
		 * 
		 */
		
//		int num = 10;
//		if(num>0){
//			System.out.println("양수이다");
//		}else if(num == 0){
//			System.out.println("양수가 아니다");
//		}else{
//			
//		}
//		
//		//1.변수 score를 선언하고0이상 100이하의 정수중에 임의의 값으로 초기화 하여라
//		
//		//2.score의 값이 90점 이상이면 "A"를 출력 80점이상 90점 미만이면 "B"를 출력
//		//70점이상 80점 미만이면 "C"를 출력, 60점이상70점 미만이면 "D"를 출력
//		//60점 미만이면 "F"를 출력 하여라.(if-else if문을 이용 하여라.)
//		
//		int score = (int)(Math.random()*101+0);
////		int score = 97;
//		System.out.println(score);
//		if(score > 89){
//			System.out.print("A");
//			if(score >= 95){
//				System.out.println("+");
//			} else {
//				System.out.println("-");
//			}
//		}else if(score > 79){
//			System.out.print("B");
//			if(score >= 85){
//				System.out.println("+");
//			} else {
//				System.out.println("-");
//			}
//		}else if(score > 69){
//			System.out.print("C");
//			if(score >= 75){
//				System.out.println("+");
//			} else {
//				System.out.println("-");
//			}
//		}else if(score > 59){
//			System.out.print("D");
//			if(score >= 65){
//				System.out.println("+");
//			} else {
//				System.out.println("-");
//			}
//		}else if(score < 60){
//			System.out.print("F");
//			if(score >= 55){
//				System.out.println("+");
//			} else {
//				System.out.println("-");
//			}
//		}
		/*
		 * switch문
		 * -조건의 경우의 수가 많을 때는 if문 보다는 switch문을 사용
		 * -간결해서 알아보기 쉬움
		 * -조건의 결과값을 int형 범위를 정수값으로 허용
		 * 
		 * -구조
		 * 	switch(조건식(값이들어와야한다)){
		 * 		case 값1:
		 * 			조건식과 값1이 같을때 수행될 문장
		 * 			break;
		 * 		case 값2:
		 * 			조건식과 값2이 같을때 수행될 문장
		 * 		case 값3:
		 * 			조건식과 값3이 같을때 수행될 문장
		 * 		default : 
		 * 			조건식과 만족하는 case없을때 수행될 문장
		 * 			break;//생량가능하다
		 * 	}
		 */
		//1.변수 score를 선언하고0이상 100이하의 정수중에 임의의 값으로 초기화 하여라
		
		
		
		
//		//문제2-17
//		//1.변수 random을 선언하고 1이ㄹ상 5이하의 임의의 정수로 초기화 하라
//		int random = (int)(Math.random()*5+1);
//		//2.random의 값이 1이면 32평아파트 당첨을 2이면 자동차 당첨 3이면 노츠북 당첨 4면 자전거 당첨 5면 다음기회 출력
//		
//		
//		switch(random){
//		case 1:
//			System.out.println("32평 아파트 당첨");
//			break;
//		case 2:
//			System.out.println("자동차 당첨");
//			break;
//		case 3:
//			System.out.println("노트북 당첨");
//			break;
//		case 4:
//			System.out.println("자전거 당첨");
//			break;
//		default :
//			System.out.println("32평 아파트 당첨");
//			
//		}
//		//1. seaseon 변수를 선언하고 1~12사이의 임의의 정수값으로 초기화 하아
//		int seaseon = (int)(Math.random()*12+1);
//		//2. season의 값이 12,1,2의 경우에는 겨울 3,4,5,의 경우 봄 6,7,8의 경우 여름 9,10,11의 경우 가을 출력
//		System.out.println(seaseon);
//		switch(seaseon){
//		case 12: case 1: case 2:
//			System.out.println("겨울");
//			break;
//		case 3: case 4: case 5:
//			System.out.println("봄");
//			break;
//		case 6: case 7: case 8:
//			System.out.println("여름");
//			break;
//		default :
//			System.out.println("가을");
//		}
//		
//			//2-18 score의 값이 90점 이상이면 "A"를 출력 80점이상 90점 미만이면 "B"를 출력
//			//70점이상 80점 미만이면 "C"를 출력, 60점이상70점 미만이면 "D"를 출력
//			//60점 미만이면 "F"를 출력 하여라.(switch문을 이용 하여라.)		
//			int r8 = (int)(Math.random()*101+0);
//			System.out.println(r8);
//			
////			int a = r8 >= 90 ? 1 : r8 >= 80 ? 2 : r8 >= 70 ? 3 : r8 >= 60 ? 4:0;
////		switch(score/10)
//
//			switch(r8 >= 90 ? 1 : r8 >= 80 ? 2 : r8 >= 70 ? 3 : r8 >= 60 ? 4 : 0){
//			case 1:
//				System.out.println("A");
//				break;
//			case 2:
//				System.out.println("B");
//				break;
//			case 3:
//				System.out.println("C");
//				break;
//			case 4:
//				System.out.println("D");
//				break;
//			default :
//				System.out.println("F");
//			}
//			
//			char ch41 = 'A';
//			boolean a = 'A'<= 'Z' && 'a'<= 'z';
//			
//			if(ch41 ){
//				System.out.println("t");
//			}
			
		        
		        
		        
		/* 
		 * 
		 * .반복문
		 * 	for, while, do-while
		 */
	}
}
