package com.awtex;


import java.awt.*;
public class CheckboxGroupEx extends Frame{

	private GridLayout gl = new GridLayout(4,1);
	private Label la = new Label("gender?");
	private CheckboxGroup cg= new  CheckboxGroup();
	private Checkbox man = new Checkbox("M",cg, true);
	private Checkbox woman = new Checkbox("w",cg, true);
	private Button bt = new Button("Confirm");
	public CheckboxGroupEx() {
		
		
		setLayout(gl);	
		
	
		add(la);
		add(man);
		add(woman);
		add(bt);
		
		WinEvent w = new WinEvent();
		//	setBounds(300, 300, 300, 200);		// SetBounds(길이, 크기, 가로, 세로)
			setLocation(500, 500);
			//setSize(300, 200);
			pack();											// 최소 크기
			setVisible(true);
			addWindowListener(w);
	
	
	
	}
	public static void main(String[] args) {
		
	new CheckboxGroupEx();
	
	
	}	

}
