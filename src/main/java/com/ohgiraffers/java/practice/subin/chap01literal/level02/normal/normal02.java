package com.ohgiraffers.java.practice.subin.chap01literal.level02.normal;

public class normal02 {
    public static void main(String[] args) {

        /* 국어점수 80.5점, 수학점수 50.6점, 영어점수 70.8점을 실수 형태로 저장한 뒤
         * 총점과 평균을 정수 형태로 출력하세요
         *
         * -- 출력 예시 --
         * 총점 : 201
         * 평균 : 67
         *  */

        float a = 80.5f;
        float b = 50.6f;
        float c = 70.8f;

        long sum = (long)(a + b + c);
        long avg = (sum / 3);

        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + avg);
    }
}
