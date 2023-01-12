package Study;




import java.util.*;

public class study {

	public static void main(String[] args)  {
		Scanner sc =new Scanner(System.in);
		
		int num;
		String result;
		
		System.out.println("임의의 정수를 입력하시오.");
		num = sc.nextInt();
		
		result = num%2==0? "짝수":"홀수";

		System.out.println(num+" 은"+result+"입니다.");
	}
}