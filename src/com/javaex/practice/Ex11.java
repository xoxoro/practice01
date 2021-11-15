package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("월급을 입력하세요:");
		int a = sc.nextInt();//월급
		int b = a*120;
		
		
		System.out.println("10년동안 최대 저축액은 "+b+"원"+ " 입니다.");//한달 저축액 200원..?
		
		
		
		
		sc.close();
		
	}
}
