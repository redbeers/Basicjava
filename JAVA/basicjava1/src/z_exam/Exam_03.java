package z_exam;

public class Exam_03 {
	public static void main(String[] args){
//		
//		
//		/* 3-1 다음중 형변환을생략할 수 있는 것은
//		 * byte b = 10;
//		 * char ch = 'A';
//		 * int in = 100;
//		 * long lo = 1000L;
//		 * 
//		 * 포함범위 byte > short > char > int > long > float > duoble
//		 * 
//		 * 1.b=(byte) in;  int > byte = x 변환
//		 * 2.ch = (char) b;  byte > char = x 음수를 포함하지 못하기 때문에
//		 * 3.short s = (short) ch;  char > short = x char가 더 크기 때문에
//		 * 4.float f = (float) lo;  loug > float = o
//		 * 5.in = (int)ch; char > int = o
//		 * 
//		 */
//		
//		/*
//		 * 
//		 * 3-2다음 연산의 결과를 적으시오
//		 */
//		
//		int x = 2;
//		int y = 5;
//		char c = 'A';//'A'의 문자코드는 65
//		
//		System.out.println(3 << 33); 
//		/* 쉬프트 연산자는 자료형의 bit수 보다 크면 자료형의 bit수로 나눈나머지만큼만 이동한다
//		 * 4byte(32bit)인경우 자리수를 32번 바꾸면 결국 제자리로 돌아온다.
//		 * 예) 8 << 32는 아무일도 일어나지 않는다.
//		 * 연산자 우선 순위로 1 + x를 먼저한후 쉬프트 연산자를 먼저하면 3^33 =>6 
//		 */
//		
//		System.out.println(y >= 5 || x < 0 && x > 2);
//		//&& > || 연산순선    true || false
//		//&&모두 true여야 true
//		//||둘중 하나가 true면 true
//		
//		System.out.println(y += 10 - x++);//13 (10-x =8) 8을 y에 넣어준다 ++는 후위 연산자이기 때문에 나중에 더해준다
//		System.out.println(x+=2);//위에서 후위연산자 ++로 x는 3이다 3+2 = 5
//		System.out.println(!('A' <= c && c <='Z'));// true && true = true !로인해 부정 false
//		System.out.println('C'-c);//int로 변환되어 계산을 하기때문에 c(65) - C(67)=2
//		System.out.println('5'-'1');//같은 char타입이기 때문에 5의 아스키코드에서 -1을 한 결과이다.
//		System.out.println(c + 1);//c의 아스키 코드로 65에 1을 더한 결과이다.
//		System.out.println(++c);//char타입에 전위연산자로 실형한결과(실행전 연산하여 전위) B 
//		System.out.println(c++);//char타입에 후위연산자로 실행결과(실행후 연산하여 후위) B
//		System.out.println(c);//위에서 B가된 후에 후위 연산자++가 실행결과 C
//		
//		//3-3아래는 변수 num의 값에 따라 "양수", "음수","0"을 출력하는 코드이다. 삼항 연산자를 이용해서 (1)에 알맞은 코드를 넣으시오
//		//상항연산자 조건식 ? 식1 : 식2
//		int num = 10;
//		String result = num > 0 ?  "양수" : num < 0 ?  "음수" :"0";
//		System.out.println(result);
//		
//		/* 3-4아래의 코드는 사과를 담는데 필요한 바구니 (버켓)의 수를 구하는 코드이다.
//		 * 만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면,13개의 바구니가 필요한 것이다.
//		 * 10개의단위로 나누어지기 때문에 나머지를 10으로 생각하고 +1로한다. 
//		 * 답 : (apples/bucket) +1
//		 */
		int apples = 123;//사과의 개수
		int bucket = 10; //바구니의 크기(바구니에 담을 수 있는 사과의 개수
		int numOfbucket = apples/bucket+1;
		System.out.println("필요한 바구니의 수 : " + numOfbucket);
//		
//		/* 아래의 코드는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다. 만일 변수 num의 값이 456이면400이 되고 111이라면 100이된다.
//		 * 100의 단위로 나누고 100 이하는 버리는 구조이기때문에 num에 100을 나누고 (int)타입이기때문에 소숫점이하는 나타나지 않는다
//		 * 다시 처음의 자릿수로 가기위해  100을 곱해준다.
//		 * 답 : num/100*100
//		 * 답 : num-num%100
//		 */
//		int num5 = 456;
//		int result5 = (num5/100)*100;
//		System.out.println(result5);
//		
//		/* 3-6 아래 코드의 문제점을 수정해서 실행 결과와 같은 결과를 얻도록 하시오
//		 *  
//		 * 
//		 * 
//		 */
//		
//		byte a= 10;
//		byte b= 20;
//		//byte c = a + b; 는 연산은 int 타입으로 하기대문에 int타입으로 변경된 값들은 byte로 변환해줘야한다.
//		byte c= (byte)(a + b);
//		char ch = 'A';
//		//ch = ch + 2; 는 ch는 char타입인데 2는 int타입이기때문에 형변환으로 char로 변환해준다.
//		ch = (char)(ch + 2);
//		//float f = 3/2; 나머지를 구해야한다. 구해진 나머지는 1.0이기때문에 0.5f(타입은float)를 더해준다.
//		float f = (3/2)+0.5f;
//		//long l = 3000 * 3000 * 3000; 연산은 int형타입으로 하기때문에 (long)타입이라고 선언해야한다. 
//		long l = (long)3000 * 3000 * 3000;
//		float f2 = 0.1f;
//		double d = 0.1;
//		//boolean result = d==f2; boolean타입은 true false로 나타나기때문에 float과 double은 표시하는 소숫점자리가 다르기때문에 false가표시된다
//		//타입이 변경되어야한다.float로
//		boolean result = (float)d==f2;
//		System.out.println("c="+ c);
//		System.out.println("ch="+ ch);
//		System.out.println("f="+ f);
//		System.out.println("l="+ l);
//		System.out.println("result=" + result);
//		
//		/*
//		 * 3-7아래는 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을 뺀 나머지를 구하는 코드이다.
//		 * 예를 들어 24의보다 크면서도 가장 가까운 10의 배수는 30이다.
//		 * 19의 경우 20이고 81의 경우 90이 된다.
//		 * 30에서 24를 뺀 나머지는 6이기 때문에 변수 num의 값이 24라면 6을 결과로 얻어야 한다.
//		 * (1)에 알맞는 코드를 넣으시오
//		 * n에서 가장 가까운 10의 배수를구하고 ((num/10)+1) -> 3 10의 배수로 만들기 위해 10* -> 30 나온결과에서 num을 빼준다.
//		 * n/10*10+10-n
//		 * 
//		 */
//
//		int num = 24;
//		int result = ((num/10+1)*10)-num;
//		System.out.println("result : " + result);
//		
//		
//		/*
//		 * 3-8아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는코드이다.
//		 * 변환공식이 'c =5/9 x(F - 32)'라고 할 때 (1)과 (2)에 알맞는 코드를 넣으시오.
//		 * 변환 결과값은 소수점 셋째자리에서 반올림	
//		 */
//		
//		
		int fahrenheit = 100;									//화씨
		float formula = (float)5/9 *(fahrenheit - 32);			//변화공식 활용
		float celcius = (int)(formula*100+0.5)/100f;			//formula소수점 셋째자리에서 반올림
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);
		
		
	}
}
