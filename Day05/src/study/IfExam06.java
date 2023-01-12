package study;
import java.util.*;
public class IfExam06 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a;
		
		System.out.printf("점수를 입력하세요 : ");
		a = sc.nextInt();
		
		if(a>=90)
			System.out.printf("A");
		else
		if(a>=80)
			System.out.printf("B");
		else
		if(a>=70)	
			System.out.printf("C");
		else
		if(a>=60)
			System.out.printf("D");
		else
			System.out.printf("E");
		System.out.printf(" 학점 입니다. \n");
	}

}
