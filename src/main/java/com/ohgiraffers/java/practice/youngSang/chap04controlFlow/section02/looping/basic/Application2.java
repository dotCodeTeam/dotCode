package com.ohgiraffers.java.practice.youngSang.chap04controlFlow.section02.looping.basic;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /* 정수 한 개를 입력 받고, 1부터 입력 받은 정수까지의 합을 계산해서 출력하세요
         *
         * -- 입력 예시 --
         * 정수를 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 1부터 5까지의 합 : 15
         *
         * */

Application2 a = new Application2();
a.test();
    }
    public void test(){

        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력해 주세요 : ");
        int num= sc.nextInt();

        int sum = 0; // 합계 저장 변수 초기화

        for (int i = 1; i <= num; i++) {
            sum += i; // 1부터 10까지 더하기
        }
        System.out.println("1부터 사용자가 원하는 숫자까지의 합 :" + sum); // 결과

    }
}
