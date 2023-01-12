package homework;

import java.awt.*;
import java.awt.event.*;


public class ActionEventEx01 extends Frame implements ActionListener{

	private TextField tf = new TextField(10);
	private Button[] bt = new Button[4];
	private Panel[] pp = new Panel[4];
	private Color[] cc = { Color.red, Color.green, Color.blue, Color.yellow };

	private CardLayout card = new CardLayout();
	private Panel pptop;
		
	public ActionEventEx01() {

			super("ActionEvent Test");
			
			setLayout(new FlowLayout());
			add(tf);
		
			setSize(300, 200);	
			WinEvent w = new WinEvent();
			setVisible(true);
			addWindowListener(w);
			tf.addActionListener(this);
		}
		
		public static void main(String[] args) {
			
			new ActionEventEx01();
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
		
			if(e.getSource()==tf){
				String str = tf.getText();
				System.out.println("메세지 :"+str);
				tf.setText("");
			}
		
	}

}
