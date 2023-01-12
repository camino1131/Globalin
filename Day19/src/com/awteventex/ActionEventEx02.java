package com.awteventex;

import com.awtex.WinEvent;

import java.awt.*;
import java.awt.event.*;

public class ActionEventEx02 extends Frame implements ActionListener {

	private Button bt = new Button("종료");

	public ActionEventEx02() {

		super("ActionEvent Test2");

		setLayout(new FlowLayout());

		add(bt);

		WinEvent w = new WinEvent();
		setSize(300, 200);// 화면크기
		setVisible(true); // true = 보임 // false = 안보임
		addWindowListener(w);
		bt.addActionListener(this);

	}

	public static void main(String[] args) {
		new ActionEventEx02();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == bt) {
			System.exit(0);
		}
	}

}
