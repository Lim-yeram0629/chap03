package com.greedy.section03.api.scanner;

import java.util.Scanner;

public class Application1 {
	
	public static void main(String[] args) {
		/* java.utill.Scanner를 이용한 다양한 자료형 값 입력 받기
		 * 콘솔화면에 값을 입력 받아 출력해보기
		 */
		
		//1. Scanner 객체 생성
		//java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);
		
		//java.util.Scanner sc1 = new java.util.Scanner(System.in);
		
		Scanner sc = new Scanner(System.in);
		
//		//2. 자료형별 입력 값 받기
//		// 2-1. 문자열 입력 받기
//		System.out.print("이름을 입력하세요: ");
//		String name = sc.nextLine(); // nextLine() -> 입력 받은 값을 문자열로 반환
//		System.out.println("입력하신 이름은 " + name + "입니다.");
//		
//		// 2-2. 정수 입력 받기
//		/* 오류 발생 경우
//		 * 다른 자료형을 입력 받거나 자료형 범위를 초과한 값을 입력받으면
//		 * java.util.InputMismatchException 발생 
//		 */
//		System.out.print("나이를 입력하세요: ");
//		int age = sc.nextInt(); // nextInt() -> 입력 받은 값을 int형으로 반환
//		System.out.println("입력하신 나이는 " + age + "입니다.");
//
//		//nextLong()
//		System.out.print("금엑을 입력하세요: ");
//		long money = sc.nextLong(); // nextLong() -> 입력 받은 값을 long형으로 반환
//		System.out.println("입력하신 금액은 " + money + "입니다.");
//		
//		// 2-3. 실수 입력 받기
//		System.out.print("키를 입력하세요: ");
//		float height = sc.nextFloat(); // nextFloat() -> 입력 받은 값을 Float형으로 반환
//		System.out.println("입력하신 키는 " + height + "cm 입니다.");
//		
//		System.out.print("아무 실수를 입력하세요: ");
//		double dNumber = sc.nextDouble(); // nextDouble() -> 입력 받은 값을 Double형으로 반환
//		System.out.println("입력하신 실수는 " + dNumber + " 입니다.");
//		
		// 2-4. 논리 입력 받기
		System.out.print("true 또는 false를 입력하세요: ");
		boolean isTrue = sc.nextBoolean(); // nextBoolean() -> 입력 받은 값을 Boolean형으로 반환
		System.out.println("입력하신 논리는 " + isTrue + " 입니다.");
		
		// 2-5. 문자 입력 받기
		/* 문자를 직접 입력 받는 기능을 제공하지는 않는다.
		 * 따라서 문자열로 입력을 받고, 
		 * 입력받은 문자에서 원하는 순번째 문자를 분리해서 사용해야 한다.
		 * java.lang.String에 charAt(int index)를 사용한다.
		 * index를 정수형으로 입력하면 문자열에서 해당인덱스에 있는 한 문자를 
		 * 문자형으로 반환해주는 기능을 한다. 
		 * 
		 * ex) 문자열 : helloworld
		 * 			  0123456789
		 * 	입력 받은 문자열에서 문자 'w'를 가져오기
		 * 		sc.charAt(5);
		 * index - 0부터 시작하는 숫자 체계이며 컴퓨터에서 주로 사용하는 방식
		 * 만약 존재하디 않는 인덱스를 입력하게 되면 IndexOutOfBoundsException 에러발생
		 */
		sc.nextLine(); 	// 위에 논리형 출력값 초기화
		System.out.print("아무 문자나 입력 해주세요 : ");
		char ch = sc.nextLine().charAt(0);
		System.out.println("입력하신 문자는 " + ch + "입니다.");
		
		sc.close();
		
		
		
		
		
	}

}
