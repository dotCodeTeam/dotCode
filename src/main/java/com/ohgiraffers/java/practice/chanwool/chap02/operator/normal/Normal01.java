package com.ohgiraffers.java.practice.chanwool.chap02.operator.normal;

public class Normal01 {
    public static void main(String[] args) {

//        double score = 90.5;               //     출력결과 : A
//        double score = 86.3;               //     출력결과 : B
//        double score = 77.7;               //     출력결과 : C
//        double score = 64.5;               //     출력결과 : D

        double score = 50.2;
        long scoreInt = (long) score;
        System.out.println(scoreInt);

        String grade = (scoreInt>=90) ? "A" : (scoreInt>=80) ? "B" : (scoreInt>=70) ? "C" : (scoreInt>=60) ? "D" : "F";
        System.out.println(grade);           // 출력결과 : F
    }
}
