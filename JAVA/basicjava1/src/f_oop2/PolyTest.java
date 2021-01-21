package f_oop2;

public class PolyTest {
	public static void main(String[] args) {
		
		//1. SmartTv 2대 저장해주세요
		SmartTv stv1 = new SmartTv();
		SmartTv stv2 = new SmartTv();
		
		SmartTv[] stv =  new SmartTv[2];
		stv[0] = stv1;
		stv[1] = stv2;
		//2. AfreecaTv 3대 저장해주세요
		AfreecaTv af1 = new AfreecaTv();
		AfreecaTv af2 = new AfreecaTv();
		AfreecaTv af3 = new AfreecaTv();
		
		AfreecaTv[] af = new AfreecaTv[]{af1, af2, af3};
		
		//3. ThreeDTv 4대 저장해주세요
		ThreeDTv tdt1 = new ThreeDTv();
		ThreeDTv tdt2 = new ThreeDTv();
		ThreeDTv tdt3 = new ThreeDTv();
		ThreeDTv tdt4 = new ThreeDTv();
		
		ThreeDTv[] tdt = new ThreeDTv[]{tdt1, tdt2, tdt3, tdt4};
		
		
		Tv[] t = new Tv[9];
		t[0] = (Tv)stv1;//더쎈쪽이니까 생략가능한 것
		t[1] = stv2;
		
		
		t[2] = af1;
		t[3] = af2;
		t[4] = af3;
		
		
		t[5] = tdt1;
		t[6] = tdt2;
		t[7] = tdt3;
		t[8] = tdt4;
		
		AfreecaTv a = (AfreecaTv)t[3];
		a.starBallon();
		
		
	}

}



class Tv{
	boolean power;
	int channel;
	
	void power(){
		power = !power;
	}
	
	void channelUp(){
		channel++;
	}
	
	void channelDown(){
		channel--;
	}
}
	
	
class SmartTv extends Tv{
	void internet(){
		
	}
}
	


class AfreecaTv extends Tv{
	void starBallon(){
		
	}
	
}
	
class ThreeDTv extends Tv{
	void a(){
		
	}
}
	
	
