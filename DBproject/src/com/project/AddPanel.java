package com.project;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


//스윙 
import javax.swing.*;
//경계선 
import javax.swing.border.*;

//사원정보 입력화면 (라벨?)이름, 직급, 메일, 부서(콤보박스/부서번호를 선택하시오.), (버튼) 저장, (버튼) 취소버튼 = 리셋

public class AddPanel extends JPanel implements ActionListener, ItemListener {
	
	
		// swing 멤버 필드 선언 
		private JPanel jp[] = new JPanel[6]; // 제이패널
		private JLabel jl[] = new JLabel[5]; // 제이라벨 
		private JTextField tf[] = new JTextField[5]; //제이텍스트필드
		
		private JButton okb; //  오케이버튼
		private JButton rsb; // 리셋버튼 = 취소버튼
		
		
		//부서번호 10으로 초기화 
		private int department = 10;
		
		String[] caption = {"이름","직책","메일","부서:"};
		
		public AddPanel() {
			
			setLayout(new GridLayout(6,1));
			EtchedBorder eb = new EtchedBorder();
			
			// 경계선 설정하는 메소드
			setBorder(eb);
			
			//이 사이즈만큼 포문 돌릴 것임
			int size = caption.length; 
			
			int i ;
			for(i= 0; i<size-1; i++) {
				//전체 클래스도 JPanel을 상속한 상태에서 포문 안에 JPanel을 또 불러옴
				jp[i] = new JPanel();
				
				//해당 라벨에 아까만든 캡션을 집어넣을 것임 
				jl[i] = new JLabel(caption[i]);
				//15짜리 텍스트필드
				tf[i] = new JTextField(15);
				
				
				jp[i].add(jl[i]);
				jp[i].add(tf[i]);
				
				
				add(jp[i]);
			}
			
			
				jp[i]= new JPanel();
				jl[i]= new JLabel(caption[i]);
				jp[i].add(jl[i]);
				add(jp[i]);
	
				
				// 부서번호 아이템등록하고, 각각부서 번호 부여 10~50까지
				JComboBox combo = new JComboBox();
				combo.addItem("부서번호를 선택하시오.");
				for (int c =1 ; c<=5; c++) {
					combo.addItem(c*10);
				}
				jp[i].add(combo);
				
				
				//패널 생성 
				jp[size] = new JPanel();	
				
				//버튼생성
				okb = new JButton("저정하기");
				rsb = new JButton("다시쓰기");
				
				okb.addActionListener(this);
				combo.addItemListener(this);
				rsb.addActionListener(this);
				
				//jp에 버튼 2개 올림
				jp[size].add(okb);
				jp[size].add(rsb);
				
				//전체 패널에 jp패널을 올림 
				add(jp[size]);
			
		}
		
	// 아이템 선택하게 만들 때 사용 
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		
		//itemevent.selected = 선택한 값
		if(e.getStateChange() == ItemEvent.SELECTED)
			
			//선택한 값을 department에 넣어주기 
			department = Integer.parseInt(e.getItem().toString());

	}


	
	
	@Override // 클릭했을때 db에 데이터 저장
	public void actionPerformed(ActionEvent ae) {
		
		String ae_type = ae.getActionCommand();
		EmployeeVO evo = null; 
		EmployeeDAO edvo = null;
		
		// 저장하기 누르면 db에 저장되어야하기때문에
		if(ae_type.equals(okb.getText())) {
			
			try {
			evo = new EmployeeVO(0, tf[0].getText(), tf[1].getText(),department, tf[2].getText());
			edvo = new EmployeeDAO();
			edvo.getEmployeeregiste(evo);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			if(edvo != null)
				JOptionPane.showMessageDialog(this, tf[0].getText()+"님이 성공적으로 추가 되었습니다.");
			
			
		}else if(ae_type.equals(rsb.getText())){
			
			int size = caption.length;
			for(int i =0; i <size-1; i++) 
				tf[i].setText("");
		
		
	}
}
}
