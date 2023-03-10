package com.awtex;

import java.awt.*;

public class ButtonEx extends Frame {

	private String[] str = { "7", "8", "9", "4", "5", "6", "1", "2", "3", "#", "0", "*" };
	private Button[] bt = new Button[str.length];

	public ButtonEx() {

		super("Button Test");

		// 레이아웃 설정
		setLayout(new GridLayout(4, 3, 5, 5));

		for (int i = 0; i < bt.length; i++) {
			
			bt[i] = new Button(str[i]);
			bt[i].setFont(new Font("궁서체", Font.BOLD, 30));
			add(bt[i]);
			
			setSize(300, 200);
			setVisible(true); // true = 보임 // false = 안보임
			WinEvent ww = new WinEvent();
			addWindowListener(ww);
		}

	}
	public static void main(String[] args) {
		new ButtonEx();
	}
}