package f_oop2;

public class TimeTest {
	public static void main(String[] args) {
		TimeVO tm = new TimeVO();
		tm.setHour(24);

		tm.setMinute(60);

		tm.setSecond(60);
		
		String result = tm.getTime();
		System.out.println(result);
		
	}
}

class TimeVO{
	private int hour;
	private int minute;
	private int second;
	
	void setHour(int hour){
		if(hour>23){
			this.hour = hour%24;
		}else{
			this.hour = hour;
		}
	}
	
	
/*	void setMinute(int minute){
		if(minute>59){
			
			this.minute = minute%60;
			this.hour += minute/60;
		
		}else{
			this.minute = minute;
		}
	}*/
	
	
	void setMinute(int minute){
		setHour(hour + minute/60);
		this.minute = minute%60;
	}
	
	
	
	
	/*void setSecond(int second){
		if(second>59){
			
			this.second = second%60;

			int m = second/60;
			setMinute(minute+m);
			
			if(hour>23){
				this.hour = hour%24;
			}
			
		}else{
			this.second = second;
		}
	}*/
	
	
	void setSecond(int second){
		setMinute(minute + second/60);
		this.second = second%60;
	}
	
	
	

	String getTime(){
		String result = "" + hour+ "," + minute+ "," + second;
		return result;
	}

}