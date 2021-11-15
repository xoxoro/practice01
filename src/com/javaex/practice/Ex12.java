package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args){
		
		//반지름을 입력하세요 : 3
		//원의 넓이는 28.26 = ∏r^2
		//파이값은 3.14 상수로 지정 -->값은 선언시에만 저장할 수 있고 변경할 수 없음. 
		//final double PI = 3.14;
		//system.out.println(PI);
		//PI = 5; 원주율을 임의의 x로 변경안됨
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("반지름을 입력하세요:");
		final double PI = 3.14;
		double r = sc.nextDouble();
		double v = PI*(r*r);
		
		
		System.out.println("원의 넓이는 "+PI*v+" 입니다.");
	
		
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
