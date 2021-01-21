package f_oop;

public class PolyTest {

	public static void main(String[] args) {
		// SmartTv 2대 저장
		SmartTv stv1 = new SmartTv();
		SmartTv stv2 = new SmartTv();
		SmartTv[] tv1 =new SmartTv[2];
		tv1[0] = stv1;
		tv1[1] = stv2;
		//AfrecarTv 3대 저장해주세요
		AfrecaTv atv1 = new AfrecaTv();
		AfrecaTv atv2 = new AfrecaTv();
		AfrecaTv atv3 = new AfrecaTv();
		AfrecaTv[] tv2 ={atv1, atv2, atv3};
		
		//ThreedTv 4대 저장해주세요
		ThreedTv ttv1 = new ThreedTv();
		ThreedTv ttv2 = new ThreedTv();
		ThreedTv ttv3 = new ThreedTv();
		ThreedTv ttv4 = new ThreedTv();
		ThreedTv[] tv3 = {ttv1, ttv2, ttv3, ttv4};
		

		Tv[] t = new Tv[9];
		t[0] =stv1;
		t[1] =stv2;
		
		t[2] =atv1;
		t[3] =atv2;
		t[4] =atv3;
		
		
		t[5] =ttv1;
		t[6] =ttv2;
		t[7] =ttv3;
		t[8] =ttv4;
		
		AfrecaTv a= (AfrecaTv)t[3];
		a.starBallon();
		
	}

}


class Tv{
	boolean p;
	int ch;
	
	void Power(){
		p = !p;
	}
	
	void Chup(){
		ch++;
	}
	void Chdw(){
		ch--;
	}
}

class SmartTv extends Tv{
	void interNet(){
		
	}
}
class AfrecaTv extends Tv{
	void starBallon(){
		
	}
}
class ThreedTv extends Tv{
	void auziruwo(){
		
	}
}