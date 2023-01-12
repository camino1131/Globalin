package com.awtex;

import java.awt.*;


public class CheckboxEx extends Frame{

		private Label lb = new Label(" like fruit  ?");
		private Checkbox[]cb= {new Checkbox("Banana",true),
			new Checkbox("strawberry"), new Checkbox("pineapple")};
		private Button bt = new Button("confirm");
		
		public  CheckboxEx() {
			super("Checkbox Test");
		
			setLayout(new GridLayout(5,1));
		
			add(lb);
			
			for(int i =0; i<cb.length; i++) {
				add(cb[i]);
		
		}
				add(bt);
		
			WinEvent w = new WinEvent();
		//	setBounds(300, 300, 300, 200);		// SetBounds(길이, 크기, 가로, 세로)
			setLocation(300, 300);
			//setSize(300, 200);
			pack();											// 최소 크기
			setVisible(true);
			addWindowListener(w);
			

	}
	
	
	public static void main(String[] args) {
		
	}
	
	

}
