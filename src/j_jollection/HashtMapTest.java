package j_jollection;

import java.util.HashMap;
import java.util.Map;

public class HashtMapTest {

	public static void main(String[] args) {
		
		Map<String, Integer> params = new HashMap<>();
		
		params.put("상빈아", new Integer(100));
		params.put("뭐지", 1);//오토박싱
		params.put("상빈아뭐야~~", 10000);
		
		System.out.println(params.put("상", 50));
		int tkd = params.get("상");
		System.out.println(tkd);//키값을 통해 벨류값을가져온다.
		params.remove("상");
		System.out.println(params);
		

	}

}
