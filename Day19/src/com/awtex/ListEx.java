package com.awtex;

import java.awt.*;
public class ListEx extends Frame{

	String a;
	
	
	private Label la = new Label("과목 이름");
	private List li = new List(4,true);
	
	private Button bt = new Button("확인");
	
	private String[]name = {"Java","Jsp","Database","Spring"};
	
	
	
	public ListEx(String[]a) {
		
	super("List Test");
	
	
	
	this.name = a;
	
	
	
	
	setLayout(new BorderLayout());
	for(int i =0; i<name.length; i++) {
		li.add(name[i]);
		
	}
		
	add("North",la);
	add("Center",li);
	add("South",bt);
	
	
	li.setFont(new Font("궁서체",Font.BOLD,30));
	
	
		WinEvent w = new WinEvent();
		setSize(500, 400);//화면크기
		setVisible(true); // true = 보임 // false = 안보임
		addWindowListener(w);
			
		
	}
	
	
	public static void main(String[] args) {
		String[]a= {"Java","Jsp","Database","Spring"};
		new ListEx(a);
		//new ListEx(args);
	
	
	}

}
