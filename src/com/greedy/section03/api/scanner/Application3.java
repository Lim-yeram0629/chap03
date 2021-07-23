package com.greedy.section03.api.scanner;

import java.util.Scanner;

public class Application3 {

	public static void main(String[] args) {
		/* 스캐너 주의 사항
		 * 스캐너의 next 메소드들은 입력한 내용을 버퍼로부터 토큰단위(공백기준)로 분리해서 읽어온다.
		 * 그래서 크게 두 가지 사항을 주의 해야한다.
		 * 1. next()로 문자열 입력 받은 후 정수, 실수,  논리값 입력받을 때
		 * 2. 정수, 실수, 논리값 입력 후 next()로 문자열 입력받을 때
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력해주세요: ");
		String str1 = sc.next();
		// String str2 = sc.next();
		System.out.println("str1 : " + str1);
		// System.out.println("str2 : " + str2);
		
		System.out.print("숫자를 입력해주세요: ");
		int num1 = sc.nextInt();
		System.out.println("num1 : " + num1);
		
		// 2. 정수, 실수, 논리값 입력 후 nextLine()로 문자열 입력 받을 떄
		System.out.print("다시 숫자를 입력해주세요: ");
		int num2 = sc.nextInt();
		System.out.println("num2 : " + num2);
		
		System.out.print("공백이 있는 문자열을 하나 입력해주세요 : ");
		sc.nextLine();
		String str2 = sc.nextLine();
		System.out.println("str2 : " + str2);
		

	}

}
