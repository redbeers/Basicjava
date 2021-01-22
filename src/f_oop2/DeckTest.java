package f_oop2;

import java.util.Arrays;

public class DeckTest {
	public static void main(String[] args) {
/*		//c1 -> 기본생성자 (스페이드, 1 )  실제로는 1,1
		
		Card c1 = new Card();
		System.out.println(c1.toString());
		
		//c2 -> 매개 변수 두개 ( 다이아몬드, 5 ) 실제로는 2,5
		
		Card c2 = new Card(2,5);
		System.out.println(c2.toString());*/
		

		
		//8. 카드 한 벌을 만들어주세요 변수명 d
		Deck d = new Deck();
		System.out.println(Arrays.toString(d.c));
		
		
		//9. d에서 0번째 카드를 가져오세요 (메서드 활용 ) 픽 첫번째꺼
		Card c1 = d.pick(0);
		
		System.out.println(c1);
		
		//10. d에서 임의의 카드를 한 장 꺼내주세요(메서드 활용) 픽 두번째꺼
		Card c2 = d.pick();
		System.out.println(c2);
		//System.out.println(result02);
		//11. d를 섞어주세요-셔플 첫번째꺼
		d.shuffle();
		
		//11.5 d에서 0번째 카드를 가져오세요 메서드 활용
		Card result03 = d.pick(0);
		System.out.println(result03);
		
		//12. d를 1000번 섞어주세요 -셔플 두번째꺼 
		d.shuffle(1000);
		
		//12.5 d에서 0번째 카드를 가져오세요 메서드 활용
		Card result04 = d.pick(0);
		System.out.println(result04);
		//13. JVM 그려오세요
					
	}

}

//그래서 카드부터 만든다
class Card{
	static final int KIND_MAX = 4;//카드 무늬수
	static final int NUM_MAX = 13;//무늬별 카드수(고정이 되어있어야 함)
	
	static final int SPADE = 1;
	static final int DIAMOND = 2;
	static final int HEART = 3;
	static final int CLOVER = 4;
	
	
	int kind;
	int number;
	
	Card(int kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	Card(){
		this(SPADE, 1);
	}
	
	@Override//부모꺼 맘에 안들어서 자식꺼 바꿈 자식것이 먼저
	public String toString(){
		String kind = "";
		String number = "";
		
		switch(this.kind){
		case 1:
			kind = "SPADE";
			break;
		case 2:
			kind = "DIAMOND";
			break;
		case 3:
			kind = "HEART";
			break;
		default:
			kind = "CLOVER";
			break;
		}
		
		switch(this.number){
		case 1:
			number = "A";
			break;
		case 11:
			number = "J";
			break;
		case 12:
			number = "Q";
			break;
		case 13:
			number = "K";
			break;
		default:
			number += this.number;
			break;
		}
		return kind + " : " + number;
	}	
	
}

class Deck{//카드들의 집합
	//1. 카드의 수량을 저장할 수 있는 변수 CARD_NUM을 Card클래스의 상수를 이용하여 초기화 해주세요
	static final int CARD_NUM = Card.NUM_MAX*Card.KIND_MAX;//여기서 카드 클래스 생김!!!
	
		
	//2. 카드를 CARD_NUM의 개수만큼 저장해주세요 변수명 c
	//c에다 카드를 저장하는 것
	//카드를 52장 c에다 저장해라
	
	 Card[] c = new Card[CARD_NUM];

	//3. 기본 생성자를 만들어주세요
	//	 단. 기본생성자 내에서 c의 모든 방을 카드로 채워주세요 1,1->4,13
	
	 Deck(){
		 for(int i=0;i<Card.KIND_MAX;i++){
			 for(int j=0;j<Card.NUM_MAX;j++){
				 c[j+i*13] = new Card(i+1, j+1);
			 }
		 }
	 }

	//4. c에서 인자값으로 받은 번째 방의 카드 한 장을 반환해주세요  pick
	Card pick(int i){
		Card result = c[i];
		return result;
	}
	
	//5. c에서 임의의 방번째 카드 한 장을 반환해주세요 메서드 명 pick
	//단 4번의 pick메서드를 활용해주세요
	Card pick(){
		int random = (int)(Math.random()*CARD_NUM);
		//Card result = c[random];-->배열로 하면 JVM 힘들다
		Card result = pick(random);
		return result;
	}

	//6. 카드를 섞어주세요 shuffle
	// 단 연습문제 5-6번을 활용해주세요
	void shuffle(){
		for(int i=0;i<CARD_NUM;i++){
			int r = (int)(Math.random()*CARD_NUM);
			Card temp;
			temp = c[i];
			c[i] = c[r];
			c[r] = temp;
		}
	}
	
	
	//7. 카드를 섞어주세요 shuffle 메서드명
	// 인자값으로 받은 횟수만큼 반복해주세요
	//임의의 방의 카드와 또다른 임의의 방의 카드를 바꿔주세요
	void shuffle(int count){
		for(int i=0; i<count;i++){
			int r1 = (int)(Math.random()*CARD_NUM);
			int r2 = (int)(Math.random()*CARD_NUM);
			Card temp;
			temp = c[r1];
			c[r1] = c[r2];
			c[r2] = temp;
		}
	}
	
	
}