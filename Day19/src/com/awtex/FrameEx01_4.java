package com.awtex;

import java.awt.*;
import java.awt.event.*;

public class FrameEx01_4 extends Frame {

	public FrameEx01_4() {
		super("이벤트1");
		setSize(300, 200);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		
		new FrameEx01_4();
	}

}
