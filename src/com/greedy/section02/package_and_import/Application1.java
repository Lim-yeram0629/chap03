package com.greedy.section02.package_and_import;

public class Application1 {

	public static void main(String[] args) {
		/* 패키지 
		 * 같은 패키지 내에서는 동일한 이름의 클래스를 만들 수 없지만,
		 * 패키지가 다르면 동일한 이름의 클래스를 만들 수도 있다.
		 */
		
		// Non-static 메소드의 경우
		com.greedy.section01.method.Calculator calc
								= new com.greedy.section01.method.Calculator();
		int min = calc.minNumberOf(20,30);
		System.out.println("30과 20의 최소값 비교 : " + min);
		
		// static 메소드의 경우
		int max = com.greedy.section01.method.Calculator.maxNumberOf(30, 20);
		System.out.println("30과 20의 최대값 비교 : " + max);
		

	}

}
