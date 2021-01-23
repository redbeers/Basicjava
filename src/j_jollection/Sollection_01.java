package j_jollection;

import java.util.Hashtable;
import java.util.Map;

public class Sollection_01 {

	public static void main(String[] args) {
		/*
		 * 1.Collection Framework
		 * 	-의미
		 * 		collection -> 다수의 데이터를 그룹으로 저장한다.
		 * 		FrameWork -> 표준화가 가능하다.
		 * 
		 * 2.핵심 interface
		 * 	-List
		 * 		숫서가 있다.
		 * 		데이터의 중복을 허용한다.
		 * 		ArrayList, LinkedList, Stack...
		 * 		대기자 명단
		 * 	-set
		 * 		순서가 없다.
		 * 		데이터의 중복을 비허용한다.
		 * 		HashSet, TreeSet
		 * 		양의 정수의 집합
		 * 	-Map
		 * 		순서가 없다.
		 * 		key와 value로이루어져 있다.
		 * 		key는 중복을 비허용한다.
		 * 		value는 중복을 허용한다.
		 * 		우편번호, 지역번호 , 두개를 매칭????
		 * 3.List
		 * 	-Vector와 ArrayList
		 * 		Vector는 동기화를 보장한다.
		 * 		추가 수정이 불편하다 수정하면 빈곳의 뒤는 다 밀리고 당겨진다.
		 * 	-linkedList
		 * 	배열의 단점을 보완하기 위해 만들어짐
		 * 	자신의 데이터와 다음 요소의 주소값을 데이터로 가지고있다.
		 * 	동기화가 오래걸린다 > 꼬리의 주소를 가지고있다.
		 * 	앞에 뭐가있는지모른다.
		 * 	-DoubluLinkedList
		 * 	자신의 데이터, 다음요소의 주소, 이전요소의 주소를 데이터로 가지고 있다.
		 * 	로드가 한참걸린다.
		 * 	머리주소를 가지고있다.
		 * 
		 * -Stack과 Queue
		 * 	Stack
		 * 		FILO, LIFO
		 * 		저장	push()
		 * 		추출 pop() 한번 꺼내면 지워진다.
		 * 		맨위의 객체를 반환 peek()
		 * 		주어진 객체 찾기 search()
		 * 	Queue
		 * 		FIFO
		 * 		저장 offer()
		 * 		추출 poll()
		 * 		
		 * 4. set
		 * 	-set인터페이스를 구현한 구현체중 대표는 HashSet이다.
		 * 	-내부적으로 HashMap으로 구성되어있다.
		 * 
		 * 5.Map
		 * 	-key,value로 이루어져있다.
		 * 	-HashMap은 HachTable의 최신번임으로 HashTable사용하지 않는다.
		 * 
		 * 
		 */
		Map<String, String> tt= new Hashtable<>();

	}

}
