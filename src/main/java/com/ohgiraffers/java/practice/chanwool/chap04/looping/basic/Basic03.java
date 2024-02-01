package com.ohgiraffers.java.practice.chanwool.chap04.looping.basic;

import java.util.Scanner;

public class Basic03 {
    public static void main(String[] args) {

        /* 1부터 입력받은 정수까지의 짝수의 합을 구하세요
         *
         * -- 입력 예시 --
         * 정수를 입력하세요 : 10
         *
         * -- 출력 예시 --
         * 1부터 10까지 짝수의 합 : 30
         * */

        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int endNum = sc.nextInt();
//        System.out.print("시작할 숫자 : ");
//        int start = sc.nextInt();
        int result = 0;
        int start = 1;
        int startSave = start;

        for(int i = start ; i <= endNum ; i++) {
            if ( i % 2 == 0 ) {
                result += i ;
                System.out.println("값 도출 중..." + result);
            }
        }
        System.out.println(startSave + "부터"+endNum+" 까지 짝수의 합 : " + result);
    }
}
