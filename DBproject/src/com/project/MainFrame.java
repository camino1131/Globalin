package com.project;


import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class MainFrame extends JFrame {
	
	//탭패널 지정 
	private JTabbedPane tp;
	private AddPanel ap;
	private FindPane fp;
	private TotalPane tpp;
	
	
	public MainFrame() {
		tp = new JTabbedPane();
		ap = new AddPanel();
		fp = new FindPane();
		tpp=new TotalPane();
		
		tp.addTab("사원정보 입력", ap);
		tp.addTab("사원정보조회",fp);
		tp.addTab("사원전체 보기", tpp);
		
		getContentPane().add(tp);
		setTitle("사원 관리 프로그램");
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new MainFrame().setSize(600,600);

	}

}
