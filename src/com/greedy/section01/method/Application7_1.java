package com.greedy.section01.method;

public class Application7_1 {

	public static void main(String[] args) {
		/* 숫자 두개를 매개변수로 입력받아 연산하는 메소드를
		 * 사칙연산별로 추가해서 호출
		 */
		
		int first = 20;
		int second = 10;
		
		Application7_1 app7 = new Application7_1();
		
		System.out.println(app7.plusTwoNumbers(first, second));
		System.out.println(app7.minusTwoNumbers(first, second));
		System.out.println(app7.multipleTwoNumbers(first, second));
		System.out.println(app7.devideTwoNumbers(first, second));
	}
	/**
	 * <pre>
	 * 	매개변수로 전달받은 두 수를 더하여 결과값 반환하는 기능
	 * </pre>
	 * @param first		더하기를 할 첫번째 정수
	 * @param second	더하기를 할 두번째 정수
	 * @return			매개변수로 전달 받은 두 수를 더한 결과
	 */
	public String plusTwoNumbers(int first, int second) {
		return first + " + " + second + " = " + (first + second);
	}
	
	/**
	 * <pre>
	 * 	매개변수로 전달받은 두 수를 빼서 결과값 반환하는 기능
	 * </pre>
	 * @param first		뺄 첫번째 정수
	 * @param second	뺄 두번째 정수
	 * @return			매개변수로 전달 받은 두 수를 뺀 결과
	 */
	public String minusTwoNumbers(int first, int second) {
		return first + " - " + second + " = " + (first - second);
	}
	
	/**
	 * <pre>
	 * 	매개변수로 전달받은 두 수를 곱해서 결과값 반환하는 기능
	 * </pre>
	 * @param first		곱할 첫번째 정수
	 * @param second	곱할 두번째 정수
	 * @return			매개변수로 전달 받은 두 수를 곱한 결과
	 */
	public String multipleTwoNumbers(int first, int second) {
		return first + " * " + second + " = " + (first * second);
	}
	
	/**
	 * <pre>
	 * 	매개변수로 전달받은 두 수를 나눈 결과값 반환하는 기능
	 * </pre>
	 * @param first		나눌 첫번째 정수
	 * @param second	나눌 두번째 정수
	 * @return			매개변수로 전달 받은 두 수를 나눈 결과
	 */
	public String devideTwoNumbers(int first, int second) {
		return first + " / " + second + " = " + (first / second);
	}

}
