package com.exam.inher;

import java.util.*;



public class CalcMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 정수와 연산자 입력 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		char operator = sc.next().charAt(0);
		Calc exp=null;
		
		switch(operator) {
		case '+':
			exp = new Add();
			break;
		case '-':
			exp = new Sub();
			break;
		case '*':
			exp = new Mul();
			break;
		case '/':
			exp = new Div();
			break;
		default:
			System.out.println("잘못된 연산자 입니다.");
		}

		exp.setValue(a, b);
		if(exp instanceof Div || b == 0)
			System.out.println("계산할 수 없습니다.");
		else
			System.out.println(exp.calculate());
		
		sc.close();
	}

}
