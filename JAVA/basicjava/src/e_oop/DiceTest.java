package e_oop;

import java.util.Scanner;

public class DiceTest {

	public static void main(String[] args) {
		
		//2.throwDice메서드를 호출
		//재귀호출을 이용해서 만들어라
		
		//3.  JVM에서는 3-3, 4-4, 3-1
		DoubleDice dd = new DoubleDice();
		int av = dd.throwDice();
		System.out.println(av);
	}

}
class DoubleDice{
	
	//1. 주사위 2개를 던져서 그합을 반환하는  throwDice메서드 생성
	// 단 . 두개의 주사위가 같으면 한번더 던진다.
	int throwDice(){//클래스 변수를 사용하지 않는다면 클래스 메서드로 만들지말라
		int dice1=(int)(Math.random()*6+1);
		int dice2=(int)(Math.random()*6+1);
		int sum = dice1 + dice2;
		System.out.println(dice1 + " "+dice2);
		
		if(dice1==dice2){
			sum += throwDice();
		}
		
		return sum;
	}
	
}