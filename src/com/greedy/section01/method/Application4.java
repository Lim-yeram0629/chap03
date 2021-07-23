package com.greedy.section01.method;

public class Application4 {

	public static void main(String[] args) {
		Application4 app4 = new Application4();
		app4.testMethod("홍길동", 20, '남');
		// app4.testMethod(20, "홍길동", '남'); -> 값의 순서가 다르게 전달되면 오류
		
		String name = "유관순";
		int age = 20;
		char gender = '여';
		app4.testMethod(name, age, gender);
	}
	
	/**
	 * <pre>
	 * 이름과 나이와 성별을 전달받아 한 번에 출력해주는 기능을 제공한다.
	 * </pre>
	 * @param name	출력할 이름을 전달해주세요.
	 * @param age	출력할 나이를 전달해주세요.
	 * @param gender	출력할 성별을 전달해주세요. (남/여) 성별은 변경되지 않을 것을 보장합니다.
	 */
	public void testMethod(String name, int age, final char gender) {
		
		/* 매개변수도 일종의 지역변수로 분류된다.
		 * 매개변수 역시 final 키워드를 사용할 수 있다.
		 * 지역변수에 final 키워드를 붙여 상수를 만드는 것은 동일하다.
		 * final 매개변수는 상수 네이밍 규칙을 선택적으로 따르는 경향이 있다. */
		
		System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "세이며 성별은, " + gender + "입니다.");
		
		
		
	}

}
