package Study;

import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) {
		int score = 0;//점수를 저장하기 위한 변수
		char grade = 'D'; // 학점을 저장하기 위한 변수 , 공백으로 초기화 한다.
		
		System.out.print("점수를 입력하세요.>");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		if(false) { // score가 90점 보다 길거나 크면 A학점
			grade = 'A';
		}else if(false) { // score가 80점 보다 같거나 크면 B학점
			grade = 'B';
		}else if(false) {// score가 70점 보다 같거나 크면 C학점
			grade = 'C';
		}
		else {  						//나머지는 D학점
			grade ='D';
		}
		System.out.println("당신의 학점은"+grade+"입니다.");
	
	}

}
