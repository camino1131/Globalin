package com.awteventex;

import java.awt.*;
import java.awt.event.*;
import com.awtex.WinEvent;

public class MouseMotionEventEx extends Frame implements MouseMotionListener{

	public MouseMotionEventEx() {
		super("Mouse Motion Test");
		
	
	addMouseMotionListener(this);
		
	WinEvent w = new WinEvent();
	setSize(300, 200);// 화면크기
	setVisible(true); // true = 보임 // false = 안보임
	addWindowListener(w);
	
	}
	public static void main(String[] args) {
		
		new MouseMotionEventEx();
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		if(e.getSource() == this) {
			System.out.println("x : "+e.getX()+",y :" +e.getY());
		
		}
	}
	@Override
	public void mouseMoved(MouseEvent e) {
				
		
	}
}
