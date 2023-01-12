package com.awtex;

import java.awt.*;
import java.awt.event.*;

public class FrameEx01_3 extends Frame {

	public FrameEx01_3() {
		super("이벤트1");
		setSize(300, 200);
		setVisible(true);
		WinEventEx01_3 ww = new WinEventEx01_3();
		addWindowListener(ww);
	}
	
	class WinEventEx01_3 extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		
		new FrameEx01_3();
		

	}

}
