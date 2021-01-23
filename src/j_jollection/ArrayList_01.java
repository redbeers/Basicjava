package j_jollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class ArrayList_01 {

	public static void main(String[] args) {
		
		
		List<Integer> list1 = new ArrayList<>();//항상 인테페이스로 만들어야하낟.
		list1.add(5);
		list1.add(2);//오토박싱!!!!!
		list1.add(3);
		list1.add(new Integer(1));//오토박싱않한거!!!!
		list1.add(new Integer(4));
		
		List<Integer> list2 = new ArrayList<>(list1.subList(1, 3));
		System.out.println(list1);//toString메서드가 오버라이드 되어있다.
		System.out.println(list2);
		
		System.out.println(list1.contains(list2));
		//해당 객체를 포함하고있는지
		System.out.println(list2.containsAll(list2));
		//해당 요소를 물어본다.
		
		
		list1.add(1, 50);
		System.out.println(list1);
		list1.add(6, 90);
		System.out.println(list1);
		//사이즈보다 2크면 넣을수없다.
		
		list1.remove(2);
		//2라는 값을 지운것이다.
		System.out.println(list1);
		list1.remove(new  Integer(2));
		Integer i1 = list1.remove(2);
		
		System.out.println(i1);
		System.out.println(list1);
		
		System.out.println(list1.set(2, 900));//3번방이 아니고 3의 값이 변한것이다.
		
		
		
		//메서드다써보기 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		Collections.sort(list1);
		System.out.println(list1);
		

	}

}
