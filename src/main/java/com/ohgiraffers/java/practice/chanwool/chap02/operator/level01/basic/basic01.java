package com.ohgiraffers.java.practice.chanwool.chap02.operator.level01.basic;

public class basic01 {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        String bigger = (num1 < num2) ? "두 수 중 큰 수는 20 입니다" : "false" ;
        System.out.println(bigger);

//      int result = (num1 < num2) ? num2 : num1;
//      System.out.println("두 수 중 큰 수는 " + result + "입니다");
    }
}
