package f_oop2;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnoInner_01 {

	public static void main(String[] args) {
		
		Button b = new Button("민선버튼");
		
		ActionListener ac = new EventHandler();
		
		b.addActionListener(ac);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("민선버튼 눌림");
				
			}
			
		});

	}

}

class EventHandler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("민선버튼 눌림");
		
	}
	
	
}