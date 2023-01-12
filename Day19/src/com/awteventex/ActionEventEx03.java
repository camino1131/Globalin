package com.awteventex;

import java.awt.*;
import java.awt.event.*;

import com.awtex.WinEvent;

public class ActionEventEx03 extends Frame implements ActionListener {

	private Button[] bt = new Button[6];
	private Panel[] pp = new Panel[6];
	private Color[] cc = { Color.red, Color.green, Color.blue, Color.yellow, Color.CYAN, Color.DARK_GRAY };

	private CardLayout card = new CardLayout();
	private Panel pptop;

	public ActionEventEx03() {

		super("ActionEvent Test3");
		setLayout(new BorderLayout());
		Panel p = new Panel(new GridLayout(1, 4));

		for (int i = 0; i < bt.length; i++) {
			bt[i] = new Button(i + 1 + "번 버튼");
			bt[i].addActionListener(this);
			p.add(bt[i]);
		}

		add("North", p);

		pptop = new Panel(card);
		for (int i = 0; i < pp.length; i++) {
			pp[i] = new Panel();
			pp[i].setBackground(cc[i]);
			pptop.add("" + i, pp[i]);
		}

		add("Center", pptop);
		card.show(pptop, "0");

		WinEvent w = new WinEvent();
		setSize(300, 200);// 화면크기
		setVisible(true); // true = 보임 // false = 안보임
		addWindowListener(w);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		for (int i = 0; i < 6; i++) {
			if (e.getSource() == bt[i]) {
				card.show(pptop, "" + i);
			}
		}

	}

	public static void main(String[] args) {
		
		new ActionEventEx03();
		
	}
}
