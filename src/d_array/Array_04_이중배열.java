package d_array;

public class Array_04_이중배열 {

	public static void main(String[] args) {
		/*
		 * 1.다차원 배열
		 * -자바에서는 1차원 배열뿐만 아니라 2차원이상의 다차원 배열도 혀용한다.
		 * -2차원 배열의 선언방법
		 * 선언방법		선언예
		 * 변수타입[][] 변수명; int[][] arr;
		 * 변수타입[] 변수명[]; int[] arr[];
		 * 변수타입 변수명[][]; int arr[][];
		 * 
		 */
//		int[][] arr = new int[2][3];
//		//0:2:1:
//		//System.out.println(arr[0][0])
//		//System.out.println(arr[0][1])
//		//System.out.println(arr[0][2])
//		//System.out.println(arr[1][0])
//		//System.out.println(arr[1][1])
//		//System.out.println(arr[1][2])
//		
//		for(int i=0; i<2; i++){
//			for(int a=0; a<3; a++){
//				System.out.print(arr[i][a]);
//			}
//			System.out.println();
//		}
		
		//1.학생들이
//		int[][] apt = new int[3][];
//		
//		/*
//		 * 1층, null
//		 * 2층, null
//		 * 3층, null
//		 */
//		apt[0] = new int [3];
//		apt[1] = new int [4];
//		apt[2] = new int [2];
//		System.out.println(apt[0][0]);
//		System.out.println(apt[0][1]);
//		System.out.println(apt[0][2]);
//		
		
		//3.우리반에서 아는 친구이름6명의 친구이름
		String[] names ={"박상빈1","바악씨2", "기임씨3","양예리4","정예진5","권민정6"} ; 
		
		//과목
		String[] ga={"국주1","영국2","수박3","물총4","탐사5","쭉쭉6","들어7"}; 
		//1. 6명의 7과목의 점수(정수)를 저장할 수있는 변수 score를 선언및 생성
		int[][] hac = new int[names.length][ga.length];
		
		//2.score의 각방의 값을 0~100사이의 임의의 값으로 초기화 하여라
		//0:6:1:
		//hac [?][?]=ran;
		//
		for(int in=0; in<hac.length; in++){
			for(int jum=0; jum<hac[in].length; jum++){
				int ran = (int)(Math.random()*101);
				hac[in][jum]=ran;
			}			
		}
		
		//5.사람별합계
		//1:6:1:
		//sum +=hac[0][0]
		//sum +=hac[0][1]
		//sum +=hac[0][2]
		//........
		int[] sum=new int[names.length];
		for(int j=0; j<names.length; j++){
			for(int i=0; i<ga.length; i++){
				sum[j] +=hac[j][i];
			}
		}
		//11046 3018101
		//사람별 평군 3반올2자리까지표시
		// d = (int)(평균*자릿수+0.5)/처음자릿수f;반올림할때

		float[] average=new float[names.length];
		
		for(int i=0; i<names.length; i++){
			average[i] = (int)(((float)sum[i]/ga.length)*100+0.5)/100f;		
		}
		
		//과목별합계
		int[] gasum=new int[ga.length];
		for(int i=0; i<ga.length; i++){
			for(int j=0; j<names.length; j++){
				gasum[i]+=hac[j][i];
			}
		}
		//합계의 평균
		float[] gaaverage=new float[ga.length];
		for(int i=0; i<ga.length; i++){	
			gaaverage[i] = (int)(((float)gasum[i]/names.length)*100+0.5)/100f;
		}
		
		//사람별석차
		int[] order=new int[names.length];
		for(int i=0; i<names.length; i++){
			int cont=1;
			for(int j=0; j<names.length; j++){
				if(average[i] <= average[j]){
					order[i]=cont++;
				}
			}
		}
		//석차순으로 정리
		
		
		
		
		
		//0.출력 모양
		for(int i=0; i<ga.length; i++){
			System.out.print("\t"+ga[i]);
		}
		System.out.print("\t합계\t평균\t석차");
		System.out.println();
		for(int i=0; i<hac.length; i++){
			System.out.print(names[i]+"\t");
			for(int j=0; j<hac[i].length; j++){
				System.out.print(hac[i][j] + "	");
			}
			System.out.print(sum[i]+"\t"+average[i]+"\t"+order[i]);
			System.out.println();
		}
		System.out.print("과목합계 \t");
		for(int i=0; i<gasum.length; i++){
			System.out.print(gasum[i]+"\t");
		}
		System.out.println();
		System.out.print("과목평균 \t");
		for(int i=0; i<gaaverage.length; i++){
			System.out.print(gaaverage[i]+"\t");
		}
		
		
		
		
//			 	국	영	수	과	사 	자 	이	합계	평	석차
//		이름 : 	?	?	?	?	?	?	?	?	?	?
//		이름 : 	?	?	?	?	?	?	?	?	?	?
//		이름 : 	?	?	?	?	?	?	?	?	?	?
//		이름 : 	?	?	?	?	?	?	?	?	?	?
//		이름 : 	?	?	?	?	?	?	?	?	?	?
//		이름 : 	?	?	?	?	?	?	?	?	?	?
//		과목합:	?	?	?	?	?	?	?	?	
//		과목평:	?	?	?	?	?	?	?	?	
	}
}
