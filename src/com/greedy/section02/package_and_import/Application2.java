package com.greedy.section02.package_and_import;

//import com.greedy.section01.method.Calculator;
/* 한 패키지 내의 여러개의 클래스를 사용하고 싶을 때는 '*'사용 */
import com.greedy.section01.method.*;
/* static import의 경우 사용하려는 static method를 전부 써줘야한다.*/
import static com.greedy.section01.method.Calculator.maxNumberOf;

public class Application2 {

	public static void main(String[] args) {
		/* 임포트 (import)
		 * 		서로 다른 패키지에 존재하는 클래스를 사용하는 경우,
		 * 		패키지명을 포함한 풀 클래스 이름을 사용해야한다.
		 * 		하지만 매번 다른 클래스의 패키지명까지 기술하기에는 번거롭기 때문에
		 * 		패키지명을 생략하고 사용할 수 있도록 한 구문이 import 구문이다.
		 * 
		 * [선언위치]
		 * import는 package 선언문과 class 선언문 사이에 작성하며
		 * 어떠한 패키지 내에 있는 클래스를 사용할 것인지 미리 선언한다.
		 */
		
		// Non-static 메소드의 경우
		Calculator calc = new Calculator();
		int min = calc.minNumberOf(50,60);
		System.out.println("50과 60의 최소값 비교 : " + min);
		
		// static 메소드의 경우
		int max = Calculator.maxNumberOf(80, 20);
		System.out.println("80과 20의 최대값 비교 : " + max);
		
		// static import를 사용하면 클래스명 생략이 가능하다.
		int max2 = maxNumberOf(80, 20);
		System.out.println("80과 20의 최대값 비교 : " + max2);
		
		System.out.println("80과 20의 최대값 비교 : " + Math.max(80, 20));
		

	}


}
