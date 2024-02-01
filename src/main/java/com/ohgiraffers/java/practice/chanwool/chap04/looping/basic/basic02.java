package com.ohgiraffers.java.practice.chanwool.chap04.looping.basic;

import java.util.Scanner;

public class basic02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /* 정수 한 개를 입력 받고, 1부터 입력 받은 정수까지의 합을 계산해서 출력하세요
         *
         * -- 입력 예시 --
         * 정수를 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 1부터 5까지의 합 : 15
         *
         * */

        System.out.println("정수를 입력하세요 : ");
        int num = sc.nextInt();
        int result = 0;

        for ( int i = 1; i <= num; i++ ) {
            result += i;
        }

    }
}
