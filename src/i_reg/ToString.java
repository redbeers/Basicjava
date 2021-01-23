package i_reg;

public class ToString {

	public static void main(String[] args) {
		
		InToString  ii = new InToString(10);
		int oo = (int)ii.clone();
		System.out.println(oo);
		System.out.println(ii.equals(oo));
		System.out.println(ii.toString());
		ii.finalize();
		
		//charAt은 한글자씩 원하는 것을 꺼내온다.
		String s = "Hello";
		char c = s.charAt(0);
		System.out.println(c);
		
		//사전에서의 순서를 기반으로한다. 대상기준 왼쪽은 + 오른쪽은 -
		int i = "aaa".compareTo("aaa");
		int i2 = "aaa".compareTo("cba");
		System.out.println("i: "+i+" i: "+i2);
		
		//문자를 이어줄때 사용한다.
		String s2 = "Hello";
		String s2_1 = s.concat("Java");
		System.out.println(s2_1);
		
		//해당 문자에 포함되어있는지 확인한다.
		String s3 = "JavaSoEz";
		boolean b = s3.contains("so");
		System.out.println(b);
		
		//해당 문자가 지정문자로 끝나는지 확인
		String s4 = "JavaSoEz.java";
		boolean b2 = s4.endsWith("a");
		System.out.println(b2);
		
		//해당 문자가 지정문자와 동일한지 확인
		String s5 = "Java";
		boolean b3 = s5.equals("java");
		System.out.println(b3);
		
		//해당 문자에서 지정문작 몇번에있는지 알려준다.
		String s6 = "Java";
		int b4 = s6.indexOf("v");
		System.out.println(b4);
		
		//해당 문가의 길이를 알려준다.
		String s7 = "My Length";
		int b5 = s7.length();
		System.out.println(b5);
		
		//해당 문자중 선택문자를 원하는 문자로 변경
		String s8 = "Myyyy Length";
		String b6 = s8.replace("My", "mmj");
		System.out.println(b6);
		
		//해당 문자를 선택문자를 기준으로 나눈다.
		String s9 = "dog-cat-snake";
		String[] s9Arr = s9.split("-");
		System.out.println(s9Arr[0]+"/n"+s9Arr[1]+"/n"+s9Arr[2]);
		
		//해당 문자에서 ?에서 ?까지의 문자를 출력 끝 문자는 포함x
		String s11 = "I Love Java";
		String b11 = s11.substring(3,4);
		System.out.println(b11);
		
		//해당 문자를 모두 소문자로 변경
		String s12 = "I Love Java";
		String b12 = s12.toLowerCase();
		System.out.println(b12);
		
		//해당 문자를 모두 대문자로 변경
		String s13 = "I Love Java";
		String b13 = s13.toUpperCase();
		System.out.println(b13);
		
		//해당 문자의 왼쪽 오른쪽 여백을 지운다.
		//문자사이의 여백은 지우지 않는다.
		String s14 = "     My    Trim       ";
		String b14 = s14.trim();
		System.out.println(b14);
		
		//해당 문자를 모두 문자로 변환
		String s15 = String.valueOf(true);
		String s16 = String.valueOf(100);
		String s17 = String.valueOf("a");
		System.out.println(s15+"\n"+s16+"\n"+s17);
		
		
		
	}

}
class InToString{
	
	int a = 10;
	int b;
	String c = "asdf";
	
	protected Object clone(){
		return a;
	}
	InToString(int io){
		a=io;
	}
	@Override
	public String toString() {
		return "InToString [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	@Override
	protected void finalize(){
		System.out.println("aaa");
	}
	
	
}