package com.awtex;
import java.awt.*;

import java.awt.FileDialog;

public class FileDialogEx extends Frame{


		private FileDialog fd = new FileDialog(this,"MY Save", FileDialog.SAVE);
	
		public FileDialogEx() {
		super("FileDialog Test");
		
		WinEvent w = new WinEvent();
		setSize(300, 200);										// 최소 크기
		setVisible(true);
		
		fd.setVisible(true);
		
		System.out.println(fd.getFile());
		System.out.println(fd.getDirectory());
		
		addWindowListener(w);
	}
	
	public static void main(String[] args) {
		
		new FileDialogEx();

	}

}
