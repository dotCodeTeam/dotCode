package com.ohgiraffers.java.practice.chanwool.chap01.literal.basic;

public class Basic02 {
    public static void main(String[] args) {

        float width = 12.5f;
        // double width = 12.5;
        float height = 36.4f;
        // double height = 36.4;
        float sum = width + height;
        // double sum = width + height;
        float multi = width * height;
        // double multi = width * height;

        System.out.println("-- 출력 예시 --");
        System.out.println("면적 : "+ multi); // float을 쓰니 연산결과에 소수점이 전부 노출됨
        System.out.println("둘레 : "+ (sum*2));

    }
}
