package z_exam;

// -17개 0 3개
public class TotalTest {//TotalTest시작하면서 M.A로드되면서 클래스 인스턴스,메서드를 찾는다(main())클래스 인스턴스는없다. -1점
	public static void main(String[] args) {//main ()를 실행되면서 Call S에 로드된다. 0점

		TvMaker.color = "Blue"; //=연산자가 있기 때문에 =기준 왼쪽부터 시작 TvMaker를 M.A에서 확인해보니 없다. M.A에 로드해준다.
		//클래스 메서드,변수를 찾는다. (color = null,inch=0)초기 값으로 만들어준다.클래스 메서드는 없다. -1점
		//TvMaker 의 클래스 변수인 color를 Blue로변경
		TvMaker tm = new TvMaker(); // 0점
		//=기준 외편수터 M.A에 TvMaker이 로드되어있기때문에 생략 C.S에tm이라는 main()의 지역변수선언 
		//인스턴스화 진행 H에 TvMaker 인스턴스 변수,메서드 생성(name="" age=0 TvMaker() TvMaker()) main()의 지역변수tm에 H에 있는
		//tm의 주소를 참조한다.
		tm.age = 30; 
		//tm에 있는 age를 30변경 
		// 3. 메서드 호출
		// 3.1
		System.out.println(TvControll.channel); // 0점
		//TvControll  M.A에  안보여서 생성 > M.A에 TvControll의 클래스 메서드,변수 생성
		//MAX_CHANNEL=50 MIN_CHANNEL=10 channel=15 volumeDown()생성
		//TvControll의 channer 출력 >15
		TvControll.volumeDown(); // 0점
		//TvControll M.A에 있음 > TvControll에 volumeDown실생
		//C.S > volumeDown호출 > 조건실행 M.A에 있는 channel =15>16 퇴근
		
		System.out.println(TvControll.channel); // -1점
		//출력 M.A TvControll 에 있는 channer출력 15
		// 3.2
		TvControll tc; // TvControll는 M.A에 있어 로드생략 C.S에 main()의 지역변수 tc생성 // 0점
		tc = new TvControll(); //=기준 왼편 tc를 참조하기위해 TvControll() 인스턴스화 // 0점
		//TvControll() 의 인스턴스 메서드,변수 생성(MAX_VOLUME =100 ,MIN_VOLUME=0 ,volume = 99, volumeUp())생성
		System.out.println(tc.volume); // -1점
		//tc의 volume출력 99
		tc.volumeUp(); // 0점
		//tc에 있는 volumeUp() 실행 C.S에 volumeUp()생성 volumeUp() 조건실행시 volume++ 한 것을 return 후 퇴근
		//H에 있는 tc의 volume 100
		System.out.println(tc.volume); // -1점
		tc.volumeUp(); // -1점
		System.out.println(tc.volume); // -1점

		//
		Calc cc = new Calc(); // -1점
		System.out.println(cc.add(Integer.MAX_VALUE, 4)); // -1점
		System.out.println(cc.add(3L, Integer.MAX_VALUE)); // -1점 

	}
}

class TvMaker {
	// 1. -1점, -1점
	// 1.1
	static String color;
	static int inch;
	// 1.2
	String name = "";
	int age;

	// 2.
	// 2.1
	TvMaker() {
		this("man", 25);
	}

	// 2.2 -1점, -1점
	TvMaker(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class TvControll { 
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	static final int MAX_CHANNEL = 50;
	static final int MIN_CHANNEL = 1;

	static int channel = 15;
	int volume = 99;

	// 4. return문 -1점
	int volumeUp() {
		if (volume == MAX_VOLUME) {
			volume = MIN_VOLUME;
		} else {
			volume++;
		}

		return volume;
	}

	static int volumeDown() {
		if (channel == MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		} else {
			channel++;
		}
		return channel;
	}
}

class Calc { // -1점
	// 5. // -1점
	int add(int a, int b) {
		return a + b;
	}

	long add(long a, int b) {
		return a + b;
	}

	int minus(int a, int b) {
		return a + b;
	}
}