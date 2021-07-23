package com.greedy.section01.method;

public class Application9 {

	public static void main(String[] args) {
		
		/* 다른 클래스에 작성한 메소드 호출 */
		
		// 최대값, 최소값 비교 두 정수 선언
		
		int first = 100;
		int second = 50;
		
		// 1. non-static 메소드의 경우
		//	클래스가 다르더라도 사용하는 방법은 동일하다. 
		Calculator calc = new Calculator();	// 클래스명 사용할이름 = new 클래스명();
		int min = calc.minNumberOf(first, second);
		
		// 2. static 메소드의 경우
		//	다른 클래스인 경우 클래스명 반드시기재, 같은 경우 생략가능
		int max = Calculator.maxNumberOf(first, second); // 클래스명.메소드명();
		
		System.out.println("두 수 의 최소값 비교 : " + min);
		System.out.println("두 수 의 최대값 비교 : " + max);

		/* static 메소드도 non-static 메소드처럼 호출은 가능하다. (권장하지 않는다.)
		*	이미 메모리에 로딩되어 잇는 static메소드는 여러 객체가 공유하게 된다.
		* 	그 때 객체러 접근하게 되면 인스턴스(new Calculator())가 가진 값으로 공유된 값에 예상치 못하는 동작을 
		* 	유발 할 수 있기 때문에 사용을 제한해 달라는 경고가 뜬다.
		*/
		// max = calc.maxNumberOf(first, second); // 클래스명.메소드명();
		// System.out.println("두 수 의 최대값 비교 : " + max);
	}

}
