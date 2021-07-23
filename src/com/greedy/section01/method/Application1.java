package com.greedy.section01.method;

public class Application1 {
	
		// static -> 메모리공간 사용
	public static void main(String[] args) {		//1
		/* 메소드 
		 * 어떤 특정 작업을 수행하기 윈한 명령문의 집합
		 */
		System.out.println("main() 시작됨.."); 		//2
		// 작성한 메소드를 호출하는 부분
		// 클래스명 사용할 이름 = new 클래스명();	-> 객체 생성
		Application1 app1 = new Application1();		//3
		
		// 사용할이름.메소드명()	('.'->참조연산자)
		app1.methodA();								//4
		
		System.out.println("main() 종료됨..");		//11
	}												//12(끝)
	// 호출 확인을 위한 메소드
	public void methodA() {					
		System.out.println("methodA() 호출함..");		//5
		
		methodB();									//6
		System.out.println("methodA() 종료됨..");		//9
	}												//10
	public void methodB() {					
		System.out.println("methodB() 호출함.."); 	//7
	}												//8
	
	
	
}
