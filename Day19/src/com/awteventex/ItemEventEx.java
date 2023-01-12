package com.awteventex;

import java.awt.*;
import java.awt.event.*;

/*혈액형 : A, B, AB, O
년 1980~2022 
월 1~12
일 1~31

지역 
서울, 대구, 부산, 대전, 광주, 울산, 인천, 강원도, 
*/
public class ItemEventEx extends Frame implements ItemListener, ActionListener {

	
	private Label lb = new Label("blood : ", Label.RIGHT);//blood
	private Label lb1 = new Label("birth : ", Label.RIGHT);//birth
	private Label lb2 = new Label("area : ", Label.RIGHT);//area

	private TextField bType = new TextField();
	private Choice blood = new Choice();
	private TextField birth = new TextField();
	private Choice year = new Choice();
	private Choice month = new Choice();
	private Choice day = new Choice();
	private TextField area = new TextField();
	private List li = new List(3, false);
	private Button end = new Button("Exit");

	public ItemEventEx() {

		super("ItemEvent Test");

		setForm();

		// 편집 불가
		bType.setEditable(false);
		birth.setEditable(false);
		area.setEditable(false);
		
		// 리스너 등록
		blood.addItemListener(this);
		day.addItemListener(this);
		li.addItemListener(this);
		
		li.addActionListener(this);
		end.addActionListener(this);
		
		
		blood.requestFocus();

		WinEvent w = new WinEvent();// 종료창
		setSize(300, 200);// 화면크기
		setVisible(true); // true = 보임 // false = 안보임 //화면 출력여부
		addWindowListener(w);// 종료 실행
		
	}

	private void setForm() {

		setLayout(new GridLayout(2, 1));

		Panel p = new Panel(new BorderLayout());
		Panel p1 = new Panel(new GridLayout(3,1));

		p1.add(lb);
		p1.add(lb1);
		p1.add(lb2);
		p.add("West", p1);// 라벨

		Panel p2 = new Panel(new GridLayout(3, 1));
		p2.add(bType);
		p2.add(birth);
		p2.add(area);
		p.add("Center",p2);//중앙

	

		Panel p3 = new Panel(new GridLayout(4, 1));
		p3.add(blood);
		p3.add(year);
		p3.add(month);
		p3.add(day);

		blood.add("A형");
		blood.add("B형");
		blood.add("AB형");
		blood.add("0형");

		// 년
		for (int i = 1980; i <= 2022; i++)
			year.add(i + "년");

		// 월
		for (int i = 1; i <= 12; i++)
			month.add(i + "월");
		// 일
		for (int i = 1; i <= 31; i++)
			day.add(i + "일");

		p.add("East", p3);

		add("Center", p);// 중앙

		Panel p4 = new Panel(new BorderLayout());
		p4.add("Center", li);
		li.add("서울");//SEOUL
		li.add("대구");//BUSAN
		li.add("대전");//DAEJON
		li.add("부산");//KIMPO
		li.add("대전");//JEONJU
		li.add("광주");//INCEON
		li.add("울산");//JAPAN
		li.add("인천");
		li.add("강원");
		li.add("seoul");
		p4.add("East", end);
		add(p4);
	}

	public static void main(String[] args) {
		new ItemEventEx();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==end) {
			System.exit(0);
	}else if(e.getSource()==li) {
		int i = li.getSelectedIndex();
		li.remove(i);
	}
	
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		
		if(e.getSource()==blood) {
			String imsi = blood.getSelectedItem();
			bType.setText(imsi);
			
		}else if(e.getSource()==day) {
			String imsi = year.getSelectedItem();
			String imsi1 = month.getSelectedItem();
			String imsi2= day.getSelectedItem();
			birth.setText(imsi+imsi1+imsi2);
			
		}else if(e.getSource()==li) {
			String imsi = li.getSelectedItem();
			area.setText(imsi+"지역");
		}
		
	}

}
