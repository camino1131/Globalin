package homework;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JOptionPaneEx extends JFrame implements ActionListener {

	JButton b1, b2, b3, b4 , b5, b6, b7, b8, b9;
	String[] str = {"로그인", "회원가입"};
	
	public JOptionPaneEx() {
		super("JOptionPane Test");
		
		setLayout(new FlowLayout());
		b1 = new JButton("MessageDialog");
		b2 = new JButton("ConfirmDialog");
		b3 = new JButton("InputDialog");
		b4 = new JButton("OptionDialog");
		b5 = new JButton("OptionDialog");
		b6 = new JButton("OptionDialog");
		b7 = new JButton("OptionDialog");
		b8 = new JButton("OptionDialog");
		b9 = new JButton("OptionDialog");
		
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		
		
		pack();
		setLocation(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		
	
	
	}
	
	public static void main(String[] args) {
		
		new JOptionPaneEx();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1) {
			JOptionPane.showMessageDialog(this, "메시지 다이얼로그 박스", "메시지", JOptionPane.INFORMATION_MESSAGE);
		}else if(e.getSource()==b2) {
			JOptionPane.showConfirmDialog(this, "확인 다이얼로그 박스", "확인", JOptionPane.YES_NO_CANCEL_OPTION);
		}else if(e.getSource()==b3) {
			JOptionPane.showInputDialog(this, "입력 다이얼로그 박스", "입력", JOptionPane.YES_NO_OPTION);
		}else if(e.getSource()==b4) {
			JOptionPane.showOptionDialog(this, "옵션 다이얼로그 박스", "옵션", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, str, str[0]);
		}
	}
}