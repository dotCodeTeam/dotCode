package com.ohgiraffers.java.practice.eunseong.chap04controlFlow.section02.looping.basic;

public class Application1 {

    public static void main(String[] args) {

        /* 1부터 10까지 합계를 구하고 결과를 출력하세요
         *
         * -- 출력 예시 --
         * 1부터 10까지의 합 : 55
         * */

        Application1 a = new Application1();

        int sum2 = 0;

        int result = a.allAdd(sum2);

        System.out.println("1부터 10까지의 합은 : " + result + "입니다.");
    }

    public int allAdd(int sum) {

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

        return sum;

    }
}
