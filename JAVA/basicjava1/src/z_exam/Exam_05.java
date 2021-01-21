package z_exam;

import java.util.Scanner;

import javax.naming.NoInitialContextException;



public class Exam_05 {

	public static void main(String[] args) {
		
//		//5-1다음은 배열을 선언하거나 초기화한 것이다. 잘못된 것을 고르소 그애유를 설명4,5
//		int[] arr1 [];//2차원배열이다
//		int[] arr2 = {1,2,3,};//,을찍어도 공간을 할당하지 않는다.
//		int[] arr3 = new int[5];
////		int[] arr4= new int[5]{1,2,3,4,5};//알아서 배열 개수를 만들어진다
////		int arr5[5];
//		int[] arr6 [] = new int[3][];
//		
//		//5-2다음과 같은 배열이 있을때 
//		//arr[3].length의 값은 얼마인가 2
//		//arr.length의 값은 얼마인가 3
//		//System.out.println(arr[4][1])의 출력 결과는 얼마인가 > 안나온다
//		int[][] arr = {{5,5,5,5,5},{10,10,10},{20,20,20,20},{30,30}};
//		
//		
//		//5-3배열arr에 담긴 모든 값을 더하는 프로그램을 완성하시오
//		int[] arr={10,20,30,40,50};
//		int sum = 0;
//		for(int i=0; i<arr.length; i++){
//			sum +=arr[i];//총합 : 150
//		}
//		
//		//5-4 2차원 배열 arr에 담긴 모근 값의 총합과 평균을 구하는 프로그램을 오나성하시오
//		int[][] arr = { {5,8,13,5,2}, {22,13,28}, {2,18,23,62}};
//		int total = 0;//합계를 저장하기 위한 변수
//		float average = 0;//평균을 저장하기위한 변수
//		
//		int count=0;
//		for(int i=0; i<arr.length; i++){
//			for(int j=0; j<arr[i].length; j++){
//				total += arr[i][j];
//				count++;
//			}
//		}
//		average = (int)(((float)total/count)*100+0.5)/100f;
//		System.out.println("total :"+total);
//		System.out.println("average :"+average);
//		
//		/* 5-5 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다.
//		 * 변수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 돈전이 필요한지 계산해서 출력하라
//		 * 단 가능한 적은 수의 동전으로 거슬러 주어야한다.
//		 * (1)에 알맞은 코드를 넣어서 프로그램을 완성
//		 * 500:5개
//		 * 100:2개
//		 * 50 :1개
//		 * 10 :4개
//		 *  
//		 */
//		int[] soinUnit = {500, 100, 50, 10};
//		int[] wan=new int[soinUnit.length]; 
//		int money = 2790;
//		/*
//		 * m/s[0]
//		 * m/s[1]
//		 * m/s[2]
//		 * m/s[3]
//		 * 
//		 * m%s[0]
//		 * m%s[1]
//		 * m%s[2]
//		 * m%s[3]
//		 * 
//		 */
//			
//		for(int i=0; i<soinUnit.length; i++){
//			System.out.println(soinUnit[i]+ "원\t:" + money / soinUnit[i] +"개");// 동전이랑 돈이랑 나눈 것을 보여준다
//			System.out.println(money);											//실제로 변하지 않는다는 것을 보여주기 위해 사용
//			money %= soinUnit[i];												//실재로 나누어 첫번째 자리를 지운다
//			
//		}
//		
//		
//		/*
//		 * 5-6 다음은 1과 9사이의 중복되지 않는 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램이다.
//		 * 임의의 값을 사용했기 때문에 실행결과와 다를 수 있다.
//		 * 
//		 */
//		int[] ballArr = {1,2,3,4,5,6,7,8,9};
//		int[] ball3 = new int[3];
//		
//		//ballArr의 index순서대로 index의 요소와 임의의 요소를 골라서 값을 바꾼다. 배열arr에 0번에서 임의의 수입력 그자리와 0번과 자리교체
//		Scanner sc = new Scanner(System.in);
//		
//		int c=0;
//		c = ballArr[0];
//		for(int i=0; i<ballArr.length; i++){
//			System.out.println("입력");
//			int in = sc.nextInt();
//			c=ballArr[in];
//			ballArr[in]=ballArr[i];
//			ballArr[i]=c;
//			
//		}
//		//ballArr의 앞에서 3개를 ball3로 복사한다.
//		//ball3의 값을 출력한다.
//		for(int i=0; i<ball3.length; i++){
//			System.out.println(ballArr[i]+"\t");
//		}
//		
//		
//		
//		
//		
//		
//		/*
//		 * 5-7 다음은 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 *을 찍어서 그래프를 그리는 프로그램
//		 * 
//		 */
//		int[] answer = {1,4,3,2,1,2,3,2,1,4};
//		int[] counter = new int[4];
//		
//		//answer의 요소들 중 1이면 counter의 0번방을 증가 2이면 counter의 1번방을 증가
//		//3이면counter의 2번방을 증가 4이면 counter의 3번방을 증가
//		for(int i=0; i<answer.length; i++){
//			counter[answer[i]-1]++;
//		}
//		for(int i=0; i<counter.length; i++){
//			System.out.print(i+ " " + counter[i]+"개");
//			for(int j=0; j<counter[i]; j++){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		//couter에 저장된 요소를 결과와 같이 출력하여라
//		
//		//hide:answer의 값의 범위를 측정하여 최대 5개의 통계만들기  (시작부터 끝까지 난수 들어가는 값 난수) 
//		//결과 : 
//		//1: 3개 ***
//		//2: 3개 ***
//		//3: 2개 **
//		//4: 2개 **
		/*
		 * [5-8] 문제 5-5에 동전의 개수를 추가한 프로그램이다.
		 *  커맨드라인으로부터 거슬러 줄 금액을 입력받아 계산한다.
		 *  보유한 동전의 개수로 거스름돈을 지불할 수 없으면, '거스름돈이 부족합니다.'라고 출력하고종료한다.
		 *  지불할 돈이 충분히 있으면, 거스름돈을 지불한 만큼 가진 돈에서 빼고 남은 동전의 개수를화면에 출력한다.
		 *  (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
		 */		

//		
//		
//		 if(args.length != 1){
//	            System.out.println("한개의 숫자만 입력해 주세요.");
//	            System.exit(0);
//	        }
//	        // 문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.
//	        int money = Integer.parseInt(args[0]);
//	        System.out.println("money="+money);
//	        int[] coinUnit = { 500, 100, 50, 10 } ; // 동전의 단위
//	        int[] coin = { 5, 5, 5, 5 } ; // 단위별 동전의 개수
//	        
//	        for(int i=0;i<coinUnit.length;i++) {
//	            int coinNum = 0;			//줄  동전수
//	            coinNum = money/coinUnit[i];//줄 동전 개수 (필요한 동전7)
//	            
//	            if(coinNum > coin[i]){	//*중요* 줄 돈이 가진 돈보다 많으면 실행
//	            	coinNum =coin[i];	//*중요* 줄돈에 가진동전을 다준다  -> (중요) 가진동전을 줄동전에 넣어줘야 출력시 5개 준걸로 표시한다
//										//*중요* 실행되면 coinNum에는 5가 들어간다
//		        }						
//	            coin[i] -= coinNum;		//if에 안들어가면  가진돈(coin) -= 줄돈(coinNum) 을 해준다
//										//coin에는 돈이 남아있다 그래서 가진돈에서 줄돈을 뺀다	            
//	            money -=coinNum*coinUnit[i];
//	           //동전을뺀다 -2
//	           
//	            /* (1) 아래의 로직에 맞게 코드를 작성하시오.
//	            1. 금액(money)을 동전단위로 나눠서 필요한 동전의 개수(coinNum)를 구한다.
//	            2. 배열 coin에서 coinNum만큼의 동전을 뺀다.
//	            (만일 충분한 동전이 없다면 배열 coin에 있는 만큼만 뺀다.)
//	            3. 금액에서 동전의 개수(coinNum)와 동전단위를 곱한 값을 뺀다.
//	            */
//	            
//	            
//	            System.out.println(coinUnit[i]+"원: "+coinNum);
//	        }
//
//	        if(money > 0) {
//	            System.out.println("거스름돈이 부족합니다.");
//	            System.exit(0); // 프로그램을 종료한다.
//	        }
//
//	        System.out.println("=남은 동전의 개수 =");
//	        for(int i=0;i<coinUnit.length;i++) {
//	            System.out.println(coinUnit[i]+"원:"+coin[i]);
//	        }
		/*
		 * 
		 * [5-9] 주어진 배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램을 완성 하시오 
		 */

		/*
		 * 00.01
		 * 10.11
		 * 20.21.22.23.24
		 * 30.31.32.33.34
		 * 
		 * 00.01.02.03.04
		 * 10.11.12.13.14
		 * 20.21
		 * 30.31
		 */
		/*
		 * 1+4+
		 */
		char[][] star = {									//4층 5칸
                {'*','*',' ',' ',' '},
                {'*','*',' ',' ',' '},
                {'*','*','*','*','*'},
                {'*','*','*','*','*'}
        };
        char[][] result = new char[star[0].length][star.length];//5층 4칸
//        char[][] result1 = {
//                {'*','*','*','*'},
//                {'*','*','*','*'},
//                {'*','*',' ',' '},
//                {'*','*',' ',' '},
//                {'*','*',' ',' '}
//        };
//        
//        for(int i=0; i < star.length;i++) {
//            for(int j=0; j < star[i].length;j++) {
//                System.out.print(star[i][j]);
//            }
//            System.out.println();
//        }
//        System.out.println();
////여기
//        for(int i=0; i < star.length;i++) {//4칸
//            for(int j=0; j < star[i].length;j++) {//5칸
//               result[j][star.length-1-i]=star[i][j];
//               
//               /* (1) 알맞은 코드를 넣어 완성하시오.*/
//            }
//        } 
//        
//        /*
//         * r [0][0] =s[3][0]
//         * r [0][1] =s[2][0]
//         * r [0][2] =s[1][0]
//         * r [0][3] =s[0][0]
//         * r [
//         * 
//         * 
//         * ][] =s[][]
//         */
////     /* 0-0>*/result[0][0]=star[3][0];	/*1-0>*/result[1][0]=star[3][1];
////      /*0-1>*/result[0][1]=star[2][0];	/*1-1>*/result[1][1]=star[2][1];
////      /*0-2>*/result[0][2]=star[1][0];	/*1-2>*/result[1][2]=star[1][1];
////      /*0-3>*/result[0][3]=star[0][0];	/*1-3>*/result[1][3]=star[0][1];
////
////      /*2-0>*/result[2][0]=star[3][2];
////      /*2-1>*/result[2][1]=star[2][2];
////      /*2-2>*/result[2][2]=star[1][2];
////      /*2-3>*/result[2][3]=star[0][2];
////        
////      /*3-0>*/result[3][0]=star[3][3];
////      /*3-1>*/result[3][1]=star[2][3];
////      /*3-2>*/result[3][2]=star[1][3];
////      /*3-3>*/result[3][3]=star[0][3];
////        
////      /*4-0>*/result[4][0]=star[3][4];
////      /*4-1>*/result[4][1]=star[2][4];
////      /*4-2>*/result[4][2]=star[1][4];
////      /*4-3>*/result[4][3]=star[0][4];
//        
//
//        for(int i=0; i < result.length;i++) {
//            for(int j=0; j < result[i].length;j++) {
//                System.out.print(result[i][j]+"	");
//            }
//            System.out.println();
//        }
	}
}
