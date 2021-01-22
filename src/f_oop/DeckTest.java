package f_oop;

import java.util.Arrays;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Default;

public class DeckTest {

	public static void main(String[] args) {
//		//c1 > 기본생성장
//		Card c1= new Card();
//		System.out.println(c1.toString());
//		//c2 > 매개변수 두개2,5 DIAMOND,5
//		Card c2 = new Card(2,5);
//		System.out.println(c2.toString());

		//3번하고
		
		
		//8 카드  한 벌을 만들어 주세요 d
		Deck d = new Deck();
		System.out.println(Arrays.toString(d.c));
		//9 d에서 0번째 카드를 가져오세요 -method
		Card a0 = d.pick(0);
		System.out.println("9 d에서 0번째 카드는? " + a0);
		//10 d에서 임의의 카드를 한장 꺼내주세요  - method
		Card a1 = d.pick();
		System.out.println("d에서 임의의 카드를 한장 "+a1);
		//11 d를 섞어주세요
		d.shuffle();
		System.out.println(Arrays.toString(d.c));
		//11.5 d에서 0번째 카드를 가져오세요 -method
		Card a4 = d.pick(0);
		System.out.println("d에서 0번째 카드"+a4);
		//12 d를 1000번 섞어주세요
		d.shuffle(1000);
		//12.5 d에서 0번째 카드를 가져오세요 -method
		Card a5 = d.pick(0);
		System.out.println("d에서 0번째 카드"+a5);
	}

}

class Card{
	static final int KIND_MAX = 4;//카드 무늬수
	static final int NUM_MAX = 13;//무늬별 카드수

	static final int SPADE = 1;
	static final int DIAMOND = 2;
	static final int HEART = 3;
	static final int CLOBER = 4;
	
	int kind;
	int number;
	
	Card(int kind, int number){
		this.kind = kind;
		this.number = number;
	}
	Card(){
		this(SPADE,1);
	}
	
	@Override
	 public String toString(){
		
		String kind = "";
		String number = "";
		
		switch (this.kind) {
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
		
		switch (this.number) {
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
		}	
		 return kind + " : " + number;
	 }
	
}

class Deck{
	//1. 카드의 수량을 저장할수 있는 변수 CARD_NUM을 Card클래스의상수를 이용하여 초기화하라
	
	static final int CARD_NUM = Card.KIND_MAX*Card.NUM_MAX;
	
	//2.카드를 CARD_NUM만큼 저장해주세요 변수명 c
	Card[] c = new Card[CARD_NUM];
	
	//3.기본생성자를 만들어라
	//단 기본생성자 내에서 c의 모든 방을 카드로 채워주세요 1,1 > 4,13
	Deck(){
		
		int aa=0;
		for(int i=0; i<Card.KIND_MAX; i++){
			for(int k=0; k<Card.NUM_MAX; k++){
				//Card card = new Card(i+1,k+1);
				Card card = new Card(i+1,k+1);
				c[aa] = card;
				aa++;
			}
		}	
	}
	//4.c인자값으로 받은 ?번째방의 카드 한장을 반환하라 pick
	Card pick(int c){
		Card result = this.c[c];
		
		return result;
	}
	//5 c에서 임의의 방번째 카드 한장을 반환해주세요 pick
	//단 4번의 pick메서드를 활용해주세요
	Card pick(){
		int r = (int)(Math.random()*c.length);
		Card result = pick(r);
		return result;
	}
	//6  카드 를 섞어주세요 shuffle
	//단 연습문제 5-6을 활용
	void shuffle(){
		for(int i=0; i<c.length; i++){
			int r = (int)(Math.random()*c.length);
			Card ch;
			ch = c[r];
			c[r] = c[i];
			c[i] = ch;
		}
	}
	//7 카드를 섞어주세요 shuffle
	// 인자 값으로 받은 횟수만큼 반복해주세요 
	// 임의의 방의 카드와 또다른 임의의 방의 카드를 바꿔주세요
	void shuffle(int a){
		for(int i=0; i<a; i++){
			int r=(int)(Math.random()*c.length);
			int r2=(int)(Math.random()*c.length);
			Card ch;
			ch = c[r];
			c[r] = c[r2];
			c[r2] = ch;
		}
	}
	
}

