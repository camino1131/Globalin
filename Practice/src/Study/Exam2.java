package Study;

//문2] 2차원 배열을 이용하여 다음과 같이 결과를 출력하시오.

public class Exam2 {

	public static void main(String[] args) {
	
		int art = 4;
		int arr[][] = new int [4][5];
		int n = 1;
	
		
		//베열의 값을 저장 
		
		for(int i = 0; i<arr.length;i++) {
		for(int j=0; j<arr[i].length;j++) {
		}		
			    art=n++;
				
		
		//베열에 저장된 값을 출력 
		for(int a=0; a<arr.length;a++) {
			for(int b=0; b<arr[a].length;b++) {
				System.out.printf("%2d\t",arr[a][b]);
		   }
			System.out.println();
		}
	  } 
	}
}
		
		
		
		
		
		
		
	