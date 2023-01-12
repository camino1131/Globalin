package homework;

import java.awt.*;


public class Calculator2 extends Frame{ //Calculator2 클래스, Frame을 상속받았음
	
	//생성자의 호출 시점 : 객체를 생성할 때 호출됨
	//생성자의 조건(특징) : 클래스 명과 같아야 한다. 반환형이 없다.
	//생성자 : Constructor
	public Calculator2() { //Calculator2 생성자, 반환형이 없음
		System.out.println("2"); //2을 출력하라는 함수
		
	}
	

	//1)
	public static void main(String[] args) {//메인 메서드
	
		//2)Calculator2 객체를 생성한다.(new 키워드
		Calculator2 cc = new Calculator2(); //그릇 = new 본체() Calculator2 객체를 생성하는 부분
	
	}

}
