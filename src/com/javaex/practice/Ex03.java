package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		
		int x=4;
		int y=3;
		
		int a = ++x *3; 
		int b = y++ *2; 
		
		System.out.println("a"+a); //출력전 1증가 후 2곱한후 출력 --> 15
		System.out.println("b"+b); //최종 출력값 = y값에서 2곱함 --> 6
		System.out.println("x"+x); //출력값을 묻는거니까 원래값에서 1증가한 값 -->5
		System.out.println("y"+y); //출력값을 묻는거니까 원래값에서 1증가한 값 -->4
		
	}
}
