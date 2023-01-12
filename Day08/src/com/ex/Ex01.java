package com.ex;

/* 문]
 *     Scanner를 이용하여 알파벳 소문자 하나를 입력받고 다음과 같이 출력하는 프로그램을 작성하시오.
 *     
 *     소문자 알파벳 하나를 입력하시오. >> e
 *     
 *     abcde
 *     abcd
 *     abc
 *     ab
 *     a
 */	
	
import java.util.*;
	
public class Ex01 {
	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
			
		System.out.print("소문자 알파벳 하나를 입력하시오. >> ");
		char alpha = sc.next().charAt(0);
		
		for(char i = alpha; i >= 'a'; i--) {
		for(char j = 'a'; j <= i; j++) {
			System.out.print(j);
		}
		System.out.println();
		}
					
	}
			
}
