package h_javaLang;



import com.sun.corba.se.spi.oa.OADefault;

public class WrapperTest_01 {

	public static void main(String[] args) {
		
		Boolean i1 = new Boolean(true);
		Character i2 = new Character('a');
		
		Integer i3 = new Integer(100);
		Integer i4 = new Integer(100);

		System.out.println(i3 == i4);
		System.out.println(i3.equals(i4));
		System.out.println(i3);
		//주소가아닌 값이아오는것은 tnString을 오버라이드하고있다
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);//4의 32비트를 표현한다.
		
		//JDk1.8
		//Integer.BYTES는 1.8에서 생겼다
		
		Integer[] i5 = new Integer[3];
		Integer ii = new Integer(100);
		Integer iii = new Integer(100);
		Integer iiii = new Integer(100);
		i5[0]=10;
		i5[1]=iii;
		i5[2]=iiii;//오토박싱
		
		int i6 = i5[1];//기본형으로 푸는 과정 언박싱 이라고한다.
		
		Object[] obj = new Object[1];
		obj[0] = 10; //오토박싱+업케스팅
		
		Object o2 = (int)obj[0];//다운캐스팅 + 언박싱 +자동형변환
		
		
		
		
		
		
		
	}

}
