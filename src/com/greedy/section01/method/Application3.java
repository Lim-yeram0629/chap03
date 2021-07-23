package com.greedy.section01.method;

public class Application3 {

	public static void main(String[] args) {
		/* 전달인자(argument)의 매개변수(parameter)를 이용한 메소드 호출
		 * 
		 * 변수의 종류(지역, 전역, 클래스)
		 * 1. 지역 변수 : 선언한 메소드 블럭 내부에서만 사용 -> 지역변수의 스코프 
		 * 				stack에서 사용된 후 사용이 끝나면 삭제
		 * 2. 매개 변수
		 * 3. 전역 변수(필드)
		 * 4. 클래스(static) 변수 
		 * 
		 * 다른 메소드간 서로 공유해야하는 값이 존재하는 경우
		 * 메소드 호출 시 사용하는 괄호를 이용해서 값을 전달할 수 있다.
		 * 이 때, 전달하는 값을 전달인자(argument)라고 부르고
		 * 메소드 선언부 괄호 앞에 전달인자를 받기 위해 선언하는 변수를 매개변수(prarmeter)라고 한다.
		 */
		
		Application3 app3 = new Application3();
		// 1. 전달인자로 값 전달
		// 호출하려는 메소드의 매개변수 선언부에 미리 자료형, 개수, 순서가 일치하게 값을 넣어 호출
		app3.testMethod(20);
		// app3.testMethod("20"); -> 자료형 불일치	(매개변수 int - 인자도 int 여야 가능)
		// app3.testMethod(20, 30, 40); -> 개수 불일치 (매개변수 1개 - 인자 1개만 가능)
		// app3.testMethod(); -> 인자가 없어도 오류
		
		// 2. 변수에 저장한 값을 전달
		int age = 20;
		app3.testMethod(age);

		// 2-1. 자동 형변환을 이용하여 저장한 값을 전달
		byte byteAge = 10;
		app3.testMethod(byteAge);

		// 2-2. 강제 형변환을 이용하여 저장한 값을 전달
		long longAge = 80;
		app3.testMethod((int)longAge);
		
		// 2-3. 연산결과를 이용하여 저장한 값을 전달
		app3.testMethod(age*3);

	}
	
	public void testMethod(int age) {
		System.out.println("당신의 나이는 " + age + "세 입니다.");
	}

}
