package e_oop;

public class MamberCall {
	
	static int cv;
	int iv;
	
	static int cv2 = cv;
	int iv2 = iv;
	
	
	static void staticMethod1(){
		//로드가능 cv, cv2 staticMethod2
		//로드불가 iv, iv2
		
	}
	static void staticMethod2(){
		//로드가능 cv, cv2 staticMethod2
		//로드불가 iv, iv2
		
	}
	void instacneMethod1(){
		//로드가능 iv, iv2, cv, cv2, staticMethod1(), staticMethod2()
	}
	

}
