package g_exception;

import java.sql.SQLClientInfoException;
import java.sql.SQLException;

public class Exception_05 {

	public static void main(String[] args) {
		Controller.controllerMethod();

	}

}
class Controller{
	static void controllerMethod() {
		Service.serviceMethod();
	}
}
class Service{
	static void serviceMethod() {
		try{
			Dao.serviceMethod();
			
		}catch (SQLException e){
			e.printStackTrace();
			System.out.println("😎");
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}
}
class Dao{
	
	static void serviceMethod() throws SQLException, Exception{//여러개의 예외를 넘길수 있다.
		
		throw new SQLException();
	}
}