package com.exam;

/* 문]
 *      무한대로 두 정수를 입력받아 합계를 구하는 프로그램을 작성하시오.
 *      종료 조건 :  첫번째 정수가 0보다 작을 경우
 * 
 */

import java.util.*;

public class ForEx03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		for(;;) {
			System.out.print("첫번째 정수 입력 : ");
			int a = sc.nextInt();
			if(a<0) break;
			System.out.print("두번째 정수 입력 : ");
			int b = sc.nextInt();
			System.out.println("두 정수의 합계 : " + (a + b));
		}

	}

}
