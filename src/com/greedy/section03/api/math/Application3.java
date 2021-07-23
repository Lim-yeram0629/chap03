package com.greedy.section03.api.math;

import java.util.Random;

public class Application3 {
	
	public static void main(String[] args) {
		
		/* java.util.Random 클래스
		 * nextInt(int bound): 0부터 매개변수로 전달받은 정수 범위까지의 난수 발생(정수 반환)
		 *
		 * 원하는 범위의 난수를 구하는 공식
		 * random.nextInt(구하려는 난수의 개수) + 구하려는 난수의 최소값
		 */
		
		Random random = new Random();
		// 0~9까지의 난수 발생
		int randomNumber1 = random.nextInt(10);
		System.out.println("0부터 9까지의 난수: " + randomNumber1);

		// 1 ~ 10
		int randomNumber2 = random.nextInt(10) + 1;
		System.out.println("1부터 9까지의 난수: " + randomNumber2);
		
		// 20 ~ 45
		int randomNumber3 = random.nextInt(26) + 20;
		System.out.println("20부터 45까지의 난수: " + randomNumber3);
		
		// -128 ~ 127
		//int randomNumber4 = random.nextInt(256) + -128;
		// 재사용 하지 않을 시, 객체 생성 없이 호출 가능
		int randomNumber4 = new Random().nextInt(256) + -128;
		System.out.println("-128부터 127까지의 난수: " + randomNumber4);
		
		
		
		
		
	}

}
