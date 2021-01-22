package j_jollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetTest_01 {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		
//		for(int i=0; i<10; i++){
//			int ran = (int)(Math.random()*5);
//			boolean re = set.add(ran);//오토박싱
//			System.out.println(re);
//		}
//		System.out.println(set);
		
		//로또번호 6개 저장하기5 묶음만들기
		while(set.size() < 6){
			
			int ran = (int)(Math.random()*46+1);
			boolean re = set.add(ran);
			System.out.println(set);
			
		}
		
		//정렬
		List<Integer> list1 = new ArrayList<>(set);
		Collections.sort(list1);
		System.out.println(list1);
		
	}

}
