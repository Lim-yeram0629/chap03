package com.greedy.section03.api.math;

public class Application1 {
	public static void main(String[] args) {
		
		/* API 
		 * Application Programming Interface는 응용프로그램에서 사용할 수 있도록,
		 * 운영체제나 프로그래밍 언어가 제공라는 기능을 제어할 수 있도록 만든 인터페이스
		 * 인터페이스란 프로그램의 뼈대 같은 것
		 */

		/* java.lang.Math
		 * Math클래스는 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해놓은 클래스
		 */
		
		/* 절대값 출력 */
		System.out.println("절대값 출력 (-25) : "+ java.lang.Math.abs(-25));
		/* java.lang 패키지
		 * 별도로 import 하지 않아도 사용할 수 있게 만든 패키지
		 * 매우 자주 사용하는 패키지기 때문에
		 * 컴파일러가 자동으로 import java.lang.*;을 추가해서 컴파일 한다.
		 */
		System.out.println("절대값 출력 (-25) : "+ Math.abs(-25));
		
		// min & max
		System.out.println("최대값 출력 (10, 20) : "+ Math.min(10, 20));
		System.out.println("최소값 출력 (20, 30) : "+ Math.max(20, 30));
		
		// 수학적으로 많이 사용하는 고정된 값들도 Math에 정의 되어 있다.
		System.out.println("원주율 : "+ Math.PI);
		
		// random()
		System.out.println("난수 발생 : "+ Math.random());
		
		
	}

}
