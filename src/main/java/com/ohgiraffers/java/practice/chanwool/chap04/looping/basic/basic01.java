package com.ohgiraffers.java.practice.chanwool.chap04.looping.basic;

import java.util.Scanner;

public class basic01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /* 1부터 10까지 합계를 구하고 결과를 출력하세요
         *
         * -- 출력 예시 --
         * 1부터 10까지의 합 : 55
         * */

//        int start = 1;
        System.out.print("시작 : ");
        int start = sc.nextInt();
//        int end = 10;
        System.out.print("끝 : ");
        int end = sc.nextInt();
        int result = 0;

        if ( start < end ) {
            for (int i = start; i <= end ; i++ )   {
                result += i;
            }
            System.out.println(start + "부터 " + end + "까지의 합 : " + result);
        }   else    {
            System.out.println("끝 수가 더 커야합니다.");
        }
    }
}
