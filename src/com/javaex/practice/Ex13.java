package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//a(출력값)=w원화(입력값)*d(1230.95)
		System.out.print("환전할 원화를 입력하세요: ");
		
		double w = sc.nextDouble(); //입력값 
		final double d = 1230.95; 
		double a = w/d; //원화를 환율로 나눔 =계산값
		
		
		
		System.out.println("받으실 달러는 "+ a); //최종 출력값
		
		
		sc.close();
		
		
		
		
		
	}
}
