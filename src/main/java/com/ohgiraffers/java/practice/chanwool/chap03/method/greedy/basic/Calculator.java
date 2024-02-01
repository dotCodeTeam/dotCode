package com.ohgiraffers.java.practice.chanwool.chap03.method.greedy.basic;

public class Calculator {

    public void checkMethod(){
        System.out.println("메소드 호출 확인");
    }

    public int sum1to10(){
        int start = 1;
        int end = 10;
        int result = end*(start+end)/2;

        return result;
    }

    public void checkMaxNumber(int a, int b){
        int maxNumberOf = (a < b) ? b : a;
        System.out.println("두 수 중 큰 수는 " + maxNumberOf + "이다");
    }

    public int sumTwoNumber(int a, int b) {
        return a+b ;
    }

    public int minusTwoNumber(int a, int b) {
        return a-b;
    }

}
