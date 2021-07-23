package com.greedy.section01.method;

public class Application6 {

	public static void main(String[] args) {
		
		/* 메소드 리턴값 테스트 
		 * 메소드는 항상 마지막에 return 명령어가 존재한다.
		 * return은 자신을 호출한 구문으로 복귀하는 것을 의미한다.
		 * 복귀 할 때, 그냥 복귀를 할 수도 있고 값을 가지고 복귀할 수 도 있다. 
		 * 이 때 가지고 가는 값을 리턴값이라고 한다.
		 */
		
		Application6 app6 = new Application6();
		String returnText = app6.testMethod();
		System.out.println(returnText);
		System.out.println(app6.testMethod());
	
	}
	/**
	 * <pre>
	 * 	문자열 형태의 반환값을 확인해보기 위한 메소드
	 * </pre>
	 * @return	안녕하세요 라는 문자열값을 반환
	 */
	public String testMethod() {	
		return "안녕하세요";
	}
	
	
	
	
	
	

}
