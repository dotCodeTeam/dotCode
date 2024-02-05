package com.ohgiraffers.java.practice.subin.chap02operator.level02.normal;

import java.util.Scanner;

public class normal01 {
    public static void main(String[] args) {

        /* 실수를 변수로 선언하여 점수를 저장하고,
         * 이를 정수로 변환하여 점수가 90점 이상이면 "A",
         * 80점 이상이면 "B", 70점 이상이면 "C", 60점 이상이면 "D",
         * 60점 미만이면 "F"를 출력하는 프로그램을 작성해본다.
         *
         * -- 출력 예시 --
         *
         * 홍길동의 이번 점수등급은 B입니다.
         *
         * */

        // 실수로 선언된 점수 변수
        double score = 85.5;  // 여기에 원하는 실수값을 넣어주세요.

        // 정수로 변환하여 등급 판별
        int intScore = (int) score; // 소수점 이하를 버리고 정수로 변환
        String grade;

        if (intScore >= 90) {
            grade = "A";
        } else if (intScore >= 80) {
            grade = "B";
        } else if (intScore >= 70) {
            grade = "C";
        } else if (intScore >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        // 결과 출력
        System.out.println("홍길동의 이번 점수등급은 " + grade + "입니다.");
    }
}
