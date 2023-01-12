package chet;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ChEx implements ActionListener, Runnable{
	
	//입  출력 스트림 생성
	inMsg = new BufferedReader(new InputStreamReader(s.getInputStream()));
	outMsg = new PrintWriter(s.getOut); 
	

	private JFrame jframe;
	//로그인 패널
	private JPanel loginPanel;
	//로그인 버튼
	private JButton loginButton;
	//대화명 라벨
	private JLabel label1;     
	//대화명 입력 텍스트 필드
	private JTextField idInput;
	//로그아웃 패널 구성
	private JPanel logoutPanel;
	// 대화명 출력 라벨
	private JLabel label2;
	//로그아웃 버튼
	private JButton logoutButton;
	//입력 패널 구성
	private JPanel msgPanel;
	//메시지 입력 텍스트 필드
	private JTextField msglnput;
	//종료 버튼
	private JButton exitButton;
	//메시지 입력 텍스트 필드 
	private JTextField msgInput;
	//카드 레이아웃 관련
	private Container tab;
	private CardLayout clayout;
	private JTextArea msgOut;
	
	//수신 메시지와 피싱메시지를 처리하는 변수 선언
	String msg;
	String [ ] rmsg;
	
	//입 출력 스트림 생성
	private BufferedReader inMsg = null;
	private PrintWriter outMsg = null;
	
	public ChEx(String ip) {
		
		// 로그인 패널 구성
		loginPanel = new JPanel( );
		// 레이아웃 설정
		loginPanel.setLayout(new BorderLayout( ));
		idInput = new JTextField(15);
		loginButton = new JButton("로그인");
		// 이벤트 리스너 등록
		loginButton.addActionListener(this);
		label1 = new JLabel("대화명");
		// 패널에 위젯 구성
		loginPanel.add(label1, BorderLayout.WEST);
		loginPanel.add(idInput, BorderLayout.CENTER);
		loginPanel.add(loginButton, BorderLayout.EAST);
				
				exitButton = new JButton("종료");
				exitButton.addActionListener(this);
				// 로그아웃 패널 구성
				logoutPanel = new JPanel( );
				// 레이아웃 설정
				logoutPanel.setLayout(new BorderLayout( ));
				label2 = new JLabel( );
				logoutButton = new JButton("로그아웃");
				// 이벤트 리스너 등록
				logoutButton.addActionListener(this);
				// 패널에 위젯 구성
				logoutPanel.add(label2, BorderLayout.CENTER);
				logoutPanel.add(logoutButton, BorderLayout.EAST);
				//로그인/ 로그아웃 패널 선택을 위한 카드 레이아웃 패널
				tab = new JPanel();
				clayout = new CardLayout();
				tab.setLayout(clayout);
				tab.add(loginPanel,"login");
				tab.add(logoutPanel,"logout");
				
				// 메인 프레임 구성
				jframe = new JFrame("::멀티챗::");
				msgOut = new JTextArea(" ", 10, 30);
				// JTextArea의 내용을 수정하지 못하게 함. 즉, 출력 전용으로 사용
				msgOut.setEditable(false);
				// 수직 스크롤바는 항상 나타내고, 수평 스크롤바는 필요할 때만 나타나게 함
				JScrollPane jsp = new JScrollPane(msgOut, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
				jframe.add(tab, BorderLayout.NORTH);
				jframe.add(jsp, BorderLayout.CENTER);
				jframe.add(msgPanel, BorderLayout.SOUTH);
	}
	public void run() {
		
			
		
		
	}
		
	
	public static void main(String[] args) {
	ChEx mcc = new ChEx("127.0.0.1");

	}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}	
	
}