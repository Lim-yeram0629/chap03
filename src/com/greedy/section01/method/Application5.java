package com.greedy.section01.method;

public class Application5 {
	public static void main(String[] args) {
		/* 메소드 리턴 테스트 
		 * return -> 요청된 곳으로 돌려주는 것
		 * 			 문장 가장 마지막에 작성(마지막에 작성하지 않을 시 컴파일 에러 발생)
		 * */
		
		System.out.println("main() 메소드 시작...");
		
		Application5 app5 = new Application5();
		app5.testMethod();
	}
	
	public void testMethod() {
		System.out.println("testMehod() 동작확인");
//		return; -> void는 return 자동 생략
	}

}
