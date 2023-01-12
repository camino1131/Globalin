package objectprogramming;

import java.util.*;

public class CarEx {

	public static void main(String[] args) {
		Add Mul = new Add();

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 :");
		int a = sc.nextInt();
		System.out.print("두번째 수 : ");
		int b = sc.nextInt();
		System.out.print(Mul.result);
		System.out.print(Mul.add(a, b));
	}

}
