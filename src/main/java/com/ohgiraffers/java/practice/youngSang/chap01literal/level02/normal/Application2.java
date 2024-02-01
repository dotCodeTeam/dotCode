package com.ohgiraffers.java.practice.youngSang.chap01literal.level02.normal;

public class Application2 {
	
	public static void main(String[] args) {
		
		/* 국어점수 80.5점, 수학점수 50.6점, 영어점수 70.8점을 실수 형태로 저장한 뒤
		 * 총점과 평균을 정수 형태로 출력하세요
		 * 
		 * -- 출력 예시 --
		 * 총점 : 201
		 * 평균 : 67
		 *  */

		// a = 국어점수, b = 수학점수, c = 영어점수
		double a;
		double b;
		double c;
		a = 80.5;
		b = 50.6;
		c = 70.8;
		int aa = (int) a;
		int bb = (int) b;
		int cc = (int) c;

		System.out.println("총점 : " + (aa + bb + cc));
		System.out.println("평균 : " + ((aa + bb + cc)/3));

	}
}
