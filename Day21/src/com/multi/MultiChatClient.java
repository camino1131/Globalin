package com.multi;

import java.io.*;
import java.net.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MultiChatClient implements ActionListener, Runnable {

	private String ip; // 로그인/ 로그아웃
	private String id; // 서버 ip
	private Socket socket;
	// 입출력 스트림 선언
	private BufferedReader inMsg = null;
	private PrintWriter outMsg = null;

	// 로그인 패널
	private JPanel loginPanel;
	private JButton loginButton;
	private JLabel label1;
	private JTextField idInput;

	// 로그아웃 패널
	private JPanel logoutPanel;
	private JLabel label2;
	private JButton logoutButton;

	// 메시지 입력 패널
	private JPanel msgPanel;
	private JTextField msgInput;

	// 종료버튼
	private JButton exitButton;
	private JFrame jframe;

	// 채팅 내용출력창
	private JTextArea msgOut;

	// 카드 레이아웃
	private Container tab;
	private CardLayout clayout;
	private Thread thread;

	boolean status;

	public MultiChatClient(String ip) {
		this.ip = ip;

		loginPanel = new JPanel();

		loginPanel.setLayout(new BorderLayout());
		idInput = new JTextField(15);
		loginButton = new JButton("로그인");
		label1 = new JLabel("대화명");

		loginPanel.add(label1, BorderLayout.WEST);
		loginPanel.add(idInput, BorderLayout.CENTER);
		loginPanel.add(loginButton, BorderLayout.EAST);

		logoutPanel = new JPanel();
		logoutPanel.setLayout(new BorderLayout());
		label2 = new JLabel();
		logoutButton = new JButton("로그아웃");
		logoutButton.addActionListener(this);

		
		logoutPanel.add(label2, BorderLayout.CENTER);
		logoutPanel.add(logoutButton, BorderLayout.EAST);

		msgPanel = new JPanel();
		msgPanel.setLayout(new BorderLayout());
		msgInput = new JTextField(30);
		msgInput.addActionListener(this);
		
		
		exitButton = new JButton("종료");
		exitButton.addActionListener(this);
		msgPanel.add(msgInput, BorderLayout.CENTER);
		msgPanel.add(exitButton, BorderLayout.EAST);

		// 로그인/로그아웃 패널을 선택하기 위한 카드레이아웃 패널 구성
		tab = new JPanel();
		clayout = new CardLayout();
		tab.setLayout(clayout);
		tab.add(loginPanel, "logout");
		tab.add(logoutPanel, "logout");

		// 메인 프레임 구성
		jframe = new JFrame(" ::멀티챗::");
		msgOut = new JTextArea("", 10, 30);
		msgOut.setEditable(false);

		JScrollPane jsp = new JScrollPane(msgOut, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

		jframe.add(tab, BorderLayout.NORTH);
		jframe.add(jsp, BorderLayout.CENTER);
		jframe.add(msgPanel, BorderLayout.SOUTH);

		// 로그인 패널을 먼저 표시
		clayout.show(tab, "login");
		jframe.pack();
		// 프레임 크기 조정 불가
		jframe.setResizable(false);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		exitButton.addActionListener(this);
		loginButton.addActionListener(this);
		logoutButton.addActionListener(this);
		msgInput.addActionListener(this);
	}

	public void connectServer() {
		try {
			// 소켓 생성
			socket = new Socket(ip, 6000);
			System.out.println("[Client]Sever 연결 성공이닷!!!!!!!");

			inMsg = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			outMsg = new PrintWriter(socket.getOutputStream(), true);

			// 서버에 메시지 전달
			outMsg.println(id + "/" + "login");

			thread = new Thread(this);
			thread.start();

		} catch (Exception e) {
			System.out.println(" [MultiChatClient]ConnectServer()Exception 발생 했당.....");
		}

	}

	@Override
	public void run() {
		// 수신 메시지를 처리하는 변수
		String msg;
		String[] rmsg;

		status = true;

		while (status) {

			try {

				// 메시지 수신과 파싱
				msg = inMsg.readLine();
				rmsg = msg.split("/");

				// JTextArea에 수신된 메시지를 추가함
				msgOut.append(rmsg[0] + ">" + rmsg[1] + "\n");

				// 커서를 현재 대화 메시지를 표시함
				msgOut.setCaretPosition(msgOut.getDocument().getLength());

			} catch (IOException ii) {
				status = false;
			}
		} // end while

		System.out.println("[MultiChatClient]" + thread.getName() + "종료되었습니다.");

	}// end run

	// 이벤트 처리
	@Override
	public void actionPerformed(ActionEvent e) {

		Object obj = e.getSource();

		if (obj == exitButton) {
			System.exit(0);

		} else if (obj == loginButton) {
			id = idInput.getText();
			label2.setText("대화명:" + id);
			clayout.show(tab, "logout");
			connectServer();
		} else if (obj == logoutButton) {
			outMsg.println(id + "/" + "logout");
			msgOut.setText("");
			clayout.show(tab, "login");
			outMsg.close();
			try {
				inMsg.close();
				socket.close();
			} catch (IOException ee) {
				ee.printStackTrace();
			}

			status = false;

		} else if (obj == msgInput) {
			// 메시지를 전송하고
			outMsg.println(id + "/" + msgInput.getText());
			// 메시지 입력창을 초기화(클리어시킴)
			msgInput.setText(" ");
			
		}
	}

	public static void main(String[] args) {
		new MultiChatClient("192.168.0.113");
	}

}
