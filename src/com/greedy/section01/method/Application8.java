package com.greedy.section01.method;

public class Application8 {

	public static void main(String[] args) {
		/* static 메소드 호출
		 * static 메소드(static이 붙어있는 메소드)
		 * non-static 메소드(static이 붙어있지 않은 메소드) 
		 */
		
		// static 메소드 호출 방법 (클래스명.메소드명();)
		// static이 붙어 있으면 기울어져 있음
		System.out.println("10과 20의 합: " + Application8.sumTwoNumbers(10, 20));

	}
	
	/**
	 * <pre>
	 *  두 수를 더한 결과를 반환하는 기능을 제공
	 *  static 메소드 호출을 위한 메소드
	 * </pre>
	 * @param first	더하기를 할 첫번째 정수
	 * @param second 더하기를 할 첫번째 정수
	 * @return 		더한 결과 리턴
	 */
	public static int sumTwoNumbers(int first, int second) {
		return first + second;
	}
	
	
}
