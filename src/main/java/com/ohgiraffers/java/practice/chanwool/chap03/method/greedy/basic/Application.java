package com.ohgiraffers.java.practice.chanwool.chap03.method.greedy.basic;

import com.ohgiraffers.java.practice.chanwool.chap03.method.greedy.basic.Calculator;

public class Application {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.checkMethod();
        int arSeq = calc.sum1to10();
        System.out.println("1부터 10까지의 합 : " + arSeq);
        calc.checkMaxNumber(10,20);

        int sum = calc.sumTwoNumber(10,20);
        int min = calc.minusTwoNumber(10,5);

        System.out.println("10과 20의 합은 : "+sum);
        System.out.println("10과 5의 차는 : "+min);
    }
}
