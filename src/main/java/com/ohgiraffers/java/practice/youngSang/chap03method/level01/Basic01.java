package com.ohgiraffers.java.practice.youngSang;

import java.util.Scanner;

public class Basic01 {
    public void yangSu() {

        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 하나 입력하세요 : ");
        int num = sc.nextInt();

        if(num >= 0) {
            System.out.println("양수입니다.");
        }
        if (num <= -1) {
            System.out.println("양수가 아닙니다.");
        }


    }
}
