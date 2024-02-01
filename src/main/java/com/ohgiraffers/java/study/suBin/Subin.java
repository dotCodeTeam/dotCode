package com.ohgiraffers.java.study.suBin;

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
        
        // 24.02.01 배열문제
        // 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여 순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
        //
        //ex.
        //1 2 3 4 5 6 7 8 9 10

    }
}