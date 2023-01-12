package study;
import java.util.*;
public class study02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
				
		int a= 75;
		System.out.print("숫자 입력해주세요 : ");
		a=sc.nextInt();
		if(a>50) {
			if(a<100) {
				System.out.println("50보다 크고 100보다 작군요...\n");
			}else {
				System.out.println("와 ~~ 100보다 크군요..\n");
			}
				
			}else {
				System.out.println("애걔~50보다 작군요..\n");
		}

	}

}
