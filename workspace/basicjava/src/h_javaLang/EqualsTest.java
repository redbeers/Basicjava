package h_javaLang;

public class EqualsTest {

	public static void main(String[] args) {
		Person p1 = new Person(9308271000000L);
		Person p2 = new Person(9308271000000L);
		
		Value v1 = new Value(10);
		
		System.out.println(p1==p2);//주소를 비교하기 때문에 false가 나온다
		System.out.println(p1.equals(p2));
		//
	}

}


class Person{
	long id;
	public Person(long id) {
		this.id = id;
	}
	public boolean equals(Object obj) {
//		//1. 인자값 null
//		boolean re = false;
//		
//		//2.인자값이 Person의 객체 인지 확인
//		if(obj != null && obj instanceof Person){
//			Person p = (Person)obj;
//			re = p.id  == id;
//		}
//		return re;
		Person p = (Person)obj;
//		boolean p = ((Person)obj).id == this.id;
		return this.id == p.id;
//		return p;
	}
	
}