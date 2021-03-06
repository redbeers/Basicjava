package f_oop2;

import java.util.Vector;

public class ProductTest_01 {
	public static void main(String[] args) {

		Computer c = new Computer(200, "LG gram");
		Phone hp = new Phone(100, "S20");
		Styler st = new Styler(400, "LGStyler");

		Buyer b = new Buyer("길민선", 1000);

		DBClass db = new DBClass();
		boolean result = db.addBuyer(b);

		b.buy(st);
		b.buy(st);
		b.buy(hp);
		b.buy(hp);

		b.summary();

		b.refund(hp);

	}

}

class Product{
	int price;
	String name;
	int mileage;

	public Product(int price, String name){
		this.price = price;
		this.name = name;
		mileage = price/10;
		
	}
	
}

class Computer extends Product{
	
	public Computer(int price, String name){
		super(price, name);
	}

	@Override
	public String toString() {
		return "Computer";
	}
	
}

class Phone extends Product{
	public Phone(int price, String name){
		super(price, name);
	}
	@Override
	public String toString() {
		return "Phone";
	}
}
class Styler extends Product{

	public Styler(int price, String name) {
		super(price, name);
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
	
	Vector<Product> item = new Vector<>();//구매내역
	
	public Buyer(String name, int money){
		this.name = name;
		this.money = money;
	}
	
	void buy(Product p){
		if(money<p.price){
			System.out.println("한도초과로 구매가 불가능합니다");
			return;
		}
		money -= p.price;
		mileage += p.mileage;

		item.add(p);
		System.out.println(p + "을 구매하셨습니다. 감사합니다");
	}

	void summary(){
		System.out.println();
		System.out.println("===영수증===");
		System.out.println();
		System.out.println("구매내역");
		int sum = 0;
		
		if(item.size()==0){
			System.out.println("구매내역이 없습니다");
			return;
		}
		
		for(int i=0;i<item.size();i++){//가지고 있는 객체개수 size
			
			//System.out.println(item.get(0));
			//3;
			
			Product p = item.get(i);//오른쪽을 Product타입으로 형변환!//Product 안써도 된다 위에 벡터에서 <>사이에 Product 써주면
			
			System.out.println(p.name + "\t" + p.price + "만원");
			sum += p.price;
			
		}
		System.out.println("합계\t" + sum + "만원" );
		System.out.println();
		System.out.println(name+" 고객님의 남은 돈은 " + money +"만원이고 마일리지는 " + mileage +"입니다");
		System.out.println("고객님 감사합니다");
		
	}
	

	
	//반품 refund()
	//1. 물건은 구매한 적이 없는 경우->반품불가

	//2. 자신이 구매한 물건일때만 반품이 가능해야한다
	// 
	
	
	void refund(Product p){
		System.out.println();
		System.out.println("===반품진행===");
		
		//1. 구매내역 없음
		if(item.size()==0){//item.isEmpty()
			System.out.println("물품구매내역이 없어 반품불가합니다");
			return;
		}	
			//2. 1)구매내역 존재하는데 여기서 구매한것이 아니다->
		if(item.contains(p)){
			item.remove(p);
			money += p.price;
			mileage -= p.mileage;

			
			System.out.println(p + "상품을 반품해드리겠습니다");
			System.out.println(name+" 고객님의 남은 돈은 " + money +"만원이고 마일리지는 " + mileage +"입니다");
			
			
			//2. 2) 구매내역 확인
		} else {
			System.out.println("저희 매장에서 구매한 내역이 확인되지 않아 반품불가합니다");
		}
		
		
	}
	

	//추가문제
	//1. 물건의 수량을 관리할 수 있도록 해주세요
	//2. 여러 사람을 관리할 수 있도록 해주세요
	
	
	
	//영수증
	//summary()
	/*
		영	수	증
		
	구매내역
		Styler 400만원
		Styler 400만원
		Handphone 200만원
		합계	1000만원
		
		xx 고객님의 남은 돈은 xx이고 마일리지는 xx입니다
		고객님 감사합니다.
	 */
		
}

//////////////////////////////////////////////////////////////////////////////////////////////////




//3. 벡터 만들때 필요한 것들 구매내역 클래스
class Sale{
	//private String date;
	//static int seq = 1;
	
	public int mount;
	public String mem_name;
	public String pro_name;
	
	


}










class DBClass{
	//1. 사람들
	Vector<Buyer> buyers = new Vector<>();
	
	public boolean addBuyer(Buyer b){
		boolean result = buyers.add(b);
		return result;
	}
	

	
	
	//2. 물건들
	Vector<Product> product = new Vector<>();
	

	
	
	//3. 구매내역
	Vector<Sale> sale = new Vector<>();
	

	
	
	
}
	
	
	
	

















