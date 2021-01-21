package aaa;

public class Qn3_9 {

	public static void main(String[] args) {
		int sum = doubleDice();
		System.out.println(sum);

	}
	 static int doubleDice(){
		 int firstDice = (int)(Math.random()*6+1);
		 int secondDice = (int)(Math.random()*6+1);
		 int result = secondDice + firstDice;
		 
		 if(secondDice == firstDice){
			 return result + doubleDice();
		 }
		 return result;
	 }
}
