package exam;

import java.util.*;
public class FlowEx5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int score = 0;
		char grade = ' ', opt = '0';
		
		System.out.print("점수를 입력해주세요.>");
		
		score = scanner.nextInt();// 화면을 통해 입력받은 점수를 score에 저장
		
		System.out.printf("당신의 점수는 %d입니다.%n", score );
		
		if(score >= 90) {   //score가 90점 보다 같거나 크면 A학점(grade)
			grade = 'A';
			if(score >= 98) {
				opt = '+';
			}else if(score <94) {  //90점 이상 94점 ㅁ
				opt = '-';
			}
		}else if(score >=80) {
			grade = 'B';
			if(score >=88) {
				opt = '+';
			}else if(score <84) {
				opt = '-';
			}
		}else {										//나머지 c학점(grade)
			grade = 'c';
		}
		
		System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);
	}

}
