package d_array;

public class Array_03_선택_버블_정렬 {
	public static void main(String[] args) {
		/*
		 * 1.정열(sort)
		 * -여러 데이터를 빠르고 쉽게 찾기 위해 일정한 순서대로 데이터를 가지런히 나열하는 작업이다.
		 * -버블정렬, 선택정렬, 삽입정렬
		 * 
		 * 2.버블정렬(buble sort)
		 * -인접한 데이터 간에 교환이 계속해서 일어나면서 정렬이 이루어진다.
		 * 자갖 큰 값이 맨뒤에 위치한다
		 */
		
		//1. 5개의 정수 5.2.3.1.4변수 sortNum에 저장해주세요
//		int[] sortNum = new int[] {5,2,3,1,4};
	
		
		
		//2.버블 정렬을 이용하여 정렬해주세요
		
//		//2 .1 sortNum의 0번방이 sortNum의 1번방보다 크면 자리를 바꿔라
//		if(sortNum[0]>sortNum[1]){
//			int c=sortNum[0];
//			sortNum[0]=sortNum[1];
//			sortNum[1]=c;
//		}
//		for(int i=0; i<sortNum.length; i++){
//			System.out.print(sortNum[i] + " ");
//		}
//		System.out.println();
//		if(sortNum[1]>sortNum[2]){
//			int c=sortNum[1];
//			sortNum[1]=sortNum[2];
//			sortNum[2]=c;
//		}
//		for(int i=0; i<sortNum.length; i++){
//			System.out.print(sortNum[i] + " ");
//		}
//		System.out.println();
//		if(sortNum[2]>sortNum[3]){
//			int c=sortNum[2];
//			sortNum[2]=sortNum[3];
//			sortNum[3]=c;
//		}
//		for(int i=0; i<sortNum.length; i++){
//			System.out.print(sortNum[i] + " ");
//		}
//		System.out.println();
//		if(sortNum[3]>sortNum[4]){
//			int c=sortNum[3];
//			sortNum[3]=sortNum[4];
//			sortNum[4]=c;
//		}
//		//0:5:1:s,o,p(sortNum[?];
//		for(int i=0; i<sortNum.length; i++){
//			System.out.print(sortNum[i] + " ");
//		}
//		System.out.println();
//		
//		//2.2 sortNum의 값을 출력하여라=> 2,5,3,1,4
//		
//
////		
//		for(int b=0; b<sortNum.length-1; b++){//회전	
//			System.out.println(b+1+"회");
//			for(int a=0; a<sortNum.length-1-b; a++){//버블
//				if(sortNum[a]>sortNum[a+1]){
//					int c=sortNum[a];
//					sortNum[a]=sortNum[a+1];
//					sortNum[a+1]=c;
//				}
//				for(int i=0; i<sortNum.length; i++){
//					System.out.print(sortNum[i] + " ");
//				}
//				System.out.println();
//			}
//		}
		
		
		/*
		 * 3.선택정렬(select sort)
		 * -
		 */
//		0:bun.length:1:
//		if(a<b){
//			a=a;
//			
//			}
//		
		
			
			//최솟값구하기
			
			//기준방과 최솟값 방위치변경
			
			
		
		
		//기준방변경하고 다음번돌리기		

		
		
			//최종
		int[] b = new int[]{5,3,2,1,4};
		int m=0;
		for(int i=0; i<b.length-1; i++){
			for(int j=i+1; j<b.length; j++){
				if(b[i] > b[j]){
					m=b[j];
					b[j]=b[i];
					b[i]=m;
				}
			}
		}
		for(int i=0; i<b.length; i++){
			System.out.print(b[i]);
		}
		
		
		
		
		
	}
}
