package f_oop;

import java.util.ArrayList;
import java.util.Vector;

public class ProductTest_01 {

	public static void main(String[] args) {
		
		
		
		Computer computer = new Computer(200, "삼보", 10);
		HandPhone handPhone = new HandPhone(400, "애플폰", 10);
		Styler styler = new Styler(500, "삼성", 10);
		
		Buyer buyer = new Buyer("호구",1000);
		buyer.buy(styler);
		buyer.buy(styler);
		buyer.buy(handPhone);
	
		System.out.println();
		
		//sum
		//buyer.summary(buyer.item);
		//System.out.println(buyer.item);
		
//		buyer.summary();
		//반품

		

		//sum
	}

}

class Product{
	int price;
	String name;
	int count;
	int mileage;
	
	public Product(int price, String name, int count) {
		this.price = price;
		this.name = name;
		this.count= count;
		mileage = price/10;
	}
	
}

class Computer extends Product{
	public Computer(int price, String name, int count ) {
		super(price, name, count);
		
	}
	@Override
	public String toString() {
		return "Computer";
	}
}

class HandPhone extends Product{

	public HandPhone(int price, String name,int count) {
		super(price, name,count);
	}

	@Override
	public String toString() {
		return "HandPhone";
	}
}
class Styler extends Product{

	public Styler(int price, String name, int count) {
		super(price, name, count);
	}
	@Override
	public String toString() {
		return "Styler";
	}	
}
class Buyer{
	String name;
	int money;
	int mileage;
	int count;
	Vector item = new Vector();//구매내역
	Vector item1 = new Vector();//물건명단
	Vector item2 = new Vector();//사람명단

	
	
	public Buyer(String name, int money){
		this.name = name;
		this.money = money;
	}
	void buy(Product p){
		
		if(money < p.price){
			System.out.println("돈들고 오세요");
			return;
		}
		
		money -= p.price;
		mileage += p.mileage;
		item.add(p);
		System.out.println(p+"사주셔서 감사합니다.");
		

	}
	void summary(){
		System.out.println("영\t수\t증");
		int sum = 0;
		for(int i=0; i<item.size(); i++){
			Product a = (Product)item.get(i);
			System.out.println(item.get(i)+"\t"+a.price);
			sum +=a.price;
		}
		
		System.out.println("총합계"+sum);
		System.out.println(name+" 고객님의 남음돈은 "+money+"이고 마일리지는 "+mileage+"입니다.\n감사합니다.");
	}
	
	void refund(Product p){
		if(item.remove(p)){
			mileage -= p.mileage;
			money += p.price;
			System.out.println(name+" 고객님의 남음돈은 "+money+"이고 마일리지는 "+mileage+"입니다.\n감사합니다.");
			return;
		}
			System.out.println("산적이 없습니다.");
	}
	
	
	// summary()
	/*
	 * 영	수	 증
	 * 구매내역
	 * 	Styler 500원  
	 * 	Styler 500원
	 * 총합계  1000
	 * 
	 * ?? 고객님의 남은돈은 ?? 이고 마일리지는 ??입니다.
	 * 호갱님 감사합니다.
	 * 
	 *반품 refund
	 *
	 *1. 물건은 구매한 적이 없는경우
	 *2. 자신이 구매한 물건일때만 반품이 가능
	 *          
	 *1.물건의 수량을 관리할수 있도록 해주세요
	 *2.여러사람을 관리할 수 있도록 해주세요
	 */
	//사람 저장, 물건저장
}
