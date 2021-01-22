package h_javaLang;

public class StringBuffer_01 {

	public static void main(String[] args) {
//		String str = "a";
//		str +="a";

		/*
		 * String str = "a";
		 * StringBuffer sb = new St ringBuffer(str).append("a").toString();
		 */
		
//		String str = "a";
//		long start = System.currentTimeMillis();
//		System.out.println(start);
//		for(int i=0; i<300000; i++){
//			str += "a";
//		}
//		long end = System.currentTimeMillis();
//		
//		System.out.println(end-start);
	
		StringBuilder str = new StringBuilder("a");
		long start = System.currentTimeMillis();
		System.out.println(start);
		for(int i=0; i<300000000; i++){
			str.append("a");
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end-start);
	}

}
