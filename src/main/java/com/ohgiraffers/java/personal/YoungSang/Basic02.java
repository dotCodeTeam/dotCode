package com.ohgiraffers.java.personal.YoungSang;

import java.util.Scanner;

public class Basic02 {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 하나 입력하세요 :");
        int num = sc.nextInt();

        if (num % 2 != 0) {
            System.out.println("홀수");

        } else {
            System.out.println("짝수");
        }


    }
}
