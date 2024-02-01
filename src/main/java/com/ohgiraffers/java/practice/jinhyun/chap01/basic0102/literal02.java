package com.ohgiraffers.java.practice.jinhyun.chap01.basic0102;

public class literal02 {
    public static void main(String[] args) {

        /* 사각형의 넓이와 둘레를 구하는 문제이다.
         * 너비 12.5 높이 36.4를 변수에 저장하고
         * 각 넓이와 둘레를 계산해 변수에 담고 아래와 같이 출력되도록 하시오
         *
         * -- 출력 예시 --
         * 면적 : 455.0
         * 둘레 : 97.8
         *  */

        double a = 12.5;
        double b = 36.4;

        System.out.println("면적 : " + (a * b));
        System.out.println("둘레 : " + ((a + b) * 2));
    }
}
