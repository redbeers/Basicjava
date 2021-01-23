package f_oop;

public class TimeTest {
	public static void main(String[] args) {
		TimeVO tt = new TimeVO();
		
		tt.setHour(6);
		tt.setMinute(356);
		tt.setSeconds(7313);
		System.out.println(tt.time());
	}
}
//시간 6
//분   356 => 11: 56
//초   7200+60+53 => 7313 => 13시 :  57분 : 53초

//1시간은 1시간
//1시간은 60분
//1시간은3,600초

//시간 22
//분   1434 => 21시 : 54분
//초   10800 + 600 + 23 => 11423  1시 : 4분 : 23초
class TimeVO{
	private int hour;
	private int minute;
	private int seconds;
	
	void setHour(int hour){
		this.hour = hour%24;
		
		
	}
	void setMinute(int minute){
		this.minute = minute%60;
		setHour(hour+minute/60);
	}
	void setSeconds(int seconds){
		this.seconds = seconds%60;
		setMinute(minute+seconds/60);
	}
//	setSeconds(int seconds){
//		
//	}
	String time(){
		String r = hour +"시" + minute+"분" + seconds+"초";
		return r;
	}
}