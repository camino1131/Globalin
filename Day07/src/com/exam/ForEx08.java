package com.exam;

/* 문]
 *     1부터 100까지의 수중 3의 배수의 합계를 구하는 프로그램을 작성하시오.
 */


public class ForEx08 {

	public static void main(String[] args) {


		int sum = 0;
		
		for(int i = 0; i<=100;i+=3) {
			sum+=i;
		}
		System.out.println("1부터 100까지의 수 중 3의 배수의 합 : " + sum);
	}

}
