package com.ohgiraffers.java.practice.subin.chap02operator.level01.basic;

public class basic01 {
    public static void main(String[] args) {

        /* 두 개의 정수형 변수를 선언하고, 삼항 연산자를 사용하여
         * 두 수 중 큰 수를 출력하는 프로그램을 작성해본다.
         *
         *
         * -- 출력 예시 --
         *
         * 두 수 중 큰 수는 20입니다.
         *
         * */

        int a = 10;
        int b = 20;
        int largerNum = (a > b) ? a : b;
        System.out.println("두 수 중 큰 수는 " + largerNum + " 입니다.");


    }
}
