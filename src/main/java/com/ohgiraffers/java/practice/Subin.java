package com.ohgiraffers.java.practice;

public class Subin {
    public static void main(String[] args) {

        /* 증감 연산자를 단항으로 사용하여 정수 a와 b를 출력 한 뒤
         * 기존 a = 23; / b = 24;
         * 증감 연산자를 240129일자에 배운 다른 연산자와 사용하여 result 와 firstNum/secondNum을 출력하시오
         * 참고 int num = 30;
         */
        int a = 23;
        int b = 24;
        ++a;
        --b;
        System.out.println("a = " + a );
        System.out.println("b = " + b );

        final int NUM = 30;
        int result1 = 0;
        int result2 = 0;
        int firstNum = 0;
        int secondNum = 0;

        result1 *= NUM;
        result2 += NUM;

        /* ======= 출력 내용 =======
            a = 24
            b = 23
            result1 = 90
            firstNum = 31
            result2 = 93
            secondNum = 31
         */

    }
}