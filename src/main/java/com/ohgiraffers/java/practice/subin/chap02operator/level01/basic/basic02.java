package com.ohgiraffers.java.practice.subin.chap02operator.level01.basic;

import java.util.Scanner;

public class basic02 {
    public static void main(String[] args) {

        /* 정수형 변수를 선언하여 점수를 저장하고,
         * 삼항 연산자를 사용하여 점수가 60점 이상이면 “합격입니다”,
         * 그렇지 않으면 “아쉽지만 불합격입니다.” 을 출력하는 프로그램을 작성해본다.
         *
         *
         * -- 출력 예시 --
         *
         * 합격입니다~~!!! 또는 아쉽지만 불합격입니다..
         *
         * */
        Scanner sc = new Scanner(System.in);
        int score = 0;
        System.out.println("점수를 입력하세요 : ");
        score = sc.nextInt();


        if (score >= 60) {
            System.out.println("합격입니다.");
        } else {
            System.out.println("아쉽지만 불합격입니다.");
        }
        System.out.println();

    }
}
