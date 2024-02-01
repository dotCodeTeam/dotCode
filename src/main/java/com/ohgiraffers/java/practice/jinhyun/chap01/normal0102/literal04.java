package com.ohgiraffers.java.practice.jinhyun.chap01.normal0102;

public class literal04 {

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

        int q = (int) (a + b + c);
        int w = (int) q / 3;

        System.out.println("총점 : " + q);
        System.out.println("평균 : " + w);
    }


}
