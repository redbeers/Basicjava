package d_array;

public class Array_02 {
	public static void main(String[] args){
		
		//문제72쪽 2-26
		//1번
		int[] score = new int[7];
				
		//2번
		// 형식 > 변수타입 변수명 = (리터럴타입)(Math.random()*포함하는범위+시작하는수);
		for(int i=0; i<score.length; i++){
			score[i] = (int)(Math.random()*101+0);
		}
		//3번
		//0:7:1:sum += score[?];
		int sum = 0;
		for(int i=0; i<score.length; i++){
			sum +=score[i];
		}
		//4번
		//평균 총합/총개수=평균
		//d = (int)(평균*자릿수)/처음자릴수;반올림 안하면
		
		float d = (int)(((float)sum/score.length)*100+0.5)/100f;
		System.out.println(d);
		
		//5번 최대
		int m=0;
		for(int i=0; i<score.length; i++){
			if(score[i] > m ){
				m = score[i];
			}
		}
		System.out.println(m);
		//6번 최소
		int x=100;
		for(int i=0; i<score.length; i++){
			if(x > score[i] ){
				x = score[i];
			}
		}
		System.out.println(x);
		
		//7번 전부
		for(int i=0; i<score.length; i++){
			System.out.print(score[i]);
			if(score.length-1 > i){
				System.out.print(",");
			}
		}
		System.out.println();
		System.out.println("합계 :" + sum);
		System.out.println("평균 :" + d);
		System.out.println("최댓값 :" + m);
		System.out.println("최솟값 :" + x);

	}
}
